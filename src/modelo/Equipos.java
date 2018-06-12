package modelo;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class Equipos {

    private int nu;
    private String nomequipo;
    private String marcaequi;
    private String modeloequi;
    private String noserie;
    private String proveedorequi;
    private String area;
    private String placasena;
    private String contratono;
    private String garantiaequi;
    private String fechaequi;
    private String fechacompra;
    private String fechainicion;
    private String accesorios;
    private String frerecomante;
    private String frerecorevi;
    private String frerecocali;
    private String preventivoequi;
    private String verificacionequi;
    private String calibracionequi;
    private String descripcionacti;
    private String especificaciones;
    private String funcionequi;
    private String manualequi;
    private String tempmax;
    private String tempmin;
    private String humax;
    private String humin;
    private String energiaequi;
    private String obserequi;
    private FileInputStream foto1;
    private int foto2;

    public int getNu() {
        return nu;
    }

    public void setNu(int nu) {
        this.nu = nu;
    }

    public String getNomequipo() {
        return nomequipo;
    }

    public void setNomequipo(String nomequipo) {
        this.nomequipo = nomequipo;
    }

    public String getMarcaequi() {
        return marcaequi;
    }

    public void setMarcaequi(String marcaequi) {
        this.marcaequi = marcaequi;
    }

    public String getModeloequi() {
        return modeloequi;
    }

    public void setModeloequi(String modeloequi) {
        this.modeloequi = modeloequi;
    }

    public String getNoserie() {
        return noserie;
    }

    public void setNoserie(String noserie) {
        this.noserie = noserie;
    }

    public String getProveedorequi() {
        return proveedorequi;
    }

    public void setProveedorequi(String proveedorequi) {
        this.proveedorequi = proveedorequi;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPlacasena() {
        return placasena;
    }

    public void setPlacasena(String placasena) {
        this.placasena = placasena;
    }

    public String getContratono() {
        return contratono;
    }

    public void setContratono(String contratono) {
        this.contratono = contratono;
    }

    public String getGarantiaequi() {
        return garantiaequi;
    }

    public void setGarantiaequi(String garantiaequi) {
        this.garantiaequi = garantiaequi;
    }

    public String getFechaequi() {
        return fechaequi;
    }

    public void setFechaequi(String fechaequi) {
        this.fechaequi = fechaequi;
    }

    public String getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(String fechacompra) {
        this.fechacompra = fechacompra;
    }

    public String getFechainicion() {
        return fechainicion;
    }

    public void setFechainicion(String fechainicion) {
        this.fechainicion = fechainicion;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public String getFrerecomante() {
        return frerecomante;
    }

    public void setFrerecomante(String frerecomante) {
        this.frerecomante = frerecomante;
    }

    public String getFrerecorevi() {
        return frerecorevi;
    }

    public void setFrerecorevi(String frerecorevi) {
        this.frerecorevi = frerecorevi;
    }

    public String getFrerecocali() {
        return frerecocali;
    }

    public void setFrerecocali(String frerecocali) {
        this.frerecocali = frerecocali;
    }

    public String getPreventivoequi() {
        return preventivoequi;
    }

    public void setPreventivoequi(String preventivoequi) {
        this.preventivoequi = preventivoequi;
    }

    public String getVerificacionequi() {
        return verificacionequi;
    }

    public void setVerificacionequi(String verificacionequi) {
        this.verificacionequi = verificacionequi;
    }

    public String getCalibracionequi() {
        return calibracionequi;
    }

    public void setCalibracionequi(String calibracionequi) {
        this.calibracionequi = calibracionequi;
    }

    public String getDescripcionacti() {
        return descripcionacti;
    }

    public void setDescripcionacti(String descripcionacti) {
        this.descripcionacti = descripcionacti;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public String getFuncionequi() {
        return funcionequi;
    }

    public void setFuncionequi(String funcionequi) {
        this.funcionequi = funcionequi;
    }

    public String getManualequi() {
        return manualequi;
    }

    public void setManualequi(String manualequi) {
        this.manualequi = manualequi;
    }

    public String getTempmax() {
        return tempmax;
    }

    public void setTempmax(String tempmax) {
        this.tempmax = tempmax;
    }

    public String getTempmin() {
        return tempmin;
    }

    public void setTempmin(String tempmin) {
        this.tempmin = tempmin;
    }

    public String getHumax() {
        return humax;
    }

    public void setHumax(String humax) {
        this.humax = humax;
    }

    public String getHumin() {
        return humin;
    }

    public void setHumin(String humin) {
        this.humin = humin;
    }

    public String getEnergiaequi() {
        return energiaequi;
    }

    public void setEnergiaequi(String energiaequi) {
        this.energiaequi = energiaequi;
    }

    public String getObserequi() {
        return obserequi;
    }

    public void setObserequi(String obserequi) {
        this.obserequi = obserequi;
    }

    public FileInputStream getFoto1() {
        return foto1;
    }

    public void setFoto1(FileInputStream foto1) {
        this.foto1 = foto1;
    }

    public int getFoto2() {
        return foto2;
    }

    public void setFoto2(int foto2) {
        this.foto2 = foto2;
    }

    public Iterator<Equipos> listar() {
        ArrayList<Equipos> losEquipos = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM  equipos");
            ResultSet rs = sql.executeQuery();
            Equipos unEquipo;
            while (rs.next()) {
                unEquipo = new Equipos();
                unEquipo.setNu(rs.getInt("nu"));
                unEquipo.setNomequipo(rs.getString("nomequipo"));
                unEquipo.setMarcaequi(rs.getString("marcaequi"));
                unEquipo.setModeloequi(rs.getString("modeloequi"));
                unEquipo.setNoserie(rs.getString("noserie"));
                unEquipo.setProveedorequi(rs.getString("proveedorequi"));
                unEquipo.setArea(rs.getString("area"));
                unEquipo.setPlacasena(rs.getString("placasena"));
                unEquipo.setContratono(rs.getString("contratono"));
                unEquipo.setGarantiaequi(rs.getString("garantiaequi"));
                unEquipo.setFechaequi(rs.getString("fechaequi"));
                unEquipo.setFechacompra(rs.getString("fechacompra"));
                unEquipo.setFechainicion(rs.getString("fechainicion"));
                unEquipo.setAccesorios(rs.getString("accesorios"));
                unEquipo.setFrerecomante(rs.getString("frerecomante"));
                unEquipo.setFrerecorevi(rs.getString("frerecorevi"));
                unEquipo.setFrerecocali(rs.getString("frerecocali"));
                unEquipo.setPreventivoequi(rs.getString("preventivoequi"));
                unEquipo.setVerificacionequi(rs.getString("verificacionequi"));
                unEquipo.setCalibracionequi(rs.getString("calibracionequi"));
                unEquipo.setDescripcionacti(rs.getString("descripcionacti"));
                unEquipo.setEspecificaciones(rs.getString("especificaciones"));
                unEquipo.setFuncionequi(rs.getString("funcionequi"));
                unEquipo.setManualequi(rs.getString("manualequi"));
                unEquipo.setTempmax(rs.getString("tempmax"));
                unEquipo.setTempmin(rs.getString("tempmin"));
                unEquipo.setHumax(rs.getString("humax"));
                unEquipo.setHumin(rs.getString("humin"));
                unEquipo.setEnergiaequi(rs.getString("energiaequi"));
                unEquipo.setObserequi(rs.getString("obserequi"));
                losEquipos.add(unEquipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar equipo: " + ex.getMessage());
        }
        if (losEquipos.isEmpty()) {
            Equipos miEquipo = new Equipos();
            miEquipo.setNomequipo("No hay equipo");
            losEquipos.add(miEquipo);
        }
        return losEquipos.iterator();
    }

    public void insertar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO equipos "
                    + "(nomequipo, marcaequi, modeloequi, noserie, proveedorequi, area, placasena, contratono, garantiaequi, fechaequi, fechacompra, fechainicion, accesorios, frerecomante, frerecorevi, frerecocali, preventivoequi, verificacionequi, calibracionequi, descripcionacti, especificaciones, funcionequi, manualequi, tempmax, tempmin, humax, humin, energiaequi, obserequi, foto)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            sql.setString(1, this.getNomequipo());
            sql.setString(2, this.getMarcaequi());
            sql.setString(3, this.getModeloequi());
            sql.setString(4, this.getNoserie());
            sql.setString(5, this.getProveedorequi());
            sql.setString(6, this.getArea());
            sql.setString(7, this.getPlacasena());
            sql.setString(8, this.getContratono());
            sql.setString(9, this.getGarantiaequi());
            sql.setString(10, this.getFechaequi());
            sql.setString(11, this.getFechacompra());
            sql.setString(12, this.getFechainicion());
            sql.setString(13, this.getAccesorios());
            sql.setString(14, this.getFrerecomante());
            sql.setString(15, this.getFrerecorevi());
            sql.setString(16, this.getFrerecocali());
            sql.setString(17, this.getPreventivoequi());
            sql.setString(18, this.getVerificacionequi());
            sql.setString(19, this.getCalibracionequi());
            sql.setString(20, this.getDescripcionacti());
            sql.setString(21, this.getEspecificaciones());
            sql.setString(22, this.getFuncionequi());
            sql.setString(23, this.getManualequi());
            sql.setString(24, this.getTempmax());
            sql.setString(25, this.getTempmin());
            sql.setString(26, this.getHumax());
            sql.setString(27, this.getHumin());
            sql.setString(28, this.getEnergiaequi());
            sql.setString(29, this.getObserequi());
            sql.setBinaryStream(30, this.getFoto1(), this.getFoto2());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }
    }

    public void modificar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("UPDATE equipos SET nomequipo=?, marcaequi=?, modeloequi=?, noserie=?, proveedorequi=?, area=?, placasena=?, contratono=?, garantiaequi=?, fechaequi=?, fechacompra=?, fechainicion=?, accesorios=?, frerecomante=?, frerecorevi=?, frerecocali=?, preventivoequi=?, verificacionequi=?, calibracionequi=?, descripcionacti=?, especificaciones=?, funcionequi=?, manualequi=?, tempmax=?, tempmin=?, humax=?, humin=?, energiaequi=?, obserequi=?, foto=? WHERE nu=?");

            sql.setString(1, this.getNomequipo());
            sql.setString(2, this.getMarcaequi());
            sql.setString(3, this.getModeloequi());
            sql.setString(4, this.getNoserie());
            sql.setString(5, this.getProveedorequi());
            sql.setString(6, this.getArea());
            sql.setString(7, this.getPlacasena());
            sql.setString(8, this.getContratono());
            sql.setString(9, this.getGarantiaequi());
            sql.setString(10, this.getFechaequi());
            sql.setString(11, this.getFechacompra());
            sql.setString(12, this.getFechainicion());
            sql.setString(13, this.getAccesorios());
            sql.setString(14, this.getFrerecomante());
            sql.setString(15, this.getFrerecorevi());
            sql.setString(16, this.getFrerecocali());
            sql.setString(17, this.getPreventivoequi());
            sql.setString(18, this.getVerificacionequi());
            sql.setString(19, this.getCalibracionequi());
            sql.setString(20, this.getDescripcionacti());
            sql.setString(21, this.getEspecificaciones());
            sql.setString(22, this.getFuncionequi());
            sql.setString(23, this.getManualequi());
            sql.setString(24, this.getTempmax());
            sql.setString(25, this.getTempmin());
            sql.setString(26, this.getHumax());
            sql.setString(27, this.getHumin());
            sql.setString(28, this.getEnergiaequi());
            sql.setString(29, this.getObserequi());
            sql.setBinaryStream(30, this.getFoto1(), this.getFoto2());
            sql.setInt(31, this.getNu());
            sql.executeUpdate();

            JOptionPane.showMessageDialog(null, " " + this.getClass().getSimpleName() + " fue modificado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
        }
    }

    public void eliminar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("DELETE FROM equipos WHERE noserie = ? ");
            sql.setString(1, this.getNoserie());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Equipo eliminado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el equipo " + ex.getMessage());
        }
    }

    public Iterator<Equipos> buscar(String busqueda) {
        ArrayList<Equipos> losEquipos = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM equipos WHERE noserie = ?");
            sql.setString(1, busqueda);
            ResultSet rs = sql.executeQuery();
            Equipos unEquipos = new Equipos();
            rs.next();
            unEquipos.setNu(rs.getInt("nu"));
            unEquipos.setNomequipo(rs.getString("nomequipo"));
            unEquipos.setMarcaequi(rs.getString("marcaequi"));
            unEquipos.setModeloequi(rs.getString("modeloequi"));
            unEquipos.setNoserie(rs.getString("noserie"));
            unEquipos.setProveedorequi(rs.getString("proveedorequi"));
            unEquipos.setArea(rs.getString("area"));
            unEquipos.setPlacasena(rs.getString("placasena"));
            unEquipos.setContratono(rs.getString("contratono"));
            unEquipos.setGarantiaequi(rs.getString("garantiaequi"));
            unEquipos.setFechaequi(rs.getString("fechaequi"));
            unEquipos.setFechacompra(rs.getString("fechacompra"));
            unEquipos.setFechainicion(rs.getString("fechainicion"));
            unEquipos.setAccesorios(rs.getString("accesorios"));
            unEquipos.setFrerecomante(rs.getString("frerecomante"));
            unEquipos.setFrerecorevi(rs.getString("frerecorevi"));
            unEquipos.setFrerecocali(rs.getString("frerecocali"));
            unEquipos.setPreventivoequi(rs.getString("preventivoequi"));
            unEquipos.setVerificacionequi(rs.getString("verificacionequi"));
            unEquipos.setCalibracionequi(rs.getString("calibracionequi"));
            unEquipos.setDescripcionacti(rs.getString("descripcionacti"));
            unEquipos.setEspecificaciones(rs.getString("especificaciones"));
            unEquipos.setFuncionequi(rs.getString("funcionequi"));
            unEquipos.setManualequi(rs.getString("manualequi"));
            unEquipos.setTempmax(rs.getString("tempmax"));
            unEquipos.setTempmin(rs.getString("tempmin"));
            unEquipos.setHumax(rs.getString("humax"));
            unEquipos.setHumin(rs.getString("humin"));
            unEquipos.setEnergiaequi(rs.getString("energiaequi"));
            unEquipos.setObserequi(rs.getString("obserequi"));
            losEquipos.add(unEquipos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
        }
        return losEquipos.iterator();
    }

