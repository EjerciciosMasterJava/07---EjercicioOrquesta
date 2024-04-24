package com.sinensia.orquesta.instrumentos.viento;

import com.sinensia.orquesta.instrumentos.instrumento.InstrumentoImpl;

public class Flauta extends InstrumentoImpl{
	
	private ModeloFlauta modelo;

	public Flauta(String instrumento) {
		super(instrumento);
	}
	
	public ModeloFlauta getModelo() {
		return modelo;
	}

	public Flauta setModelo(ModeloFlauta modelo) {
		this.modelo = modelo;
		return this;
	}
	
	public void mostrarModelo() {
		System.out.println("Flauta de modelo " + modelo.name());
	}

	@Override
	public void tocar() {
		System.out.println(super.getFraseTocando() + " soplando.");
	}
	
}
