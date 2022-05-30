package subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String endereco, String cep, String cidade, String estado) {
		System.out.println("CLIENTE SALVO NO SISTEMA DE CRM : ");
		System.out.println("NOME    : " +nome);
		System.out.println("ENDEREÇO: " +endereco);
		System.out.println("CEP     : " +cep); 
		System.out.println("CIDADE  : " +cidade);
		System.out.println("ESTADO  : " +estado);
	}
}