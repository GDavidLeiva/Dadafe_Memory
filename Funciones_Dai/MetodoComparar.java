/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author david
 */
public class MetodoComparar {
    private void comparar(){
        if (voltear && primeraC){
            
            if (imagen1.getDescription().compareTo(imagen2.getDescription()) != 0) {
            pboton[0].setEnabled(true);
            pboton[1].setEnabled(true);
        }
        
            
            voltear=false;
        
        }
    
    }
}
a