/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hilo_Enemigo;
import Modelo.Hilo_Fondo;
import Vista.GUI_Nivel;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 *
 * @author franp
 */
public class Controlador_Nivel implements ComponentListener {

    GUI_Nivel guiNivel;
    Hilo_Fondo hiloFondo;
    Hilo_Enemigo hiloEnemigo;

    public Controlador_Nivel(GUI_Nivel guiNivel, Hilo_Fondo hiloFondo, Hilo_Enemigo hiloEnemigo) {
        this.guiNivel = guiNivel;
        this.hiloFondo = hiloFondo;
        this.hiloEnemigo = hiloEnemigo;
    }

    @Override
    public void componentResized(ComponentEvent componentEvent) {

    }

    @Override
    public void componentMoved(ComponentEvent componentEvent) {

    }

    @Override
    public void componentShown(ComponentEvent componentEvent) {
        try {
            guiNivel.setFondo();
            this.hiloFondo.start();
            hiloEnemigo.start();
        } catch (Exception e) {
            System.out.println("Exception en componentShown() -> hiloFondo.start() " + e);
        }
    }

    @Override
    public void componentHidden(ComponentEvent componentEvent) {

    }

}
