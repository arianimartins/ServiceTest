package br.com.servicetester.asynctask;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import br.com.servicetester.callback.OnTaskComplete;
import br.com.servicetester.service.FormularioService;


public class ServicoAsyncTask extends AsyncTask<Servico, Void, Servico> {
	private OnTaskComplete task;
	private ProgressDialog dialog;

	public ServicoAsyncTask(OnTaskComplete task, ProgressDialog dialog ) {
		super();
		this.task = task;
		this.dialog = dialog; 
	}

	@Override
	protected Servico doInBackground(Servico ... servicos) {
		Servico servico = servicos[0];
		servico.setStatus(new FormularioService().buscarServico(servico.getUrlService()));

		return servico;
	}

	@Override
	protected void onPostExecute(Servico servico){
		if(dialog != null){
			dialog.dismiss();
		}
		task.onComplete(servico);
	}
}
