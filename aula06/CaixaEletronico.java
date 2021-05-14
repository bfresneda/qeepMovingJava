package com.qeepmoving.aula06;

import java.util.Scanner;

public class CaixaEletronico {
	/////////## metodos do main ##/////////
	public static void imprimeCabecalho() {
		System.out.println("Sistema Banco sem Saldo             ");
		System.out.println("Escolha a função que deseja utilizar:");
		System.out.println("(1) Para criar nova conta:");
		System.out.println("(2) Para fazer um deposito:");
		System.out.println("(3) Para realizar um saque:");
		System.out.println("(4) Para visualizar o extrato da conta:");
		System.out.println("(0) Para Sair");
		System.out.print("Função: ");
	}
	
	public static void mensagemDespedida() {
		System.out.println("Obrigado por utilizar nossos serviços");
		System.out.println("Banco sem Saldo");
	}
	
	public static void imprimeLinhas(int qtdLinhas) {
		for(int i = 0; i < qtdLinhas; i++) {
			System.out.println();
			System.out.println("##-----------------------##");
		}
	}
	/////////## metodos do main ##/////////
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Conta novaConta = new Conta();
		
		int funcao = 0;
		do{
			imprimeLinhas(1);
			imprimeCabecalho();
			funcao = entrada.nextInt();
			imprimeLinhas(1);
			
			switch(funcao) {
			case 0:
				mensagemDespedida();
				break;
			case 1:
				System.out.println("informações da conta Numero Saldo e nome");
				
				System.out.print("Numero da conta: ");
				novaConta.numConta = entrada.nextInt();
				System.out.print("Nome do correntista: ");
				novaConta.nome = entrada.next();			
				
				System.out.println("Nova conta criada com sucesso: ");
				novaConta.extrato();
				break;
			case 2:
				System.out.print("Numero da conta para o deposito: ");
				if(novaConta.verificaConta(entrada.nextInt()) == true) {
					System.out.print("Valor para deposito: R$");
					novaConta.deposito(funcao, entrada.nextFloat());
				}
				break;

			case 3:
				System.out.print("Numero da conta para Saque: ");
				if(novaConta.verificaConta(entrada.nextInt()) == true) {
					System.out.print("Valor para saque R$:");
					novaConta.saque(entrada.nextFloat());
				}
				break;
					
			case 4:
				novaConta.extrato();
				break;
			}
			
		}while(funcao != 0);
		
		
		entrada.close();
	}

}
