package g18p2.Funciones;

public class Funcion1{

	public static double evalua(double x) {
		return 20 + Math.E - (20*(Math.pow(Math.E,(-0.2*Math.abs(x))))) 
				- Math.pow(Math.E, Math.cos((2* Math.PI * x)));
	}

}
