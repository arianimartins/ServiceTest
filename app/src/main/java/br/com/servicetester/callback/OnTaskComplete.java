package br.com.servicetester.callback;

import br.com.servicetester.asynctask.Servico;

public interface OnTaskComplete {
	
	public void onComplete(Servico servico);

}
