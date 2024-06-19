package desafio_dio_banco;

public class Main {
	public static void main(String[] args) {
		Cliente Matheus = new Cliente();
		Matheus.setNome("Matheus");
		Conta cc = new ContaCorrente(Matheus);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(Matheus);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
