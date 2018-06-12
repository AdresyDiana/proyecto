package controlador;

import java.awt.event.ActionEvent;
import modelo.Equipos;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class ControladorEquipos {
    
    public void controlarAccion (String accion, Equipos unEquipo){
        switch(accion){
            case "Insertar":
                unEquipo.insertar();
                break;
            case "Modificar":
                unEquipo.modificar();
                break;
            case "Eliminar":
                unEquipo.eliminar();
                break;
        }
    }
    
}
