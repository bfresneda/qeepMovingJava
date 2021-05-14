package com.qeepmoving.aula07;

public class Televisao {
	
	private String status;
	private int canal;
	private int volume;
	
	Televisao() {
		this.status = "desligada";
		this.canal = 0;
		this.volume = 0;
	}

	public void ligarTv(){
		if(this.status == "desligada") {
			System.out.println("------------------");
			System.out.println("TV Ligando");
			this.status = "ligada";
		}else{
			System.out.println("------------------");
			System.out.println("Televisão ja esta ligada.");
		}			
	}
	
	public void desligarTV() {
		if(this.status == "ligada") {
			System.out.println("------------------");
			System.out.println("TV Desligando");
			this.status = "desligada";			
		}else {
			System.out.println("------------------");
			System.out.println("Televisão ja esta desligada.");
		}
	}
			
	public void diminuirVolume() {
		if(status == "ligada") {
			if(this.volume > 0) {
				System.out.println("------------------");
				System.out.println("volume -1");
				this.volume -= 1;			
			}else {
				System.out.println("------------------");
				System.out.println("Volume já esta no mínimo!!");
			}
		}else {
			System.out.println("TV esta desligada");
		}
	}
	
	public void aumentarVolume() {
		if(status == "ligada") {
			if(this.volume < 10) {
				System.out.println("------------------");
				System.out.println("volume +1");
				this.volume += 1;
			}else{
				System.out.println("------------------");
				System.out.println("Volume já esta no máximo");
			}
		}else {
			System.out.println("TV esta desligada");
		}
	}
	
	public void diminuirCanal() {
		if(status == "ligada") {
			if(canal == 1) {
				System.out.println("------------------");
				this.canal = 10;
				System.out.println("Canal -1");
			}else {
				this.canal -= 1;
			}
			
		}else{
			System.out.println("TV esta desligada");
		}
	}

	public void aumentarCanal() {
		if(status == "ligada") {
			System.out.println("------------------");
			System.out.println("Canal +1");
			if(canal == 10) {
				this.canal = 1;
			}else {
				this.canal -= 1;			
			}
		}else{
			System.out.println("TV esta desligada");
		}
	}
	
	
	public void info() {
		if(status == "ligada") {
			System.out.println("------------------");
			System.out.printf("Status: %s\n",this.status);
			System.out.printf("Canal: %d\n",this.canal);
			System.out.printf("Volume: %d\n",this.volume);
		}else {
			System.out.println("TV esta desligada");
		}
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(status == "ligada") {
			if(this.canal == canal) {
				System.out.println("------------------");
				System.out.println("Já esta no canal!!!");
			}else {
				if(canal > 10 && canal < 1) {
					System.out.println("------------------");
					System.out.println("O canal precisa estar entre 1 e 10");
				}else {
					this.canal = canal;			
				}				
			}
		}else {
			System.out.println("------------------");
			System.out.println("A televisão esta desligada");
		}
		
			
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
