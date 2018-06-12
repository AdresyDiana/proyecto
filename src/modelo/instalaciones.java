/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this instalacioneslate file, choose Tools | Templates
 * and open the instalacioneslate in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author GLOBAL
 */
public class instalaciones {

    private int idinspeccion;
    private String area;
    private String identificacion;
    private String fecharevision;
    private String observacion;
    private String resultadoinspec;

    public int getIdinspeccion() {
        return idinspeccion;
    }

    public void setIdinspeccion(int idinspeccion) {
        this.idinspeccion = idinspeccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFecharevision() {
        return fecharevision;
    }

    public void setFecharevision(String fecharevision) {
        this.fecharevision = fecharevision;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getResultadoinspec() {
        return resultadoinspec;
    }

    public void setResultadoinspec(String resultadoinspec) {
        this.resultadoinspec = resultadoinspec;
    }

    @Override
    public String toString() {
        return "instalaciones{" + "area=" + area + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final instalaciones other = (instalaciones) obj;
        if (this.idinspeccion != other.idinspeccion) {
            return false;
        }
        return true;
    }

    public Iterator<instalaciones> listar() {

        ArrayList<instalaciones> losinstalaciones = new ArrayList<>();

        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM " + this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            instalaciones unasInstalaciones;
            while (rs.next()) {
                unasInstalaciones = new instalaciones();
                unasInstalaciones.setIdinspeccion(rs.getInt("idinspeccion"));
                unasInstalaciones.setArea(rs.getString("area"));
                unasInstalaciones.setIdentificacion(rs.getString("identidficacion"));
                unasInstalaciones.setFecharevision(rs.getString("fecharevision"));
                unasInstalaciones.setObservacion(rs.getString("obserinsta"));
                unasInstalaciones.setResultadoinspec(rs.getString("resulinsp"));

                losinstalaciones.add(unasInstalaciones);
            }
        } catch (SQLException ex) {
            System.err.println("no se obtienen datos" + ex.getMessage());
        }

        return losinstalaciones.iterator();

    }

    public void Guardar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO instalaciones" + "(area,identificacion,fecharevision,obserinsta,resulinsp) "
                    + "VALUES(?,?,?,?,?)");

            sql.setString(1, this.getArea());
            sql.setString(2, this.getIdentificacion());
            sql.setString(3, this.getFecharevision());
            sql.setString(4, this.getObservacion());
            sql.setString(5, this.getResultadoinspec());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertado Correctamente");
            System.out.println(this.getClass().getSimpleName() + "Insertado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Insertar" + ex.getMessage());
        }
    }

}
