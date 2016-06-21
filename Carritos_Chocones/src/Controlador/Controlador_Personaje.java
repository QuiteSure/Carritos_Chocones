/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hilo_Fondo;
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
    Hilo_Fondo fondo;

    public Controlador_Personaje(GUI_Nivel gui, Hilo_Personaje personaje, Hilo_Fondo fondo) {
        this.gui = gui;
        this.personaje = personaje;
        this.fondo = fondo;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            personaje.moverDerecha();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            personaje.moverIzquierda();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Estripó Enter");
            this.fondo.start();
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            personaje.moverDerecha();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            personaje.moverIzquierda();
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Estripó Enter");

        }
    }

    @Override
    public void keyReleased(KeyEvent event) {

    }

}
