package tiposconta;

import entidades.Cliente;
import escopo.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===extrato conta corrente=== ");
		super.imprimirInfoComuns();

	}

}