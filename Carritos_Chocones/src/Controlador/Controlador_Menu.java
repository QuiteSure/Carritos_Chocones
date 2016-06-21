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
public class Controlador_Menu implements ActionListener, KeyListener{

    GUI_Nivel guiNivel;
    GUI_Menu guiMenu;
    
    public Controlador_Menu(GUI_Nivel guiNivel, GUI_Menu guiMenu){
        this.guiNivel= guiNivel;
        this.guiMenu= guiMenu;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("Estripó Enter");
            guiNivel.setVisible(true);
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
           if (keyEvent.getKeyCode()== KeyEvent.VK_ENTER){
            System.out.println("Estripó Enter");
            guiNivel.setVisible(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        
    }
    
}
