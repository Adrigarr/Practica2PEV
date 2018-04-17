package g18p2.Funciones;

public class Funcion3 {//el test de esta funcion da ligeramente distinto a lo que deberia ser

	public static double evalua(double x1, double x2) {
		return 21.5 + x1 * Math.sin(4*Math.PI*x1) + x2 * Math.sin(20 * Math.PI * x2);
	}

}
