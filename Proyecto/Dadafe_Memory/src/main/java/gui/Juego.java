package gui;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import logica.LogicaDelJuego;

/**
 * @author federico_correas
 */
public class Juego extends javax.swing.JFrame {

    private final LogicaDelJuego log = new LogicaDelJuego();
    private ImageIcon imagen1, imagen2;
    private boolean voltear, primeraC = false;
    private final JButton[] pboton = new JButton[2];

    public Juego() throws IOException {

        initComponents();

        setImagenALasCartas();

    }

    private void setImagenALasCartas() throws MalformedURLException {

        //Le añadimos una imagen a cada carta.
        int[] numeros = this.log.getNumerosALasImagenes();

        carta1.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[0] + ".png")));
        carta2.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[1] + ".png")));
        carta3.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[2] + ".png")));
        carta4.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[3] + ".png")));
        carta5.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[4] + ".png")));
        carta6.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[5] + ".png")));
        carta7.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[6] + ".png")));
        carta8.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[7] + ".png")));
        carta9.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[8] + ".png")));
        carta10.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[9] + ".png")));
        carta11.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[10] + ".png")));
        carta12.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[11] + ".png")));
        carta13.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[12] + ".png")));
        carta14.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[13] + ".png")));
        carta15.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[14] + ".png")));
        carta16.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[15] + ".png")));
        carta17.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[16] + ".png")));
        carta18.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[17] + ".png")));
        carta19.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[18] + ".png")));
        carta20.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[19] + ".png")));
        carta21.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[0] + ".png")));
        carta22.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[1] + ".png")));
        carta23.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[2] + ".png")));
        carta24.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[3] + ".png")));
        carta25.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[4] + ".png")));
        carta26.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[5] + ".png")));
        carta27.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[6] + ".png")));
        carta28.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[7] + ".png")));
        carta29.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[8] + ".png")));
        carta30.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[9] + ".png")));
        carta31.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[10] + ".png")));
        carta32.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[11] + ".png")));
        carta33.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[12] + ".png")));
        carta34.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[13] + ".png")));
        carta35.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[14] + ".png")));
        carta36.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[15] + ".png")));
        carta37.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[16] + ".png")));
        carta38.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[17] + ".png")));
        carta39.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[18] + ".png")));
        carta40.setDisabledIcon(new ImageIcon(getClass().getResource("/fotos/imagen" + numeros[19] + ".png")));

    }

    private void botonHabilitar(JButton btn) {
        if (!voltear) {
            btn.setEnabled(false);
            imagen1 = (ImageIcon) btn.getDisabledIcon();
            pboton[0] = btn;
            voltear = true;
            primeraC = false;
        } else {
            btn.setEnabled(false);
            imagen2 = (ImageIcon) btn.getDisabledIcon();
            pboton[1] = btn;
            primeraC = true;
            comparar();
            ganaste();
        }
    }

    private void comparar() {
        if (voltear && primeraC) {

            if (imagen1.getDescription().compareTo(imagen2.getDescription()) != 0) {
                pboton[0].setEnabled(true);
                pboton[1].setEnabled(true);
            }

            voltear = false;

        }

    }

    private void reiniciar() {
        carta1.setEnabled(true);
        carta2.setEnabled(true);
        carta3.setEnabled(true);
        carta4.setEnabled(true);
        carta5.setEnabled(true);
        carta6.setEnabled(true);
        carta7.setEnabled(true);
        carta8.setEnabled(true);
        carta9.setEnabled(true);
        carta10.setEnabled(true);
        carta11.setEnabled(true);
        carta12.setEnabled(true);
        carta13.setEnabled(true);
        carta14.setEnabled(true);
        carta15.setEnabled(true);
        carta16.setEnabled(true);
        carta17.setEnabled(true);
        carta18.setEnabled(true);
        carta19.setEnabled(true);
        carta20.setEnabled(true);

        primeraC = false;
        voltear = false;

    }

    private void ganaste() {
        if (!carta1.isEnabled() && !carta2.isEnabled() && !carta3.isEnabled() && !carta4.isEnabled() && !carta5.isEnabled() && !carta6.isEnabled()
                && !carta7.isEnabled() && !carta8.isEnabled() && !carta9.isEnabled() && !carta10.isEnabled() && !carta11.isEnabled() && !carta12.isEnabled()
                && !carta13.isEnabled() && !carta14.isEnabled() && !carta15.isEnabled() && !carta16.isEnabled() && !carta17.isEnabled() && !carta18.isEnabled()
                && !carta19.isEnabled() && !carta20.isEnabled()) {
            JOptionPane.showMessageDialog(this, "¡Ganaste!" + JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        carta2 = new javax.swing.JButton();
        carta1 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        carta5 = new javax.swing.JButton();
        carta6 = new javax.swing.JButton();
        carta7 = new javax.swing.JButton();
        carta8 = new javax.swing.JButton();
        carta9 = new javax.swing.JButton();
        carta10 = new javax.swing.JButton();
        carta11 = new javax.swing.JButton();
        carta12 = new javax.swing.JButton();
        carta13 = new javax.swing.JButton();
        carta14 = new javax.swing.JButton();
        carta15 = new javax.swing.JButton();
        carta16 = new javax.swing.JButton();
        carta17 = new javax.swing.JButton();
        carta18 = new javax.swing.JButton();
        carta19 = new javax.swing.JButton();
        carta20 = new javax.swing.JButton();
        carta21 = new javax.swing.JButton();
        carta22 = new javax.swing.JButton();
        carta23 = new javax.swing.JButton();
        carta24 = new javax.swing.JButton();
        carta25 = new javax.swing.JButton();
        carta26 = new javax.swing.JButton();
        carta27 = new javax.swing.JButton();
        carta28 = new javax.swing.JButton();
        carta29 = new javax.swing.JButton();
        carta30 = new javax.swing.JButton();
        carta31 = new javax.swing.JButton();
        carta32 = new javax.swing.JButton();
        carta33 = new javax.swing.JButton();
        carta34 = new javax.swing.JButton();
        carta35 = new javax.swing.JButton();
        carta36 = new javax.swing.JButton();
        carta37 = new javax.swing.JButton();
        carta38 = new javax.swing.JButton();
        carta39 = new javax.swing.JButton();
        carta40 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        carta2.setForeground(new java.awt.Color(0, 0, 0));
        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta2.setBorder(null);
        carta2.setBorderPainted(false);
        carta2.setContentAreaFilled(false);
        carta2.setFocusable(false);
        carta2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });

        carta1.setForeground(new java.awt.Color(0, 0, 0));
        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta1.setBorderPainted(false);
        carta1.setContentAreaFilled(false);
        carta1.setFocusable(false);
        carta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });

        carta3.setForeground(new java.awt.Color(0, 0, 0));
        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta3.setBorder(null);
        carta3.setBorderPainted(false);
        carta3.setContentAreaFilled(false);
        carta3.setFocusable(false);
        carta3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });

        carta4.setForeground(new java.awt.Color(0, 0, 0));
        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta4.setBorder(null);
        carta4.setBorderPainted(false);
        carta4.setContentAreaFilled(false);
        carta4.setFocusable(false);
        carta4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta4ActionPerformed(evt);
            }
        });

        carta5.setForeground(new java.awt.Color(0, 0, 0));
        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta5.setBorder(null);
        carta5.setBorderPainted(false);
        carta5.setContentAreaFilled(false);
        carta5.setFocusable(false);
        carta5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta5ActionPerformed(evt);
            }
        });

        carta6.setForeground(new java.awt.Color(0, 0, 0));
        carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta6.setBorder(null);
        carta6.setBorderPainted(false);
        carta6.setContentAreaFilled(false);
        carta6.setFocusable(false);
        carta6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta6ActionPerformed(evt);
            }
        });

        carta7.setForeground(new java.awt.Color(0, 0, 0));
        carta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta7.setBorder(null);
        carta7.setBorderPainted(false);
        carta7.setContentAreaFilled(false);
        carta7.setFocusable(false);
        carta7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta7ActionPerformed(evt);
            }
        });

        carta8.setForeground(new java.awt.Color(0, 0, 0));
        carta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta8.setBorder(null);
        carta8.setBorderPainted(false);
        carta8.setContentAreaFilled(false);
        carta8.setFocusable(false);
        carta8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta8ActionPerformed(evt);
            }
        });

        carta9.setForeground(new java.awt.Color(0, 0, 0));
        carta9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta9.setBorder(null);
        carta9.setBorderPainted(false);
        carta9.setContentAreaFilled(false);
        carta9.setFocusable(false);
        carta9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta9ActionPerformed(evt);
            }
        });

        carta10.setForeground(new java.awt.Color(0, 0, 0));
        carta10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta10.setBorder(null);
        carta10.setBorderPainted(false);
        carta10.setContentAreaFilled(false);
        carta10.setFocusable(false);
        carta10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta10ActionPerformed(evt);
            }
        });

        carta11.setForeground(new java.awt.Color(0, 0, 0));
        carta11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta11.setBorder(null);
        carta11.setBorderPainted(false);
        carta11.setContentAreaFilled(false);
        carta11.setFocusable(false);
        carta11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta11ActionPerformed(evt);
            }
        });

        carta12.setForeground(new java.awt.Color(0, 0, 0));
        carta12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta12.setBorder(null);
        carta12.setBorderPainted(false);
        carta12.setContentAreaFilled(false);
        carta12.setFocusable(false);
        carta12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta12ActionPerformed(evt);
            }
        });

        carta13.setForeground(new java.awt.Color(0, 0, 0));
        carta13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta13.setBorder(null);
        carta13.setBorderPainted(false);
        carta13.setContentAreaFilled(false);
        carta13.setFocusable(false);
        carta13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta13ActionPerformed(evt);
            }
        });

        carta14.setForeground(new java.awt.Color(0, 0, 0));
        carta14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta14.setBorder(null);
        carta14.setBorderPainted(false);
        carta14.setContentAreaFilled(false);
        carta14.setFocusable(false);
        carta14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta14ActionPerformed(evt);
            }
        });

        carta15.setForeground(new java.awt.Color(0, 0, 0));
        carta15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta15.setBorder(null);
        carta15.setBorderPainted(false);
        carta15.setContentAreaFilled(false);
        carta15.setFocusable(false);
        carta15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta15ActionPerformed(evt);
            }
        });

        carta16.setForeground(new java.awt.Color(0, 0, 0));
        carta16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta16.setBorder(null);
        carta16.setBorderPainted(false);
        carta16.setContentAreaFilled(false);
        carta16.setFocusable(false);
        carta16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta16ActionPerformed(evt);
            }
        });

        carta17.setForeground(new java.awt.Color(0, 0, 0));
        carta17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta17.setBorder(null);
        carta17.setBorderPainted(false);
        carta17.setContentAreaFilled(false);
        carta17.setFocusable(false);
        carta17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta17ActionPerformed(evt);
            }
        });

        carta18.setForeground(new java.awt.Color(0, 0, 0));
        carta18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta18.setBorder(null);
        carta18.setBorderPainted(false);
        carta18.setContentAreaFilled(false);
        carta18.setFocusable(false);
        carta18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta18ActionPerformed(evt);
            }
        });

        carta19.setForeground(new java.awt.Color(0, 0, 0));
        carta19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta19.setBorder(null);
        carta19.setBorderPainted(false);
        carta19.setContentAreaFilled(false);
        carta19.setFocusable(false);
        carta19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta19ActionPerformed(evt);
            }
        });

        carta20.setForeground(new java.awt.Color(0, 0, 0));
        carta20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta20.setBorder(null);
        carta20.setBorderPainted(false);
        carta20.setContentAreaFilled(false);
        carta20.setFocusable(false);
        carta20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta20ActionPerformed(evt);
            }
        });

        carta21.setForeground(new java.awt.Color(0, 0, 0));
        carta21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta21.setBorder(null);
        carta21.setBorderPainted(false);
        carta21.setContentAreaFilled(false);
        carta21.setFocusable(false);
        carta21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta21ActionPerformed(evt);
            }
        });

        carta22.setForeground(new java.awt.Color(0, 0, 0));
        carta22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta22.setBorder(null);
        carta22.setBorderPainted(false);
        carta22.setContentAreaFilled(false);
        carta22.setFocusable(false);
        carta22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta22ActionPerformed(evt);
            }
        });

        carta23.setForeground(new java.awt.Color(0, 0, 0));
        carta23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta23.setBorder(null);
        carta23.setBorderPainted(false);
        carta23.setContentAreaFilled(false);
        carta23.setFocusable(false);
        carta23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta23ActionPerformed(evt);
            }
        });

        carta24.setForeground(new java.awt.Color(0, 0, 0));
        carta24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta24.setBorder(null);
        carta24.setBorderPainted(false);
        carta24.setContentAreaFilled(false);
        carta24.setFocusable(false);
        carta24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta24ActionPerformed(evt);
            }
        });

        carta25.setForeground(new java.awt.Color(0, 0, 0));
        carta25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta25.setBorder(null);
        carta25.setBorderPainted(false);
        carta25.setContentAreaFilled(false);
        carta25.setFocusable(false);
        carta25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta25ActionPerformed(evt);
            }
        });

        carta26.setForeground(new java.awt.Color(0, 0, 0));
        carta26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta26.setBorder(null);
        carta26.setBorderPainted(false);
        carta26.setContentAreaFilled(false);
        carta26.setFocusable(false);
        carta26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta26ActionPerformed(evt);
            }
        });

        carta27.setForeground(new java.awt.Color(0, 0, 0));
        carta27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta27.setBorder(null);
        carta27.setBorderPainted(false);
        carta27.setContentAreaFilled(false);
        carta27.setFocusable(false);
        carta27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta27ActionPerformed(evt);
            }
        });

        carta28.setForeground(new java.awt.Color(0, 0, 0));
        carta28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta28.setBorder(null);
        carta28.setBorderPainted(false);
        carta28.setContentAreaFilled(false);
        carta28.setFocusable(false);
        carta28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta28ActionPerformed(evt);
            }
        });

        carta29.setForeground(new java.awt.Color(0, 0, 0));
        carta29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta29.setBorder(null);
        carta29.setBorderPainted(false);
        carta29.setContentAreaFilled(false);
        carta29.setFocusable(false);
        carta29.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta29ActionPerformed(evt);
            }
        });

        carta30.setForeground(new java.awt.Color(0, 0, 0));
        carta30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta30.setBorder(null);
        carta30.setBorderPainted(false);
        carta30.setContentAreaFilled(false);
        carta30.setFocusable(false);
        carta30.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta30ActionPerformed(evt);
            }
        });

        carta31.setForeground(new java.awt.Color(0, 0, 0));
        carta31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta31.setBorder(null);
        carta31.setBorderPainted(false);
        carta31.setContentAreaFilled(false);
        carta31.setFocusable(false);
        carta31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta31ActionPerformed(evt);
            }
        });

        carta32.setForeground(new java.awt.Color(0, 0, 0));
        carta32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta32.setBorder(null);
        carta32.setBorderPainted(false);
        carta32.setContentAreaFilled(false);
        carta32.setFocusable(false);
        carta32.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta32ActionPerformed(evt);
            }
        });

        carta33.setForeground(new java.awt.Color(0, 0, 0));
        carta33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta33.setBorder(null);
        carta33.setBorderPainted(false);
        carta33.setContentAreaFilled(false);
        carta33.setFocusable(false);
        carta33.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta33ActionPerformed(evt);
            }
        });

        carta34.setForeground(new java.awt.Color(0, 0, 0));
        carta34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta34.setBorder(null);
        carta34.setBorderPainted(false);
        carta34.setContentAreaFilled(false);
        carta34.setFocusable(false);
        carta34.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta34ActionPerformed(evt);
            }
        });

        carta35.setForeground(new java.awt.Color(0, 0, 0));
        carta35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta35.setBorder(null);
        carta35.setBorderPainted(false);
        carta35.setContentAreaFilled(false);
        carta35.setFocusable(false);
        carta35.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta35ActionPerformed(evt);
            }
        });

        carta36.setForeground(new java.awt.Color(0, 0, 0));
        carta36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta36.setBorder(null);
        carta36.setBorderPainted(false);
        carta36.setContentAreaFilled(false);
        carta36.setFocusable(false);
        carta36.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta36ActionPerformed(evt);
            }
        });

        carta37.setForeground(new java.awt.Color(0, 0, 0));
        carta37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta37.setBorder(null);
        carta37.setBorderPainted(false);
        carta37.setContentAreaFilled(false);
        carta37.setFocusable(false);
        carta37.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta37ActionPerformed(evt);
            }
        });

        carta38.setForeground(new java.awt.Color(0, 0, 0));
        carta38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta38.setBorder(null);
        carta38.setBorderPainted(false);
        carta38.setContentAreaFilled(false);
        carta38.setFocusable(false);
        carta38.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta38ActionPerformed(evt);
            }
        });

        carta39.setForeground(new java.awt.Color(0, 0, 0));
        carta39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta39.setBorder(null);
        carta39.setBorderPainted(false);
        carta39.setContentAreaFilled(false);
        carta39.setFocusable(false);
        carta39.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta39ActionPerformed(evt);
            }
        });

        carta40.setForeground(new java.awt.Color(0, 0, 0));
        carta40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/linuxadminhero.png"))); // NOI18N
        carta40.setBorder(null);
        carta40.setBorderPainted(false);
        carta40.setContentAreaFilled(false);
        carta40.setFocusable(false);
        carta40.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/mouseOver.png"))); // NOI18N
        carta40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta40ActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(carta16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(carta13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carta11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(carta32, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta29, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta28, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta25, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta31, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(carta24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(carta17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(carta40, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta38, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta37, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta36, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta35, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta34, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carta33, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carta16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carta24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(carta29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(carta25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(carta30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carta40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Dadafe Memory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed
        botonHabilitar(carta2);
    }//GEN-LAST:event_carta2ActionPerformed

    private void carta10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta10ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta10);
    }//GEN-LAST:event_carta10ActionPerformed

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta1);
    }//GEN-LAST:event_carta1ActionPerformed

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta3);
    }//GEN-LAST:event_carta3ActionPerformed

    private void carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta4ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta4);
    }//GEN-LAST:event_carta4ActionPerformed

    private void carta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta5ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta5);
    }//GEN-LAST:event_carta5ActionPerformed

    private void carta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta6ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta6);
    }//GEN-LAST:event_carta6ActionPerformed

    private void carta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta7ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta7);
    }//GEN-LAST:event_carta7ActionPerformed

    private void carta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta8ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta8);
    }//GEN-LAST:event_carta8ActionPerformed

    private void carta16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta16ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta16);
    }//GEN-LAST:event_carta16ActionPerformed

    private void carta12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta12ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta12);
    }//GEN-LAST:event_carta12ActionPerformed

    private void carta13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta13ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta13);
    }//GEN-LAST:event_carta13ActionPerformed

    private void carta14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta14ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta14);
    }//GEN-LAST:event_carta14ActionPerformed

    private void carta15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta15ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta15);
    }//GEN-LAST:event_carta15ActionPerformed

    private void carta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta9ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta9);
    }//GEN-LAST:event_carta9ActionPerformed

    private void carta11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta11ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta11);
    }//GEN-LAST:event_carta11ActionPerformed

    private void carta24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta24ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta24);
    }//GEN-LAST:event_carta24ActionPerformed

    private void carta23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta23ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta23);
    }//GEN-LAST:event_carta23ActionPerformed

    private void carta22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta22ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta22);
    }//GEN-LAST:event_carta22ActionPerformed

    private void carta21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta21ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta21);
    }//GEN-LAST:event_carta21ActionPerformed

    private void carta20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta20ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta20);
    }//GEN-LAST:event_carta20ActionPerformed

    private void carta19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta19ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta19);
    }//GEN-LAST:event_carta19ActionPerformed

    private void carta18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta18ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta18);
    }//GEN-LAST:event_carta18ActionPerformed

    private void carta17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta17ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta17);
    }//GEN-LAST:event_carta17ActionPerformed

    private void carta32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta32ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta32);

    }//GEN-LAST:event_carta32ActionPerformed

    private void carta31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta31ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta31);
    }//GEN-LAST:event_carta31ActionPerformed

    private void carta30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta30ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta30);
    }//GEN-LAST:event_carta30ActionPerformed

    private void carta29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta29ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta29);
    }//GEN-LAST:event_carta29ActionPerformed

    private void carta28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta28ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta28);
    }//GEN-LAST:event_carta28ActionPerformed

    private void carta27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta27ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta27);
    }//GEN-LAST:event_carta27ActionPerformed

    private void carta26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta26ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta26);
    }//GEN-LAST:event_carta26ActionPerformed

    private void carta25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta25ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta25);
    }//GEN-LAST:event_carta25ActionPerformed

    private void carta40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta40ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta40);
    }//GEN-LAST:event_carta40ActionPerformed

    private void carta39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta39ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta39);
    }//GEN-LAST:event_carta39ActionPerformed

    private void carta38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta38ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta38);
    }//GEN-LAST:event_carta38ActionPerformed

    private void carta37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta37ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta37);
    }//GEN-LAST:event_carta37ActionPerformed

    private void carta36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta36ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta36);
    }//GEN-LAST:event_carta36ActionPerformed

    private void carta35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta35ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta35);
    }//GEN-LAST:event_carta35ActionPerformed

    private void carta34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta34ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta34);
    }//GEN-LAST:event_carta34ActionPerformed

    private void carta33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta33ActionPerformed
        // TODO add your handling code here:
        botonHabilitar(carta33);
    }//GEN-LAST:event_carta33ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Juego().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta10;
    private javax.swing.JButton carta11;
    private javax.swing.JButton carta12;
    private javax.swing.JButton carta13;
    private javax.swing.JButton carta14;
    private javax.swing.JButton carta15;
    private javax.swing.JButton carta16;
    private javax.swing.JButton carta17;
    private javax.swing.JButton carta18;
    private javax.swing.JButton carta19;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta20;
    private javax.swing.JButton carta21;
    private javax.swing.JButton carta22;
    private javax.swing.JButton carta23;
    private javax.swing.JButton carta24;
    private javax.swing.JButton carta25;
    private javax.swing.JButton carta26;
    private javax.swing.JButton carta27;
    private javax.swing.JButton carta28;
    private javax.swing.JButton carta29;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta30;
    private javax.swing.JButton carta31;
    private javax.swing.JButton carta32;
    private javax.swing.JButton carta33;
    private javax.swing.JButton carta34;
    private javax.swing.JButton carta35;
    private javax.swing.JButton carta36;
    private javax.swing.JButton carta37;
    private javax.swing.JButton carta38;
    private javax.swing.JButton carta39;
    private javax.swing.JButton carta4;
    private javax.swing.JButton carta40;
    private javax.swing.JButton carta5;
    private javax.swing.JButton carta6;
    private javax.swing.JButton carta7;
    private javax.swing.JButton carta8;
    private javax.swing.JButton carta9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
