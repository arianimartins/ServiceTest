package br.com.servicetester.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.servicetester.R;
import br.com.servicetester.asynctask.Servico;

public class AdapterLista extends ArrayAdapter<Servico> {

	private Context context;
	private int idLayout;

	private List<Servico> servicos;


	public AdapterLista(Context context, int textViewResourceId, List<Servico> servicos) {
		super(context, textViewResourceId, servicos);
		this.context = context;
		this.idLayout = textViewResourceId;
		this.servicos = servicos;
	}

	@Override
	public View getDropDownView(int position, View convertView,ViewGroup parent){
		return getCustomView(position, convertView, parent);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return getCustomView(position, convertView, parent);
	}


	public View getCustomView(int position, View convertView, ViewGroup parent){
		View row = convertView;
		LayoutInflater inflater = (LayoutInflater)
				context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflater.inflate(idLayout, parent, false);


		Servico servico = servicos.get(position);
		TextView nomeServico = (TextView) row.findViewById(R.id.titulo_servico);
		ImageView imgStatus = (ImageView) row.findViewById(R.id.image_status);

		switch (servico.getStatus()) {
		case Servico.OK:
			imgStatus.setImageResource(R.drawable.bulletgreen);
			break;

		case Servico.ERRO:
			imgStatus.setImageResource(R.drawable.bulletred);
			break;

		case Servico.NAO_TESTADO:
			imgStatus.setImageResource(R.drawable.bulletgrey);
			break;

		default:
			break;
		}


		nomeServico.setText(servico.getNomeService());
		row.setTag(servico);

		return row;
	}




}