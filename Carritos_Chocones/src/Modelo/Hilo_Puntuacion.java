/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.GUI_Nivel;

/**
 *
 * @author franp
 */
public class Hilo_Puntuacion extends Thread{
    GUI_Nivel guiNivel;
    int puntuacion=0;
    
    public Hilo_Puntuacion(GUI_Nivel guiNivel){
        this.guiNivel= guiNivel;
        this.puntuacion=0;
    }
    
    public void aumentarPuntuacion(boolean perdio){
        if (perdio){ //Si el usuario perdió (true) entonces no se debe seguir aumentando a la cantidad
        
        }else{
            this.puntuacion+=10;
            guiNivel.getJL_Puntuacion().setText(""+puntuacion);
        }
    }
    
    public void run(){
        try{
            while (true){
                sleep(2500);
                aumentarPuntuacion(false);//Cambiar esta variable cuando hayan colisiones y demás
            }
        }catch(Exception exception){
            System.out.println("Excepción en el método run() de Hilo_Puntuacion "+exception);
        }
    }
}
