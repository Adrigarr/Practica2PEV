package g18p2.Funciones;

public class Funcion2{
	
	public static double evalua(double x1, double x2) {
		return -(x2 + 47) * Math.sin(Math.sqrt(Math.abs(x2 + (x1/2) + 47))) 
				- x1 * Math.sin(Math.sqrt(Math.abs(x1 - (x2 + 47))));
	}

}
