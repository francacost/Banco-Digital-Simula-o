package escopo;

import entidades.Cliente;

public abstract class Conta implements IConta {

	private static final int Agencia_Padrão = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numeroDaConta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Agencia_Padrão;
		this.numeroDaConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	protected void imprimirInfoComuns() {

		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroDaConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


}
