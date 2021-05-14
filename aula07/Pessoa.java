package com.qeepmoving.aula07;

public class Pessoa {
	private String nome;
	private int anoNasc;
	private float altura;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome,int anoNasc, float altura){
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.altura = altura;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void dadosCadastrados() {
		System.out.printf("Informações cadastradas. \n");
		System.out.printf("Nome: %s\n",this.nome);
		System.out.printf("Ano Nascimento: %d\n",this.anoNasc);
		System.out.printf("Altura: %.2f\n",this.altura);
		System.out.printf("Idade: %d\n",this.calcularIdade(2021));
	}
	
	public int calcularIdade(int anoAtual) {
		int idade = anoAtual - this.anoNasc;
		return idade;
	}
	
	
	
	
	
	
	
}
