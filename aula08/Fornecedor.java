package com.qeepmoving.aula08;

public class Fornecedor extends Pessoa {

	private float valorCredito;
	private float valorDivida;
	
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	
	public void obterSaldo() {
		float saldo = 0;
		saldo = this.valorCredito - this.valorDivida;
		System.out.printf("O saldo do fornecedor é de R$%.2f",saldo);
	}


	public float getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}


	public float getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
