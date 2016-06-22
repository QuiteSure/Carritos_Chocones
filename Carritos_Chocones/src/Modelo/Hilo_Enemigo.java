/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.GUI_Nivel;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author franp
 */
public class Hilo_Enemigo extends Thread {

    GUI_Nivel guiNivel;

    public Hilo_Enemigo(GUI_Nivel guiNivel) {
        this.guiNivel = guiNivel;
    }

    public void generarEnemigo() {
        int identificador = 1 + (int) (Math.random() * 4);
        JLabel enemigo = guiNivel.setNuevoEnemigo(identificador);
        guiNivel.arrayEnemigos().add(enemigo);
//        this.enemigos.add(guiNivel.setNuevoEnemigo(identificador));  
    }

    public void desecharEnemigo() {
        ArrayList<JLabel> enemigos = guiNivel.arrayEnemigos();
        for (int indice = 0; indice < enemigos.size(); indice++) {
            if (enemigos.get(indice).getY() >= 805) {
                enemigos.get(indice).remove(guiNivel);
                guiNivel.arrayEnemigos().remove(indice);
            }
        }
    }

    public void moverEnemigoAbajo() {
        guiNivel.moverEnemigoAbajo();
//        ArrayList<JLabel> enemigos = guiNivel.arrayEnemigos();
//        for (int indice = 0; indice < enemigos.size(); indice++) {
//            enemigos.get(indice).setLocation(enemigos.get(indice).getX(), enemigos.get(indice).getY() + 15);
//            guiNivel.arrayEnemigos().get(indice);
//        }
    }

    public void run() {
        try {
            while (true) {
                sleep(1000);
                generarEnemigo();
                moverEnemigoAbajo();
                desecharEnemigo();
            }
        } catch (Exception exception) {
            System.out.println("Excepción es el método run de HiloEnemigo" + exception);
        }
    }
}
