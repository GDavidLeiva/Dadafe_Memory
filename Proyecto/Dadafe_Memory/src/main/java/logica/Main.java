package logica;

import java.util.Random;
/**
 * @author federico_correas
 */
public class Main {
    
    public static void main (String [] args){
        
        int []numeros=new int [20];
        int contador=0;
        
        while(contador<40){
            Random r = new Random();
            int a = r.nextInt(8)+1;
            int b =0;
            
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
        
        for (int i = 0; i < 40; i++) {
        
            System.out.println(numeros[i]+" ");
        
        }
    }
    
    
}
