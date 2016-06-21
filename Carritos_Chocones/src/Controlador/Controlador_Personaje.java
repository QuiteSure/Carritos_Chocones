/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hilo_Personaje;
import Vista.GUI_Nivel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author franp
 */
public class Controlador_Personaje implements KeyListener {

    GUI_Nivel gui;
    Hilo_Personaje personaje;

    public Controlador_Personaje(GUI_Nivel gui, Hilo_Personaje personaje) {
        this.gui = gui;
        this.personaje = personaje;
    }

    @Override
    public void keyTyped(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
            personaje.moverDerecha();
        }
        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
            personaje.moverIzquierda();
        }
    }

    @Override
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
            personaje.moverDerecha();
        }
        if (event.getKeyCode() == KeyEvent.VK_LEFT) {
            personaje.moverIzquierda();
        }
    }

    @Override
    public void keyReleased(KeyEvent event) {

    }

}
