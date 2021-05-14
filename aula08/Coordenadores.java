package com.qeepmoving.aula08;

public class Coordenadores extends Funcionarios {

	private Professores[] professoresSupervisionados;

	
	
	public Coordenadores(String nome, String cpf, String numRegistro, String orgaoEmissor, float salario) {
		super(nome, cpf, numRegistro, orgaoEmissor, salario);
		this.professoresSupervisionados = new Professores[10];
	}

	public void aumentaSalario() {
		this.setSalario(getSalario() * 1.05f);
	}
	
//	public void aumentaSalario() {
//		for(int i = 0; i < professoresSupervisionados.length; i++) {
//			if(professoresSupervisionados[i] != null) {
//				i++;
//				if(i > 0) {
//					super.setSalario(super.getSalario() * 1.05f);
//					break;
//				}
//			}
//		}
//	}
//	
	
	public void adicionarProfessor(Professores professor) {
		for(int i = 0; i < 10; i++) {
			if(this.professoresSupervisionados[i] == null) {
				this.professoresSupervisionados[i] = professor;
				break;
			}
		}
	}
	
	public void mostraProfessoresCoordenador() {
		for(Professores professor : this.professoresSupervisionados) {
			if(professor != null) {
				System.out.println(professor.getNome());
			}
		}
	}
	

	public Professores[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}



	public void setProfessoresSupervisionados(Professores[] professoresSupervisionados) {
		this.professoresSupervisionados = professoresSupervisionados;
	}
	
	
	
	
	
	
	
}
