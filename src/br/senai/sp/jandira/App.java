package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
	
		Conta contaDaMaria = new Conta();
		Conta contaDoJoao = new Conta();
		
		
		contaDaMaria.numero = "100-98";
		contaDaMaria.titular = "Maria Rui Costa";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 300.0;
		
		contaDoJoao.numero = "300-87";
		contaDoJoao.titular = "João Rui Limão";
		contaDoJoao.tipoConta = "corrente";
		contaDoJoao.saldo = 900.0;
		
		contaDaMaria.exibirDadosDaConta();
		System.out.println();
		contaDoJoao.exibirDadosDaConta();
		
		contaDaMaria.depostar(50);
		contaDaMaria.exibirDadosDaConta();
		
		System.out.println();
		
		contaDaMaria.sacar(400);
		contaDaMaria.exibirDadosDaConta();
		
		contaDaMaria.depostar(800);
		contaDaMaria.exibirDadosDaConta();
	}

}
