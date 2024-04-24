package com.sinensia.orquesta.instrumentos.cuerda;

public class GuitarraElectrica extends Guitarra{

	private Integer potencia;
	
	public GuitarraElectrica(String instrumento) {
		super(instrumento);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra eléctrica.");
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", NumeroCuerdas=" + getNumeroCuerdas()
				+ ", NombreInstrumento=" + getNombreInstrumento() + "]";
	}
	

}
