package br.com.servicetester;

import java.util.List;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import br.com.servicetester.adapter.AdapterLista;
import br.com.servicetester.asynctask.Servico;
import br.com.servicetester.asynctask.ServicoAsyncTask;
import br.com.servicetester.callback.OnTaskComplete;

@SuppressLint("NewApi")
public class ListServiceActivity extends Activity implements OnItemClickListener, OnTaskComplete {

	private ProgressDialog dialog;

	private ListView tipoServicos;
	private Servico servicoSelecionado;
	private List<Servico> servicos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activty_listservice);

		recarregarListaServicos();

		carregarLista();

		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);

	}

	private void recarregarListaServicos() {
		servicos = Servico.buscarServicos();
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	private void carregarLista() {
		AdapterLista adapter = new AdapterLista(this, R.layout.custom_listrow, servicos);

		tipoServicos = (ListView) findViewById(R.id.lst_services);
		tipoServicos.setAdapter(adapter);

		tipoServicos.setOnItemClickListener(this);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;

		case R.id.action_refresh:
			recarregarListaServicos();
			carregarLista();
			return true;

		default:
			return super.onContextItemSelected((android.view.MenuItem) item);
		}
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

		servicoSelecionado = servicos.get(position);

		dialog = ProgressDialog.show(this, servicoSelecionado.getNomeService(), 	getResources().getString(R.string.testando), false);
		new ServicoAsyncTask(this, dialog).execute(servicoSelecionado);
	}

	@Override
	public void onComplete(Servico servico) {
		carregarLista();
	}

}
