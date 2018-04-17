package g18p2.Funciones;

public class Funcion4 {

	public static double evalua(double x1, double x2) {
		double suma1 = 0 , suma2 = 0;
		for(int i = 1; i <=5 ;i++)
			suma1 += i * Math.cos((i+1) * x1+i);
		for(int i = 1; i <=5; i++)
			suma2 += i*Math.cos((i+1)*x2 + i);
		return  suma1*suma2;
	}

}
