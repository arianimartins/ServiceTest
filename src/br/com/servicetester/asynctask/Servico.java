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
//		servicos.add(new Servico("Locais Pr�ximos sem Tipo",ConstantsURL.LOCAIS_PROXIMOS_SEM_TIPO, NAO_TESTADO));
		
		//Pessoa
//		servicos.add(new Servico("Buscar Pessoa por ID",ConstantsURL.PESSOA_BUSCAR_ID, NAO_TESTADO));
//		servicos.add(new Servico("Buscar Pessoa por Login",ConstantsURL.PESSOA_BUSCAR_LOGIN, NAO_TESTADO));

		//Solicita��o
		servicos.add(new Servico("Tipo de Solicita��o",ConstantsURL.SOLICITACOES_TIPOS, NAO_TESTADO));
		servicos.add(new Servico("Solicita��es Pr�ximas",ConstantsURL.SOLICITACOES_PROXIMAS, NAO_TESTADO));
		servicos.add(new Servico("Solicita��es Pr�ximas sem Tipo",ConstantsURL.SOLICITACOES_PROXIMAS_SEM_TIPO, NAO_TESTADO));
		servicos.add(new Servico("Minhas Solicita��es",ConstantsURL.SOLICITACOES_MINHAS_SOLICITACOES, NAO_TESTADO));
		servicos.add(new Servico("Buscar Solicita��o",ConstantsURL.SERVICO_BUSCAR_SOLICITACAO, NAO_TESTADO));
		servicos.add(new Servico("Servi�o: Tipo de Solicita��o",ConstantsURL.SERVICO_TIPO_SOLICITACAO, NAO_TESTADO));
		servicos.add(new Servico("Buscar Status da Solicita��o",ConstantsURL.SERVICO_BUSCAR_STATUS, NAO_TESTADO));
		
		//Formul�rios
		servicos.add(new Servico("Buscar Formul�rio",ConstantsURL.SERVICO_BUSCAR_FORMULARIO, NAO_TESTADO));
//		servicos.add(new Servico("Buscar Formul�rio (Registro)",ConstantsURL.SERVICO_BUSCAR_FORMULARIO_REGISTRO, NAO_TESTADO));

		//Usu�rios
		servicos.add(new Servico("Buscar Usu�rios",ConstantsURL.SERVICO_BUSCAR_USUARIOS, NAO_TESTADO));
		servicos.add(new Servico("Servi�o de Login",ConstantsURL.SERVICO_LOGIN, NAO_TESTADO));
		
		servicos.add(new Servico("Meio de Comunica��o",ConstantsURL.SERVICO_MEIO_COMUNICACAO, NAO_TESTADO));
		
		
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