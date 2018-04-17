/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g18p2.cromosomas;

import java.math.*;
import java.util.Comparator;
import java.util.Random;


/**
 *
 * @author usuario_local
 */
public abstract class Cromosoma implements Comparable{

    boolean[] individuo; //array de booleanos que forma el genotipo
    double[] fenotipo;//valores que recibe el genotipo
    double fitness;
    double puntuacion;
    double puntAcumulada;
    int longitudes[];//logitudes de los genes que forman el cromosoma
    int numeroGenes;
    double tolerancia;

    public Cromosoma() {
        this.longitudes = new int[7];
        this.fitness = 0;
        this.puntuacion = 0;
        this.puntAcumulada = 0;
    }

    public Cromosoma(boolean[] individuo, double[] fenotipo, int[] longitudes) {
        this.individuo = individuo;
        this.fenotipo = fenotipo;
        this.fitness = 0;
        this.puntuacion = 0;
        this.puntAcumulada = 0;
        this.longitudes = longitudes;
    }

    public void setIndividuo(boolean[] individuo) {
        this.individuo = individuo;
    }

    public boolean[] getIndividuo() {
        return this.individuo;
    }

    public double[] getFenotipo() {
        return this.fenotipo;
    }

    public int getNumeroGenes() {
        return this.numeroGenes;
    }

    public double getFitness() {
        return this.fitness;
    }

    public double getPuntuacion() {
        return this.puntuacion;
    }

    public double getPuntAcumulada() {
        return this.puntAcumulada;
    }

    public int[] getLongitudes() {
        return this.longitudes;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public void setPuntAcumulada(double puntAcumulada) {
        this.puntAcumulada = puntAcumulada;
    }

    /**
     *genera un cromosoma aleatorio
     * @return da valores a los genes del cromosoma
     */
    public void generaGenes() {
        Random rand = new Random();
        int cont = 0;
        for (int i = 0; i < this.numeroGenes; i++) {
            for (int j = 0; j < this.longitudes[i]; j++) {
                individuo[cont] = rand.nextBoolean();
                cont++;
            }
        }
    }
    /**
     * conversor de binario a decimal
     * @param genotipo
     * @return
     */
    public double binToDec(boolean[] genotipo) {
        double total = 0;
        int j = 0;
        int bool;
        for (int i = genotipo.length - 1; i >= 0; i--) {
            if (genotipo[i]) {
                bool = 1;
            } else {
                bool = 0;
            }
            total += bool * Math.pow(2, j);
            j++;
        }
        return total;
    }
    /**
     * muta el cromosoma
     * @param probabilidad
     */
    public void mutar(double probabilidad) { //WIP
        double valor;

        for (int i = 0; i < this.individuo.length; i++) {
            valor = Math.random();
            
            if (valor <= probabilidad)
                individuo[i] = !individuo[i];
        }
    }
    /**
     * compara dos cromosomas
     */
    public int compareTo(Object o) {
    	Cromosoma c = (Cromosoma) o;
    	return (int) (this.getFitness()-c.getFitness());
    }
    /**
     * calcula las longitudes que tendra cada gen
     */
    public abstract void calcularLongitudes();
    /**
     * calcula el valor del fenotipo
     */
    public abstract void calculaFenotipo();

}
