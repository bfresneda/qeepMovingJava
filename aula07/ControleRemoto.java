package com.qeepmoving.aula07;

import java.io.IOException;
import java.util.Scanner;

public class ControleRemoto {

		public static void menuTv() {
			System.out.println("###------------------###");
			System.out.println("Digite a opcao que deseja.");
			System.out.println("(L) Ligar TV");
			System.out.println("(D) Desligar TV");
			System.out.println("(-) Diminuir volume");
			System.out.println("(+) Aumentar volume");
			System.out.println("(<) Diminuir o canal");
			System.out.println("(>) Aumentar o canal");
			System.out.println("(C) Selecionar o canal");
			System.out.println("(I) Informações da TV");			
		}
		
	
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		String opcao = "d";
		Televisao tv = new Televisao();
		
		do {
			menuTv();
			opcao = entrada.next();
			
			switch(opcao.toLowerCase()) {
				case "l":
					tv.ligarTv();
					break;
				case "d":
					tv.desligarTV();
					break;
				case "-":
					tv.diminuirVolume();
					break;
				case "+":
					tv.aumentarVolume();
					break;
				case "<":
					tv.diminuirCanal();
					break;
				case ">":
					tv.aumentarCanal();
					break;
				case "c":
					System.out.print("Digite o canal desejado entre 1 e 10:");
					tv.setCanal(entrada.nextInt());
					break;
				case "i":
					tv.info();
				default:
					System.out.println("------------------");
					System.out.println("Opção invalida!!!!");
					break;
			}
			
		}while(opcao != "d");	
		
		
		entrada.close();
	}

}








