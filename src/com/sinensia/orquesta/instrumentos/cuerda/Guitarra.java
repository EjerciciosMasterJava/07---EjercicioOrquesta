package com.sinensia.orquesta.instrumentos.cuerda;

import com.sinensia.orquesta.instrumentos.instrumento.InstrumentoImpl;

public class Guitarra extends InstrumentoImpl{

	private String numeroCuerdas;
	
	public Guitarra(String instrumento) {
		super(instrumento);
	}
	
	public String getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(String numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}

	@Override
	public String toString() {
		return "Guitarra [numeroCuerdas=" + numeroCuerdas + ", NombreInstrumento=" + getNombreInstrumento() + "]";
	}


}
