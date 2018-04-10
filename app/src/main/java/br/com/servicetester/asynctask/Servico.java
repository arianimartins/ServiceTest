package br.com.servicetester.asynctask;

import java.util.ArrayList;
import java.util.List;

import br.com.servicetester.urls.ConstantsURL;

public class Servico {
	
	public static final int NAO_TESTADO = 0;
	public static final int ERRO = -1;
	public static final int OK = 1;
	
	private String nomeService;
	private String urlService;
	private int status;
	
	
	public Servico(String nomeService, String urlService, int status) {
		super();
		this.nomeService = nomeService;
		this.urlService = urlService;
		this.status = status;
	}


	public static List<Servico> buscarServicos(){
		List<Servico> servicos = new ArrayList<Servico>();
		
		//Locais
		servicos.add(new Servico("Tipo de Locais", ConstantsURL.LOCAIS_TIPOS, NAO_TESTADO));
//		servicos.add(new Servico("Locais Proximos sem Tipo",ConstantsURL.LOCAIS_PROXIMOS_SEM_TIPO, NAO_TESTADO));
		
		//Pessoa
//		servicos.add(new Servico("Buscar Pessoa por ID",ConstantsURL.PESSOA_BUSCAR_ID, NAO_TESTADO));
//		servicos.add(new Servico("Buscar Pessoa por Login",ConstantsURL.PESSOA_BUSCAR_LOGIN, NAO_TESTADO));

		//Solicitacao
		servicos.add(new Servico("Tipo de Solicitacao",ConstantsURL.SOLICITACOES_TIPOS, NAO_TESTADO));
		servicos.add(new Servico("Solicitacoes Proximas",ConstantsURL.SOLICITACOES_PROXIMAS, NAO_TESTADO));
		servicos.add(new Servico("Solicitacoes Proximas sem Tipo",ConstantsURL.SOLICITACOES_PROXIMAS_SEM_TIPO, NAO_TESTADO));
		servicos.add(new Servico("Minhas Solicitacoes",ConstantsURL.SOLICITACOES_MINHAS_SOLICITACOES, NAO_TESTADO));
		servicos.add(new Servico("Buscar Solicitacoes",ConstantsURL.SERVICO_BUSCAR_SOLICITACAO, NAO_TESTADO));
		servicos.add(new Servico("Servico: Tipo de Solicitacao",ConstantsURL.SERVICO_TIPO_SOLICITACAO, NAO_TESTADO));
		servicos.add(new Servico("Buscar Status da Solicitacao",ConstantsURL.SERVICO_BUSCAR_STATUS, NAO_TESTADO));
		
		//Formularios
		servicos.add(new Servico("Buscar Formulario",ConstantsURL.SERVICO_BUSCAR_FORMULARIO, NAO_TESTADO));
//		servicos.add(new Servico("Buscar Formulario (Registro)",ConstantsURL.SERVICO_BUSCAR_FORMULARIO_REGISTRO, NAO_TESTADO));

		//Usuarios
		servicos.add(new Servico("Buscar Usuarios",ConstantsURL.SERVICO_BUSCAR_USUARIOS, NAO_TESTADO));
		servicos.add(new Servico("Servico de Login",ConstantsURL.SERVICO_LOGIN, NAO_TESTADO));

		//Comunicacao
		servicos.add(new Servico("Meio de Comunicacao",ConstantsURL.SERVICO_MEIO_COMUNICACAO, NAO_TESTADO));
		
		
		return servicos;
	}
	

	public String getNomeService() {
		return nomeService;
	}
	public void setNomeService(String nomeService) {
		this.nomeService = nomeService;
	}

	public String getUrlService() {
		return urlService;
	}
	public void setUrlService(String urlService) {
		this.urlService = urlService;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}