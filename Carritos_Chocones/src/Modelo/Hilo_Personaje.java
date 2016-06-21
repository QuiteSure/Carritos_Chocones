/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.GUI_Nivel;
import javax.swing.JLabel;

/**
 *
 * @author franp
 */
public class Hilo_Personaje {

    GUI_Nivel gui;

    public Hilo_Personaje(GUI_Nivel gui) {
        this.gui = gui;
    }

    public JLabel getPersonaje() {
        return gui.getPersonaje();
    }

    public void moverDerecha() {
        if (getPersonaje().getX() + 175 >= 730) {
            System.out.println("No puede pasar de 397");
        } else {
            getPersonaje().setLocation(getPersonaje().getX() + 175, getPersonaje().getY());
        }
    }

    public void moverIzquierda() {
        if (getPersonaje().getX() - 175 <= 180) {
            System.out.println("No puede mover a la izquierda");
        } else {
            getPersonaje().setLocation(getPersonaje().getX() - 175, getPersonaje().getY());
        }
    }

    public void run() {
        try {

        } catch (Exception e) {
            System.out.println("Excepcion en Hilo_Personaje.run(): " + e);
        }
    }
}
