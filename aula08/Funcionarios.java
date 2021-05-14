package com.qeepmoving.aula08;

public class Funcionarios {
	
	private String nome;
	private String cpf;
	private String  numRegistro;
	private String orgaoEmissor;
	private float salario;
	

	public Funcionarios(String nome, String cpf, String numRegistro, String orgaoEmissor, float salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numRegistro = numRegistro;
		this.orgaoEmissor = orgaoEmissor;
		this.salario = salario;
	}

	protected void aumentaSalario() {
		this.salario = this.salario * 1.1f;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNumRegistro() {
		return numRegistro;
	}


	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}


	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}


	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
	
	
	
	
	
	

}
