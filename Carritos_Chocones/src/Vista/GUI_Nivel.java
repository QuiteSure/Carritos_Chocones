/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Personaje;
import Modelo.Hilo_Fondo;
import Modelo.Hilo_Personaje;
import javax.swing.JLabel;

/**
 *
 * @author franp
 */
public class GUI_Nivel extends javax.swing.JFrame {

    Hilo_Fondo hiloFondo;
    Hilo_Personaje personaje;
    Controlador_Personaje controladorPersonaje;

    /**
     * Creates new form GUI_Nivel
     */
    public GUI_Nivel() {
        initComponents();
        this.hiloFondo = new Hilo_Fondo(this);
        this.personaje= new Hilo_Personaje(this);
        hiloFondo.start();// esto ejecuta el método run de hiloFondo
        this.setSize(944, 805);
        this.setAlwaysOnTop(true);
        this.controladorPersonaje= new Controlador_Personaje(this, this.personaje);
        this.addKeyListener(controladorPersonaje);
    }

    public JLabel getFondo() {
        return this.jl_Fondo;
    }

    public JLabel getPersonaje() {
        return this.jl_Personaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Personaje = new javax.swing.JLabel();
        jl_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jl_Personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro_azul.png"))); // NOI18N
        getContentPane().add(jl_Personaje);
        jl_Personaje.setBounds(430, 570, 90, 120);

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_juego_version2.png"))); // NOI18N
        jl_Fondo.setText("jLabel1");
        getContentPane().add(jl_Fondo);
        jl_Fondo.setBounds(0, -440, 950, 1190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Nivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Personaje;
    // End of variables declaration//GEN-END:variables
}
