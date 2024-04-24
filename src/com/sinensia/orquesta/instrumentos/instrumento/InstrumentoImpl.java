package com.sinensia.orquesta.instrumentos.instrumento;

public class InstrumentoImpl implements Instrumento{

	private String nombreInstrumento;
	
	private String fraseTocando;
	
	public InstrumentoImpl(String instrumento) {
		super();
		this.nombreInstrumento = instrumento;
		fraseTocando = "Tocando el instrumento " + nombreInstrumento;
	}
	
	public String getFraseTocando() {
		return fraseTocando;
	}

	public void setFraseTocando(String fraseTocando) {
		this.fraseTocando = fraseTocando;
	}

	public String getNombreInstrumento() {
		return nombreInstrumento;
	}

	public void setNombreInstrumento(String nombreInstrumento) {
		this.nombreInstrumento = nombreInstrumento;
	}

	@Override
	public void tocar() {
		System.out.println(fraseTocando);
	}

	@Override
	public void afinar() {
		System.out.println("Afinando el instrumento " + nombreInstrumento);
	}

	@Override
	public String toString() {
		return "InstrumentoImpl [nombreInstrumento=" + nombreInstrumento + "]";
	}

}
