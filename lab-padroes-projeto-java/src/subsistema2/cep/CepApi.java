package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	
	public String recuperarCidade(String cep) {
		return "S�O PAULO";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}

	public String recuperarEndereco(String cep) { // endere�o
		// TODO Auto-generated method stub
		return "Rua Eloi Cerqueira, n. 155";
	}
}
