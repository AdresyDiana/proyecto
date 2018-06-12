/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.instalaciones;

/**
 *
 * @author GLOBAL
 */
public class controladorinstalacion {
 
    public void controladoraccion(String Accion, instalaciones unasinstalaciones ){

        switch(Accion){
            case "Guardar":
              unasinstalaciones.Guardar();
              break;
        }
    }
    
}
