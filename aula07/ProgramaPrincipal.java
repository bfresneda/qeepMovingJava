package com.qeepmoving.aula07;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Bruno",1990,1.84f);
		
//		
//		ArrayList<Pessoa> pessoas = new ArrayList<>();
//		
//		
//		pessoas.add(p1);
//		
//		
//		for(Pessoa pessoa: pessoas) {
//			System.out.printf("Nome:%s ",pessoa.getNome());
//			}
//		
//		
		
		p1.dadosCadastrados();
		
		System.out.println("---------");
//		System.out.printf("A idade é: %d\n",p1.calcularIdade(2021));
		
		
		p1.setAnoNasc(1983);
//		System.out.printf("A idade é: %d\n",p1.calcularIdade(2021));
		
		p1.dadosCadastrados();
		
	}

}
