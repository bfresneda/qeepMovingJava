package com.qeepmoving.aula06;

public class Conta {
	
	int numConta;
	float saldo;
	String nome;

	Conta(){
		
	}
	
	Conta(int numConta, String nome){
		this.numConta = numConta;
		this.saldo = 0;
		this.nome = nome;
	}
	
	public boolean verificaConta(int conta) {
		if(this.numConta == conta) {
			return true;
		}else {
			System.out.println("Conta inválida ou inexistente.");
			return false;
		}
	}
	
	
	public void saque(float valorSaque) {
		if(valorSaque <= saldo && valorSaque > 0) {
			float taxaSaque = 10;
			this.saldo -= valorSaque - taxaSaque;
			System.out.printf("Saque realizado valor de R$%.2f, a taxa de Saque é no valor de %.2f,\n"
					+ "e o novo saldo R$%.2f\n",valorSaque,taxaSaque,this.saldo);
		}else {
			System.out.println("Operação não permitida\n");
		}
	}
	
	public void deposito(int conta, float valorDeposito) {
		
			if(valorDeposito > 0) {
				float saldoAnterior = this.saldo;
				this.saldo += valorDeposito;
				
				System.out.printf("Saldo anterior R$%.2f . Novo Saldo R$%.2f\n",saldoAnterior,this.saldo);
			}else {
				System.out.println("Valor ínvalido\n");
			}
		}
				
	
	public void extrato() {
		System.out.printf("Correntista: %s\n",this.nome);
		System.out.printf("Número da conta: %d\n",this.numConta);
		System.out.printf("Saldo em conta R$%.2f\n",this.saldo);
		
		
	}
	

}
