package com.qeepmoving.aula07;

public class ControleRemoto1 {
	
	private Televisao televisao;
	private int volumeMax;
	private int volumeMin;
	private int canalMax;
	private int canalMin;
	
	public void ControleRemoto(int volumeMax, int volumeMin, int canalMax, int canalMin) {
		this.televisao = new Televisao();
		this.volumeMax = volumeMax;
		this.volumeMin = volumeMin;
		this.canalMax = canalMax;
		this.canalMin = canalMin;
	}
	
	
//	
}
