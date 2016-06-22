/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Nivel;
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
    Controlador_Nivel controladorNivel;

    /**
     * Creates new form GUI_Nivel
     */
    public GUI_Nivel() {
        initComponents();
        this.hiloFondo = new Hilo_Fondo(this);
        this.personaje = new Hilo_Personaje(this);
//        hiloFondo.start();// esto ejecuta el método run de hiloFondo
        this.setSize(861, 805);
        this.setTitle("Carritos Chocones");
        this.controladorPersonaje = new Controlador_Personaje(this, this.personaje, this.hiloFondo);
        this.addKeyListener(controladorPersonaje);
        this.controladorNivel= new Controlador_Nivel(this, this.hiloFondo);
        this.addComponentListener(controladorNivel);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
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
        jl_Personaje.setBounds(390, 580, 90, 120);

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_juego.png"))); // NOI18N
        getContentPane().add(jl_Fondo);
        jl_Fondo.setBounds(0, -1160, 860, 1910);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Personaje;
    // End of variables declaration//GEN-END:variables
}
