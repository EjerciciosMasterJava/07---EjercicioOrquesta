package com.sinensia.orquesta.aplicacion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sinensia.orquesta.instrumentos.cuerda.Guitarra;
import com.sinensia.orquesta.instrumentos.cuerda.GuitarraElectrica;
import com.sinensia.orquesta.instrumentos.instrumento.Instrumento;
import com.sinensia.orquesta.instrumentos.percusion.Tambor;
import com.sinensia.orquesta.instrumentos.percusion.TamborImpl;
import com.sinensia.orquesta.instrumentos.viento.Flauta;
import com.sinensia.orquesta.instrumentos.viento.ModeloFlauta;

	public class AplicacionOrquesta {
	public static void main(String[] args) {
		
		List<Instrumento>instrumentos = Arrays.asList(new Instrumento[]{
				new Flauta("Flauta travesera").setModelo(ModeloFlauta.FLAUTA_TRAVESERA),
				new Guitarra("guitarra de mi abuelo"),
				new GuitarraElectrica("guitarra electrica casa"),
				new TamborImpl("mi tambor")
		});

		for (Instrumento instrumento : instrumentos) {
			if(instrumento instanceof Flauta) {
			 ((Flauta) instrumento).mostrarModelo();
			}else if(instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
			}else {
				instrumento.tocar();
			}
		}
		
	}
}
