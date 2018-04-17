/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g18p2;
import javax.swing.*;
import org.math.plot.*;
import org.math.io.*;
import g18p2.*;
import g18p2.vista.Vista;

/**
 *
 * @author usuario_local
 */
public class G18P2 {

    public static org.math.plot.Plot2DPanel plot;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vista vista = new Vista();
        

        JPanel grafica = vista.getGraficaPanel();

        // create your PlotPanel (you can use it as a JPanel)
        plot = new Plot2DPanel();

        
        plot.setSize(grafica.getWidth(),grafica.getHeight());
        
        // define the legend position
        plot.addLegend("SOUTH");
        
        grafica.add(plot);
            
        vista.setVisible(true);
    }
    
}
