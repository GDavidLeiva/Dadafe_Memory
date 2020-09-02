package logica;

import java.util.Random;

/**
 * @author federico_correas
 */

public class LogicaDelJuego {
    
    public int [] getNumerosALasImagenes(){
        
        int[] numeros = new int[40];
        int contador = 0;
        
        while(contador<40){
            
            //Random r = new Random();
            int a = (int) Math.floor(Math.random()*20); //r.nextInt(20)+1;
            int b = 0;
            
            for (int i = 0; i < 40; i++) {
            
                if (numeros[i]==a){
                    b++; 
                }
                break;
            }
            
            if (b<2){
                numeros[contador]=a;
                contador++;
            }
        }
        
            return numeros;
    }
}
