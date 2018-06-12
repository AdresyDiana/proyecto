/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class temp {

    private int noreporte;
    private String Tempmax;
    private String Tempmin;
    private String Tempp;
    private String Templm;
    private String Templmn;
    private String hummax;
    private String hummin;
    private String hump;
    private String humlm;
    private String humlmn;
    private String finicio;
    private String ffin;
    private String obser;
    private String tipodetoma;

    public int getNoreporte() {
        return noreporte;
    }

    public void setNoreporte(int noreporte) {
        this.noreporte = noreporte;
    }

    public String getTempmax() {
        return Tempmax;
    }

    public void setTempmax(String Tempmax) {
        this.Tempmax = Tempmax;
    }

    public String getTempmin() {
        return Tempmin;
    }

    public void setTempmin(String Tempmin) {
        this.Tempmin = Tempmin;
    }

    public String getTempp() {
        return Tempp;
    }

    public void setTempp(String Tempp) {
        this.Tempp = Tempp;
    }

    public String getTemplm() {
        return Templm;
    }

    public void setTemplm(String Templm) {
        this.Templm = Templm;
    }

    public String getTemplmn() {
        return Templmn;
    }

    public void setTemplmn(String Templmn) {
        this.Templmn = Templmn;
    }

    public String getHummax() {
        return hummax;
    }

    public void setHummax(String hummax) {
        this.hummax = hummax;
    }

    public String getHummin() {
        return hummin;
    }

    public void setHummin(String hummin) {
        this.hummin = hummin;
    }

    public String getHump() {
        return hump;
    }

    public void setHump(String hump) {
        this.hump = hump;
    }

    public String getHumlm() {
        return humlm;
    }

    public void setHumlm(String humlm) {
        this.humlm = humlm;
    }

    public String getHumlmn() {
        return humlmn;
    }

    public void setHumlmn(String humlmn) {
        this.humlmn = humlmn;
    }

    public String getFinicio() {
        return finicio;
    }

    public void setFinicio(String finicio) {
        this.finicio = finicio;
    }

    public String getFfin() {
        return ffin;
    }

    public void setFfin(String ffin) {
        this.ffin = ffin;
    }

    public String getObser() {
        return obser;
    }

    public void setObser(String obser) {
        this.obser = obser;
    }

    public String getTipodetoma() {
        return tipodetoma;
    }

    public void setTipodetoma(String tipodetoma) {
        this.tipodetoma = tipodetoma;
    }

    @Override
    public String toString() {
        return "temp{" + "tipodetoma=" + tipodetoma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final temp other = (temp) obj;
        if (this.noreporte != other.noreporte) {
            return false;
        }
        return true;
    }
    
    


    public Iterator<temp> listar() {
        ArrayList<temp> lostemp = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM temp");
            ResultSet rs = sql.executeQuery();
            temp unTemp;
            while (rs.next()) {
                unTemp = new temp();
                unTemp.setNoreporte(rs.getInt("noreporte"));
                unTemp.setTempmax(rs.getString("tempmax"));
                unTemp.setTempmin(rs.getString("tempmin"));
                unTemp.setTempp(rs.getString("tempp"));
                unTemp.setTemplm(rs.getString("templm"));
                unTemp.setTemplmn(rs.getString("templmn"));
                unTemp.setHummax(rs.getString("hummax"));
                unTemp.setHummin(rs.getString("hummin"));
                unTemp.setHump(rs.getString("hump"));
                unTemp.setHumlm(rs.getString("humlm"));
                unTemp.setHumlmn(rs.getString("humlmn"));
                unTemp.setFinicio(rs.getString("finicio"));
                unTemp.setFfin(rs.getString("ffin"));
                unTemp.setObser(rs.getString("obser"));
                unTemp.setTipodetoma(rs.getString("tipodetoma"));
                lostemp.add(unTemp);
            }
        } catch (SQLException ex) {
            System.err.println("no se obtienen datos" + ex.getMessage());
        }
        if (lostemp.isEmpty()) {
            temp mitemp = new temp();
            mitemp.setTipodetoma("no hay registros");
            lostemp.add(mitemp);
        }
        return lostemp.iterator();
    }

    public void Insertar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO temp "
                    + "(tempmax, tempmin, tempp, templm, templmn,hummax, hummin, hump, humlm, humlmn, finicio, ffin, obser, tipodetoma) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
            sql.setString(1, this.getTempmax());
            sql.setString(2, this.getTempmin());
            sql.setString(3, this.getTempp());
            sql.setString(4, this.getTemplm());
            sql.setString(5, this.getTemplmn());
            sql.setString(6, this.getHummax());
            sql.setString(7, this.getHummin());
            sql.setString(8, this.getHump());
            sql.setString(9, this.getHumlm());
            sql.setString(10, this.getHumlmn());
            sql.setString(11, this.getFinicio());
            sql.setString(12, this.getFfin());
            sql.setString(13, this.getObser());
            sql.setString(14, this.getTipodetoma());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + "Insertado Correctamente");
            JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Insertar" + ex.getMessage());
        }
    }

}
