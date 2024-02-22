package tiposconta;

import entidades.Cliente;
import escopo.Conta;

public class ContaPoupança extends Conta {

	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===extrato conta Poupança=== ");
		super.imprimirInfoComuns();

	}

}
