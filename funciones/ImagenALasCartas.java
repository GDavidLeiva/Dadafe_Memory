package funciones;

/**
 * @author federico_correas
 */

public class ImagenALasCartas {
 
    private void setImagenALasCartas(){
        
        //le añade la imagen a cada carta
        
        int[] numeros = log.getNumerosALasImagenes();
        
        carta1.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[0]+".png")));
        carta2.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[1]+".png")));
        carta3.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[2]+".png")));
        carta4.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[3]+".png")));
        carta5.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[4]+".png")));
        carta6.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[5]+".png")));
        carta7.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[6]+".png")));
        carta8.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[7]+".png")));
        carta9.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[8]+".png")));
        carta10.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[9]+".png")));
        carta11.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[10]+".png")));
        carta12.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[11]+".png")));
        carta13.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[12]+".png")));
        carta14.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[13]+".png")));
        carta15.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[14]+".png")));
        carta16.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[15]+".png")));
        carta17.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[16]+".png")));
        carta18.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[17]+".png")));
        carta19.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[18]+".png")));
        carta20.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen"+numeros[19]+".png")));
        
    }
    
}