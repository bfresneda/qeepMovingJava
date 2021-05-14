package com.qeepmoving.aula08;

public class Administrativos extends Funcionarios{

	private String funcaoAdministrativa;
	private String senioridade;
	
	
	public Administrativos(String nome, String cpf, String numRegistro, String orgaoEmissor, float salario,
			String funcaoAdministrativa, String senioridade) {
		super(nome, cpf, numRegistro, orgaoEmissor, salario);
		this.funcaoAdministrativa = funcaoAdministrativa;
		this.senioridade = senioridade;
	}


	public String getFuncaoAdministrativa() {
		return funcaoAdministrativa;
	}


	public void setFuncaoAdministrativa(String funcaoAdministrativa) {
		this.funcaoAdministrativa = funcaoAdministrativa;
	}


	public String getSenioridade() {
		return senioridade;
	}


	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	
	
	
	
}
