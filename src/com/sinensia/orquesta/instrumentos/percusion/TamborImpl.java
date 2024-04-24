package com.sinensia.orquesta.instrumentos.percusion;

import com.sinensia.orquesta.instrumentos.instrumento.InstrumentoImpl;

public class TamborImpl extends InstrumentoImpl implements Tambor{

	private Integer tamanho;
	
	public TamborImpl(String instrumento) {
		super(instrumento);
	}
	
	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public void aporrear() {
		System.out.println("Aporreando tambor " + super.getNombreInstrumento());
	}

	@Override
	public String toString() {
		return "TamborImpl [tamanho=" + tamanho + ", Tamanho=" + getTamanho() + "]";
	}

}
