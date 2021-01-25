package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {
    public static void main(String[]args){
        Conta contaDaAnaGomes = new Conta();
        Conta contaDoJoao = new Conta();
        Cliente anaGomes = new Cliente();


        contaDaAnaGomes.setTitular (anaGomes);
        contaDaAnaGomes.setNumero("111-98");
        contaDaAnaGomes.setTipo ("Poupança");
        contaDaAnaGomes.setAtiva (true);
        contaDaAnaGomes.setChequeEspecial(200);
        contaDaAnaGomes.depositar(100);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.depositar(30);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.sacar(50);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.sacar(500);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.sacar(50);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.sacar(80);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.depositar(100);
        contaDaAnaGomes.consultarSaldo();
        contaDaAnaGomes.getSaldo();

        double a = contaDaAnaGomes.getSaldo();
        System.out.println("****" + contaDaAnaGomes.getSaldo());

        System.out.println("Nome: " + contaDaAnaGomes.getTitular());
        System.out.println("Tipo: " + contaDaAnaGomes.getTipo());
        System.out.println("Conta: " + contaDaAnaGomes.getNumero());
        System.out.println("Limite: " + contaDaAnaGomes.getChequeEspecial());

        Cliente cliente = new Cliente();
    }

}
