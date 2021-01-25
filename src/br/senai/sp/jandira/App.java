package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		Conta conta1;
		Conta conta2;

		conta1 = new Conta();
		conta2 = new Conta();

		//Conta da Ana Maria
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Ana Maria");
		cliente1.setCep("0667-080");
		cliente1.setCpf("465.853.777.02");
		cliente1.setTelefone("(11)94002-8922");

		conta1.setNumero("111-0");
		conta1.setTitular(cliente1);
		conta1.setTipo("Corrente");
		conta1.setAtiva(conta1.isAtiva());
		conta1.depositar(100);
		conta1.consultarSaldo();
		conta1.depositar(300);
		conta1.consultarSaldo();
		conta1.depositar(-50);
		conta1.consultarSaldo();
		
		//conta do Pedro
		Cliente cliente2 = new Cliente();
		conta2.setNumero("222-0");
		conta2.setTitular(cliente2);
		conta2.setTipo("Poupança");
		conta2.setAtiva(conta2.isAtiva());
		
	}

}
