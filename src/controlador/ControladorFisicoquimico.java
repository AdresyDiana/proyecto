package controlador;

import modelo.fisicoquimicooo;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class ControladorFisicoquimico {

    public void controlarAccion(String accion, fisicoquimicooo unFisi) {
        switch (accion) {
            case "Insertar":
                unFisi.insertar();
                break;
            case "Modificar":
                unFisi.modificar();
                break;
        }
    }

}
