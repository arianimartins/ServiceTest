package br.com.servicetester.service;

import br.com.servicetester.utils.ServiceUtils;

public class FormularioService {

	public int buscarServico(String url) {
		return new ServiceUtils().executarGet(url, null);
	}
}