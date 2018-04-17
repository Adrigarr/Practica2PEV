package g18p2.Funciones;

import g18p2.cromosomas.Cromosoma;

public class Funcion5 {

	public static double evalua(Cromosoma cromosoma) {
		double suma = 0;
		
		for(int i = 0 ; i < cromosoma.getNumeroGenes(); i++) {
			suma += Math.sin(cromosoma.getFenotipo()[i]) * Math.pow(Math.sin
					((i+2)*Math.pow(cromosoma.getFenotipo()[i], 2)/Math.PI), 20);
		}
		return -suma;
	}

}
