/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g18p2.cromosomas;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usuario_local
 */
public class Individuo {
    int[] individuo; //array de enteros que constituye el individuo
    double fitness;
    double tolerancia;
    
    public Individuo(){
        this.individuo = new int[26];
        this.fitness = 0;
    }
    
    public int[] getIndividuo() {
        return this.individuo;
    }
    public void setIndividuo(int[] individuo) {
        this.individuo = individuo;
    }
   
    public double getFitness() {
        return this.fitness;
    }
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
    
    
    public void cromosomaAleatorio(){
        ArrayList<Integer> alfabeto = new ArrayList<Integer>();
        
        for(int i=0; i<26; i++){
            alfabeto.set(i, i);
        }
        
        Collections.shuffle(alfabeto);
    }
}
