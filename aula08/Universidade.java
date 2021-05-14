package com.qeepmoving.aula08;

public class Universidade {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Professores professor1 = new Professores("Juvenal", "0394739410", "097742", "ssp", 2000, "faculdade", "matematica", 24, 2);
		Professores professor2 = new Professores("Serafim", "00385730", "865843", "ssp", 2000, "faculdade", "quimica", 19, 2);
		Professores professor3 = new Professores("Raimundo", "143431340", "19384742", "ssp", 2000, "faculdade", "fisica", 15, 2);
		
		
		Coordenadores coordenador1 = new Coordenadores("Tobias", "9019125351", "56363", "ssp", 3000);
		Coordenadores coordenador2 = new Coordenadores("Tiao", "9019125351", "56363", "ssp", 3000);
		
		coordenador1.adicionarProfessor(professor1);
		
		
		System.out.printf("professor %s  %.2f\n",professor1.getNome(), professor1.getSalario());
		professor1.aumentaSalario();
		
		System.out.printf("professor %s  %.2f com ajuste \n",professor1.getNome(), professor1.getSalario());
		

		
		coordenador1.aumentaSalario();
		System.out.printf("coord com aluno ");
		

		
		System.out.printf("coord sem aluno\n");
		coordenador2.mostraProfessoresCoordenador();
		coordenador2.aumentaSalario();
		System.out.printf("coord %s %.2f\n",coordenador2.getNome(),coordenador2.getSalario());
			
		
		System.out.printf("coord %s %.2f\n",coordenador1.getNome(),coordenador1.getSalario());
		System.out.println();	
		
		coordenador1.mostraProfessoresCoordenador();
		
	}

}
