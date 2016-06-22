/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Menu;
import Controlador.Controlador_Nivel;
import Controlador.Controlador_Personaje;
import Modelo.Hilo_Enemigo;
import Modelo.Hilo_Fondo;
import Modelo.Hilo_Personaje;
import java.util.ArrayList;
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
    ArrayList<JLabel> enemigos;
    Hilo_Enemigo hiloEnemigo;

    /**
     * Creates new form GUI_Nivel
     */
    public GUI_Nivel() {
        initComponents();
        this.hiloFondo = new Hilo_Fondo(this);
        this.personaje = new Hilo_Personaje(this);
        this.hiloEnemigo = new Hilo_Enemigo(this);
//        hiloFondo.start();// esto ejecuta el método run de hiloFondo
        this.setSize(861, 805);
        this.setTitle("Carritos Chocones");
        this.controladorPersonaje = new Controlador_Personaje(this, this.personaje, this.hiloFondo);
        this.addKeyListener(controladorPersonaje);
        this.controladorNivel = new Controlador_Nivel(this, this.hiloFondo, this.hiloEnemigo);
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

    public ArrayList arrayEnemigos() {
        return this.enemigos;
    }

    public void moverEnemigoAbajo() {
        for (int indice = 0; indice < enemigos.size(); indice++) {
            enemigos.get(indice).setLocation(enemigos.get(indice).getX(), enemigos.get(indice).getY() + 15);
        }
    }

    public void setFondo() {
        if (Controlador_Menu.velocidadNivel == 300) {
            jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_juego_Final.png")));
        }
        if (Controlador_Menu.velocidadNivel == 150) {
            jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo juego 2_Final.png")));
        }
        if (Controlador_Menu.velocidadNivel == 100) {
            jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo juego 3_Final.png")));
        }
    }

    /* 
    Carril 1: 250
    Carril 2: 420
    Carril 3: 570
     */
    public JLabel setNuevoEnemigo(int identificador) {
        JLabel jl_Enemigo = new JLabel();
        int ubicacionRandomX = 0;
        int random = 1 + (int) (Math.random() * 3);
        switch (random) {
            case 1:
                ubicacionRandomX = 250;
                break;
            case 2:
                ubicacionRandomX = 420;
                break;
            case 3:
                ubicacionRandomX = 570;
                break;
            default:;
        }
        switch (identificador) {
            case 1:
                jl_Enemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro_verde.png")));
                getContentPane().add(jl_Enemigo);
                jl_Enemigo.setBounds(ubicacionRandomX, 400, 86, 112); //setBounds(x, y, width, height)
                break;
            case 2:
                jl_Enemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro_azul.png")));
                getContentPane().add(jl_Enemigo);
                jl_Enemigo.setBounds(ubicacionRandomX, -100, 86, 112); //setBounds(x, y, width, height)
                break;
            case 3:
                jl_Enemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro_morado.png")));
                getContentPane().add(jl_Enemigo);
                jl_Enemigo.setBounds(ubicacionRandomX, -100, 86, 112); //setBounds(x, y, width, height)
                break;
            case 4:
                jl_Enemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro_amarillo.png")));
                getContentPane().add(jl_Enemigo);
                jl_Enemigo.setBounds(ubicacionRandomX, -100, 86, 112); //setBounds(x, y, width, height)
                break;
            default:;
        }
        enemigos.add(jl_Enemigo);
        return jl_Enemigo;
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

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo_juego_Final.png"))); // NOI18N
        jl_Fondo.setDisabledIcon(null);
        getContentPane().add(jl_Fondo);
        jl_Fondo.setBounds(0, -1900, 860, 2650);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Fondo;
    private javax.swing.JLabel jl_Personaje;
    // End of variables declaration//GEN-END:variables
}
