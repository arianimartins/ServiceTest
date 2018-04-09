package br.com.servicetester.urls;

public class ConstantsURL {
	
	public final static String URL_PORTAL = "http://portal156.callsp.inf.br:" + "6060";
	
	//POST
	//SMS
	public final static String SMS_ENVIO = URL_PORTAL + "/administrativo-ws/sms";
	
	//CADASTRO DE USUARIO
	public final static String PESSOA_CADASTRO = URL_PORTAL + "/seguranca-ws/pessoas";
	
	//LOGIN DE USUARIO
	public final static String LOGIN = URL_PORTAL + "/seguranca-ws/";
	
	//GET
	//BUSCAR PESSOA
	public final static String PESSOA_BUSCAR_ID = URL_PORTAL + "/seguranca-ws/pessoas/%s";
	public final static String PESSOA_BUSCAR_LOGIN = URL_PORTAL + "/seguranca-ws/usuarios/login/%s";
	
	//RESET DE SENHA
	public final static String RESET_SENHA = URL_PORTAL + "/seguranca-ws/usuarios/%s/resetsenha";
	
	//SOLICITACOES
	public final static String SOLICITACOES_TIPOS = URL_PORTAL + "/resolucao-ws/tipos-solicitacao?page=1&pageSize=15&locale=PORTUGUES";
	public final static String SOLICITACOES_PROXIMAS = URL_PORTAL + "/resolucao-ws/solicitacoes/proximas?latitude=-23.5467034&longitude=-46.607798&perimetroMetros=5000&idTipoSolicitacao=1";
	public final static String SOLICITACOES_PROXIMAS_SEM_TIPO = URL_PORTAL + "/resolucao-ws/solicitacoes/proximas?latitude=-23.5467034&longitude=-46.607798&perimetroMetros=500";
	public final static String SOLICITACOES_MINHAS_SOLICITACOES = URL_PORTAL + "/resolucao-ws/minhas/solicitacoes/";
	// FIM
	
	// LOCAIS
	public final static String LOCAIS_TIPOS = URL_PORTAL + "/localizacao-ws/locais/tipos";
	public final static String LOCAIS_PROXIMOS = URL_PORTAL + "/localizacao-ws/locais/buscarProximidadeLocal?ponto=%s&perimetroMetros=1000&tipo=%s&page=1&pageSize=1000000";
	public final static String LOCAIS_PROXIMOS_SEM_TIPO = URL_PORTAL + "/localizacao-ws/locais/buscarProximidadeLocal?ponto=%s&perimetroMetros=1000&page=1&pageSize=1000000";
	
	// FORMULARIOS
	public final static String SERVICO_BUSCAR_FORMULARIO = URL_PORTAL + "/administrativo-ws/formularios/";
	public final static String SERVICO_BUSCAR_FORMULARIO_REGISTRO = URL_PORTAL + "/administrativo-ws/formularios/%s/registros/%s";
	public final static String SERVICO_SALVAR_FORMULARIO = URL_PORTAL + "/administrativo-ws/formularios/componentes";

	// SOLICITACOES
	public final static String SERVICO_BUSCAR_SOLICITACAO = URL_PORTAL + "/resolucao-ws/solicitacoes/";
	
	public final static String SERVICO_ATRIBUIR_SOLICITACAO = URL_PORTAL + "/resolucao-ws/solicitacoes/%s/atribuir-solicitacao";
	public final static String SERVICO_DESATRIBUIR_SOLICITACAO = URL_PORTAL + "/resolucao-ws/solicitacoes/%s/desatribuir-solicitacao";
	public final static String SERVICO_SOLICITACOES_RECEBIDAS = URL_PORTAL + "/resolucao-ws/solicitacoes/recebidas";// GET
	public final static String SERVICO_SOLICITACOES_ORFAS = URL_PORTAL + "/resolucao-ws/solicitacoes/orfas";// GET
	public final static String SERVICO_SOLICITACOES_ATRIBUIDAS = URL_PORTAL + "/resolucao-ws/solicitacoes/atribuidas";// GET
	public final static String SERVICO_TIPO_SOLICITACAO = URL_PORTAL + "/resolucao-ws/tipos-solicitacao";
	
	// HISTORICO SOLICITACAO
	public final static String SALVAR_HISTORICO_SOLICITACAO = URL_PORTAL + "/resolucao-ws/solicitacoes/%s/historico";
	
	// STATUS SOLICITACAO
	public final static String SERVICO_BUSCAR_STATUS = URL_PORTAL + "/resolucao-ws/status-solicitacao";
	
	// USUARIOS
	public final static String SERVICO_BUSCAR_USUARIOS = URL_PORTAL + "/seguranca-ws/usuarios";
	public final static String SERVICO_LOGIN = URL_PORTAL + "/seguranca-ws/";
	
	// MEIO COMUNICACAO
	public final static String SERVICO_MEIO_COMUNICACAO = URL_PORTAL + "/conteudo-ws/meioComunicacao/";
	
	// TOKEN
	public final static String TOKEN_APLICACAO = "auth/HT9vwxwDSxoMij2JSwgcsg";

}