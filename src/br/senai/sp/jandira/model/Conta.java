package br.senai.sp.jandira.model;

public class Conta {
	
	public String numero;
	public String titular;
	public Double saldo;
	public String tipoConta;
	
	
	public void transferir(){
		
	}
	public void sacar(double valorSacar){
		if (saldo >= valorSacar) {
			saldo = saldo - valorSacar;
			
		}else {
			System.out.println("Saldo indisponível,Vai trabalhar vagabundo!!!!!!!");
		}
		
		
	}
	public void depostar(double valorDeposito){
		saldo = saldo + valorDeposito;
		
	}
	
	public void exibirDadosDaConta() {
		System.out.println("*****CONTA*****");
		System.out.printf("Nome do titular: %s\n", titular);
		System.out.printf("Numero da conta: %s\n", numero);
		System.out.printf("Saldo da conta: %s\n", saldo);
	}
	

}
