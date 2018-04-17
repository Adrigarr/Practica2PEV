/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g18p2.cromosomas;

import java.util.*;

import g18p2.Funciones.Funcion1;

/**
 *
 * @author usuario_local
 */
public class Cromosoma1 extends Cromosoma {

    double min;//acotado minimo
    double max;//acotado maximo

    public Cromosoma1(double tolerancia) {
        this.tolerancia = tolerancia;
        this.min = 0.0;
        this.max = 32.0;
        super.numeroGenes = 1;
        calcularLongitudes();
        this.individuo = new boolean[this.longitudes[0]];
        generaGenes();
        calculaFenotipo();
    }
    
    @Override
    public void calculaFenotipo() {
        double[] fenotipo = new double[1];
        fenotipo[0] = min + binToDec(individuo) * ((max - min) / (Math.pow(2, longitudes[0]) - 1));
        this.fenotipo = fenotipo;
    }

    @Override
    public void calcularLongitudes() {
        this.longitudes[0] = (int) (Math.log(1 + ((max - min) / tolerancia)) / Math.log(2));
    }

}
