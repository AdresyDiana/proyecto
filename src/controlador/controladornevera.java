/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.Action;

import modelo.temp;

/**
 *
 * @author GLOBAL
 */
public class controladornevera {
    
    public void controladoraccion(String evento, temp untemp ){
        switch(evento){
            case "Insertar":
              untemp.Insertar();
              break;
        }
    }
    
    
}
