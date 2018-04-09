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
//		servicos.add(new Servico("Locais Próximos sem Tipo",ConstantsURL.LOCAIS_PROXIMOS_SEM_TIPO, NAO_TESTADO));
		
		//Pessoa
//		servicos.add(new Servico("Buscar Pessoa por ID",ConstantsURL.PESSOA_BUSCAR_ID, NAO_TESTADO));
//		servicos.add(new Servico("Buscar Pessoa por Login",ConstantsURL.PESSOA_BUSCAR_LOGIN, NAO_TESTADO));

		//Solicitação
		servicos.add(new Servico("Tipo de Solicitação",ConstantsURL.SOLICITACOES_TIPOS, NAO_TESTADO));
		servicos.add(new Servico("Solicitações Próximas",ConstantsURL.SOLICITACOES_PROXIMAS, NAO_TESTADO));
		servicos.add(new Servico("Solicitações Próximas sem Tipo",ConstantsURL.SOLICITACOES_PROXIMAS_SEM_TIPO, NAO_TESTADO));
		servicos.add(new Servico("Minhas Solicitações",ConstantsURL.SOLICITACOES_MINHAS_SOLICITACOES, NAO_TESTADO));
		servicos.add(new Servico("Buscar Solicitação",ConstantsURL.SERVICO_BUSCAR_SOLICITACAO, NAO_TESTADO));
		servicos.add(new Servico("Serviço: Tipo de Solicitação",ConstantsURL.SERVICO_TIPO_SOLICITACAO, NAO_TESTADO));
		servicos.add(new Servico("Buscar Status da Solicitação",ConstantsURL.SERVICO_BUSCAR_STATUS, NAO_TESTADO));
		
		//Formulários
		servicos.add(new Servico("Buscar Formulário",ConstantsURL.SERVICO_BUSCAR_FORMULARIO, NAO_TESTADO));
//		servicos.add(new Servico("Buscar Formulário (Registro)",ConstantsURL.SERVICO_BUSCAR_FORMULARIO_REGISTRO, NAO_TESTADO));

		//Usuários
		servicos.add(new Servico("Buscar Usuários",ConstantsURL.SERVICO_BUSCAR_USUARIOS, NAO_TESTADO));
		servicos.add(new Servico("Serviço de Login",ConstantsURL.SERVICO_LOGIN, NAO_TESTADO));
		
		servicos.add(new Servico("Meio de Comunicação",ConstantsURL.SERVICO_MEIO_COMUNICACAO, NAO_TESTADO));
		
		
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