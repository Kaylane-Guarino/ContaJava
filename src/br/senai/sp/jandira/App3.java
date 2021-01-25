package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App3 {
    public static void main(String[]args) {


        //Criação Cliente
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro Alvares Cabral");
        pedro.setCpf("123456789");
        pedro.setTelefone("(11)912345678");
        pedro.setCep("06664080");

        //Criar da conta do Pedro
        Conta contaPedro = new Conta();
        contaPedro.setTitular(pedro);
        contaPedro.depositar(100);
        contaPedro.setNumero("2222-2");

        System.out.println(contaPedro.getTitular().getTelefone());
        System.out.println(contaPedro.getTitular().getNome());
        contaPedro.getTitular().setNome("Pedro da Silva");
        System.out.println(contaPedro.getTitular().getNome());
        System.out.println(pedro.getNome());

    }

}
