package atendentevirtual;

import entidades.Cliente;
import escopo.Conta;
import tiposconta.ContaCorrente;
import tiposconta.ContaPoupança;

public class Operaçõesbancarias {

	public static void main(String[] args) {
		Cliente brenner = new Cliente();
		Cliente rubiana = new Cliente();
		
		Conta ccr = new ContaCorrente(brenner);
		Conta ccb = new ContaPoupança(rubiana);
		
		ccb.depositar(500);
		ccb.imprimirExtrato();
		
		ccr.depositar(500);
		ccr.imprimirExtrato();
		
		
		
		
		
	}

}
