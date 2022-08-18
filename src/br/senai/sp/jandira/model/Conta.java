package br.senai.sp.jandira.model;

public class Conta {
	
	public String numero;
	public String titular;
	public Double saldo;
	public String tipoConta;
	
	
	public void transferir(double valorTransferencia, Conta contaDestino){
		
		boolean ocorreuSaque = sacar(valorTransferencia);
		
		if(ocorreuSaque) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Não foi possivel fazer a transação");
		}
		
		
		
		
	}
	public boolean sacar(double valorSacar){
		if (saldo >= valorSacar) {
			saldo = saldo - valorSacar;
			return true;
		}else {
			System.out.println("Saldo indisponível!!!!!!!");
			return false;
		}
		
		
	}
	public void depositar(double valorDeposito){
		saldo = saldo + valorDeposito;
		
	}
	
	public void exibirDadosDaConta() {
		System.out.println("*****CONTA*****");
		System.out.printf("Nome do titular: %s\n", titular);
		System.out.printf("Numero da conta: %s\n", numero);
		System.out.printf("Saldo da conta: %s\n", saldo);
		System.out.println("-----------------------------");
	}
	

}
