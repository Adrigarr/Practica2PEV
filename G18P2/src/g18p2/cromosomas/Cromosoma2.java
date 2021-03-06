/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g18p2.cromosomas;

/**
 *
 * @author usuario_local
 */
public class Cromosoma2 extends Cromosoma {
   
	double min;//acotado minimo
    double max;//acotado maximo

    public Cromosoma2(double tolerancia) {
        this.min = -512.0;
        this.max = 512.0;
        super.numeroGenes = 2;
        this.tolerancia = tolerancia;
        calcularLongitudes();
        this.individuo = new boolean[this.longitudes[0]*2];
        generaGenes();
        calculaFenotipo();
    }

    /*   public Cromosoma generarCromosoma() {
        
    }*/
    @Override
    public void calculaFenotipo() {
        double[] fenotipo = new double[2];
        boolean[] x1 = new boolean[longitudes[0]];
        boolean[] x2 = new boolean[longitudes[1]];

        System.arraycopy(individuo, 0, x1, 0, x1.length);
        System.arraycopy(individuo, x1.length, x2, 0, x2.length);

        fenotipo[0] = min + binToDec(x1) * ((max - min) / (Math.pow(2, longitudes[0]) - 1));
        fenotipo[1] = min + binToDec(x2) * ((max - min) / (Math.pow(2, longitudes[1]) - 1));
        this.fenotipo = fenotipo;
    }

	@Override
	public void calcularLongitudes() {
		this.longitudes[0] = (int) (Math.log(1+((max-min)/tolerancia))/Math.log(2));
		this.longitudes[1] = (int) (Math.log(1+((max-min)/tolerancia))/Math.log(2));
	}

}
