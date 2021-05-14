package com.qeepmoving.aula08;

public class Professores extends Funcionarios{



	private String nivelGraduacao;
	private String disciplina;
	private int qtdAlunos;
	private int qtdTurmas;
	
	
	
	public Professores(String nome, String cpf, String numRegistro, String orgaoEmissor, float salario,
			String nivelGraduacao, String disciplina, int qtdAlunos, int qtdTurmas) {
		super(nome, cpf, numRegistro, orgaoEmissor, salario);
		this.nivelGraduacao = nivelGraduacao;
		this.disciplina = disciplina;
		this.qtdAlunos = qtdAlunos;
		this.qtdTurmas = qtdTurmas;
	}



	public void adicionaTurma() {
		this.qtdTurmas += 1;
	}
	
	public void removeTurma() {
		this.qtdTurmas -= 1;
	}
		
	
	
	
	public String getNivelGraduacao() {
		return nivelGraduacao;
	}



	public void setNivelGraduacao(String nivelGraduacao) {
		this.nivelGraduacao = nivelGraduacao;
	}



	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}



	public int getQtdAlunos() {
		return qtdAlunos;
	}



	public void setQtdAlunos(int qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}



	public int getQtdTurmas() {
		return qtdTurmas;
	}



	public void setQtdTurmas(int qtdTurmas) {
		this.qtdTurmas = qtdTurmas;
	}
	
	
	
	
	
	
}
