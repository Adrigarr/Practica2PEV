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
public class Cromosoma5 extends Cromosoma {

    double min;
    double max;

    public Cromosoma5(double tolerancia, int numGenes) {
        this.tolerancia = tolerancia;
        this.min = 0;
        this.max = Math.PI;
        this.numeroGenes = numGenes;
        calcularLongitudes();
        int total = 0;
        for(int i = 0 ; i < this.numeroGenes; i++) {
        	total += this.longitudes[i];
        }
        this.individuo = new boolean[total];
        generaGenes();
        calculaFenotipo();
    }
    
    @Override
    public void calculaFenotipo() {
        double[] fenotipo = new double[this.numeroGenes];
        int sumaLongitudes = 0;

        for (int i = 0; i < this.numeroGenes; i++) {
            boolean[] xi = new boolean[longitudes[i]];
            System.arraycopy(individuo, sumaLongitudes, xi, 0, longitudes[i]);
            sumaLongitudes += longitudes[i];
            fenotipo[i] = min + binToDec(xi) * ((max - min) / (Math.pow(2, longitudes[i]) - 1));
        }
        this.fenotipo = fenotipo;
    }

    @Override
    public void calcularLongitudes() {
        for (int i = 0; i < numeroGenes; i++) {
            this.longitudes[i] = (int) (Math.log(1 + ((max - min) / tolerancia)) / Math.log(2));
        }
    }
}
