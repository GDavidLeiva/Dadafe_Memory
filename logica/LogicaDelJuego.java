package logica;

/**
 * @author federico_correas
 */

import java.util.Random;

public class LogicaDelJuego {
    
    public int [] getNumerosALasImagenes(){
        int[] numeros = new int[40];
        int contador = 0;
        
        while(contador<40){
            Random r = new Random();
            int a = r.nextInt(20)+1;
            int b = 0;
            
            for (int i = 0; i < 40; i++) {
                if (numeros[i]==a){
                    b++;
                }
            }
            if (b<2){
                numeros[contador]=a;
                contador++;
            }
        }
        
        return numeros;
    }   
    
}