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
public class FuncionHabilitar {
    private void botonHabilitar (JButton btn){
        //boolean voltear,primeraC; 
        //ImageIcon imagen1,imagen2
        //JButton[] pboton
        
        if (!voltear){
            btn.setEnabled(false);
            imagen1=(ImageIcon) btn.getDisabledIcon();
            pboton[0]=btn;
            voltear=true;
            primeraC=false;}
        else
            btn.setEnabled(false);
        imagen2=(ImageIcon) btn.getDisableIcon();
        pboton[1]=btn;
        primeraC=true;
        ganaste(); //metodo David
                   
        }
    }
    
    

