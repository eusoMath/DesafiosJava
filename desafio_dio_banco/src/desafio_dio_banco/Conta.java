package desafio_dio_banco;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++ ;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: \t %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: \t %d", this.agencia));
		System.out.println(String.format("Numero: \t %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
