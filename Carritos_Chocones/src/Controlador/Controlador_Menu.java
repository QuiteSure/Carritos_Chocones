/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.GUI_Menu;
import Vista.GUI_Nivel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author franp
 */
public class Controlador_Menu implements KeyListener, ActionListener {

    GUI_Menu guiMenu;
    GUI_Nivel guiNivel;

    public Controlador_Menu(GUI_Menu guiMenu, GUI_Nivel guiNivel) {
        this.guiMenu = guiMenu;
        this.guiMenu.addKeyListener(this);
        this.guiNivel = guiNivel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Nivel 1")) {
            System.out.println("Nivel 1");
        }
        if (event.getActionCommand().equals("Nivel 2")) {
            System.out.println("Nivel 2");
        }
        if (event.getActionCommand().equals("Nivel 3")) {
            System.out.println("Nivel 3");
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent2) {
        if (keyEvent2.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Estripó Enter");
            guiNivel.setVisible(true);
            guiNivel.setAlwaysOnTop(true);
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent2) {
        if (keyEvent2.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Estripó Enter");
            guiNivel.setVisible(true);
            guiNivel.setAlwaysOnTop(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent2) {

    }

}
