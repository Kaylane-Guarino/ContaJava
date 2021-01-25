package br.senai.sp.jandira.model;

public class Conta {

	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTipo(String tipo){

		if (tipo.equals("Corrente") || tipo.equals("Poupança")) {
	}else {
			System.out.println("Tipo inválido!");
		}

	}

	public String getTipo() {

		return this.tipo;
	}

	public void setNumero(String numero){

		this.numero = numero;
	}

	public String getNumero() {

		return this.numero;
	}

	public void setChequeEspecial(double ChequeEspecial){

		this.chequeEspecial = chequeEspecial;
	}

	public double getChequeEspecial() {

		return this.chequeEspecial;
	}

	public void setAtiva(boolean ativa) {

		this.ativa = ativa;
	}

	public boolean isAtiva() {

		return this.ativa;
	}

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

