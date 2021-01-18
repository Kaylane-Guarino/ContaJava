package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito > 0) {
			saldo += valorDeposito;
		}
		else {
			System.out.println("O valor deve ser maior que zero!");
		}
		
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo:" + saldo);
		System.out.println("saldo + Limite:" + (saldo + chequeEspecial));
	}

	public double getSaldo() {
		return saldo;
	}

	/* void = vazio */
	public void sacar(double valorDoSaque) {

		if ((saldo + chequeEspecial) >= valorDoSaque){
			saldo -= valorDoSaque;
		}
		else {
			System.out.println("Saldo Insuficiente!");
		}

	}
	
	public void transferir() {
		
	}

}
