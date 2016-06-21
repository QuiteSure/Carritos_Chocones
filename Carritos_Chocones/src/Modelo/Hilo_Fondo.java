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
public class Hilo_Fondo extends Thread {

    GUI_Nivel gui;

    public Hilo_Fondo(GUI_Nivel gui) {
        this.gui = gui;
    }

    public JLabel getFondo() {
        return gui.getFondo(); //fondo.getFondo() o getFondo()
    }

    public void moverFondo() {
        if (getFondo().getY()+15>=0) {
            getFondo().setLocation(0, getFondo().getY()-745);
        } else {
            getFondo().setLocation(getFondo().getX(), getFondo().getY() + 25);
        }
    }

    public void run() {
        try {
            while (true) {
                sleep(500);
                this.moverFondo();
            }
        } catch (Exception e) {
            System.out.println("Excepcion en Hilo_Fondo.run(): " + e);
        }
    }

}
