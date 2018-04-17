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
public class Cromosoma3 extends Cromosoma{

    double x1min;
    double x1max;
    double x2min;
    double x2max;

    public Cromosoma3(double tolerancia) {
        this.x1min = -3.0;
        this.x1max = 12.1;
        this.x2min = 4.1;
        this.x2max = 5.8;
        super.numeroGenes = 2;
        this.tolerancia= tolerancia;
        calcularLongitudes();
        this.individuo = new boolean[this.longitudes[0]+this.longitudes[1]];
        generaGenes();
        calculaFenotipo();
    }
    
    @Override
    public void calculaFenotipo() {
        double[] fenotipo = new double[2];
        boolean[] x1 = new boolean[longitudes[0]];
        boolean[] x2 = new boolean[longitudes[1]];

        System.arraycopy(individuo, 0, x1, 0, x1.length);
        System.arraycopy(individuo, x1.length, x2, 0, x2.length);

        fenotipo[0] = x1min + binToDec(x1) * ((x1max - x1min) / (Math.pow(2, longitudes[0]) - 1));
        fenotipo[1] = x2min + binToDec(x2) * ((x2max - x2min) / (Math.pow(2, longitudes[1]) - 1));
        this.fenotipo = fenotipo;
    }

    @Override
    public void calcularLongitudes() {
        this.longitudes[0] = (int) (Math.log(1 + ((x1max - x1min) / tolerancia)) / Math.log(2));
        this.longitudes[1] = (int) (Math.log(1 + ((x2max - x2min) / tolerancia)) / Math.log(2));
    }

}
