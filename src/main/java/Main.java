
public class Main {
	public static void main(String[]args) {
		
		Cliente caique = new Cliente();
		caique.setNome("Caique");
		
		Conta cc = new ContaCorrente(caique);
		Conta poupanca = new ContaPoupanca(caique);
			
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}
}
	