//    public Equipos buscar(int elId) {
//        Equipos unEquipo = new Equipos();
//        unEquipo.setNomequipo("Equipo no existe");
//        try {
//            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM equipos WHERE noserie = ?, OR nomequipo = ?, OR placasena = ?");
//            sql.setInt(1, elId);
//            ResultSet rs = sql.executeQuery();
//            while (rs.next()) {
//                unEquipo.setNu(rs.getInt("Nu"));
//                unEquipo.setNomequipo(rs.getString("nomequipo"));
//                unEquipo.setMarcaequi(rs.getString("marcaequi"));
//                unEquipo.setModeloequi(rs.getString("modeloequi"));
//                unEquipo.setNoserie(rs.getString("noserie"));
//                unEquipo.setProveedorequi(rs.getString("proveedorequi"));
//                unEquipo.setArea(rs.getString("area"));
//                unEquipo.setPlacasena(rs.getString("placasena"));
//                unEquipo.setContratono(rs.getString("contratono"));
//                unEquipo.setGarantiaequi(rs.getString("garantiaequi"));
//                unEquipo.setFechaequi(rs.getString("fechaequi"));
//                unEquipo.setFechacompra(rs.getString("fechacompra"));
//                unEquipo.setFechainicion(rs.getString("fechainicion"));
//                unEquipo.setAccesorios(rs.getString("accesorios"));
//                unEquipo.setFrerecomante(rs.getString("frerecomante"));
//                unEquipo.setFrerecorevi(rs.getString("frerecorevi"));
//                unEquipo.setFrerecocali(rs.getString("frerecocali"));
//                unEquipo.setPreventivoequi(rs.getString("preventivoequi"));
//                unEquipo.setVerificacionequi(rs.getString("verificacionequi"));
//                unEquipo.setCalibracionequi(rs.getString("calibracionequi"));
//                unEquipo.setDescripcionacti(rs.getString("descripcionacti"));
//                unEquipo.setEspecificaciones(rs.getString("especificaciones"));
//                unEquipo.setFuncionequi(rs.getString("funcionequi"));
//                unEquipo.setHojavidaequi(rs.getString("hojavidaequi"));
//                unEquipo.setManualequi(rs.getString("manualequi"));
//                unEquipo.setTempmax(rs.getString("tempmax"));
//                unEquipo.setTempmin(rs.getString("tempmin"));
//                unEquipo.setHumax(rs.getString("humax"));
//                unEquipo.setHumin(rs.getString("humin"));
//                unEquipo.setEnergiaequi(rs.getString("energiaequi"));
//                unEquipo.setObserequi(rs.getString("obserequi"));
//            }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al buscar por No Serie " + ex.getMessage());
//        }
//        return unEquipo;
//    }
}
