package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class fisicoquimicooo {

    private String fecharecepc;
    private String controlinterno;
    private String horainianalisis;
    private String horafinanalisis;
    private String fechinianalisis;
    private String fechfinanalisis;
    private String humedadrelatinicio;
    private String humedadreltfin;
    private String tempambientinic;
    private String tempatambientfin;
    private String fechensayo;
    private String ph;
    private String conducti;
    private String color;
    private String turbiedad;
    private String clororecidulibre;
    private String calcio;
    private String alcalinidad;
    private String cloruros;
    private String dureza;
    private String hierro;
    private String sulfato;
    private String nitrito;
    private String nitrato;
    private String aluminio;
    private String fosfato;
    private String clorolibre;
    private String otros;
    private String aplica;
    private String codintmues;
    private String responsable;
    private String observaciones;
    private String obsanalisis;
    private String fechpreparacion;
    private String horapreparacion;
    private String fechaconteo;
    private String horaconteo;
    private String coliformes;
    private String escherichia;
    private String mesolitos;
    private String aplicacont;
    private String respconteo;
    private String obsconteo;
    private String obsgeconteo;
    private String codmuestra;

    public String getFecharecepc() {
        return fecharecepc;
    }

    public void setFecharecepc(String fecharecepc) {
        this.fecharecepc = fecharecepc;
    }

    public String getControlinterno() {
        return controlinterno;
    }

    public void setControlinterno(String controlinterno) {
        this.controlinterno = controlinterno;
    }

    public String getHorainianalisis() {
        return horainianalisis;
    }

    public void setHorainianalisis(String horainicanalisis) {
        this.horainianalisis = horainicanalisis;
    }

    public String getHorafinanalisis() {
        return horafinanalisis;
    }

    public void setHorafinanalisis(String horafinanalisis) {
        this.horafinanalisis = horafinanalisis;
    }

    public String getFechinianalisis() {
        return fechinianalisis;
    }

    public void setFechinianalisis(String fechinianalisis) {
        this.fechinianalisis = fechinianalisis;
    }

    public String getFechfinanalisis() {
        return fechfinanalisis;
    }

    public void setFechfinanalisis(String fechfinanalisis) {
        this.fechfinanalisis = fechfinanalisis;
    }

    public String getHumedadrelatinicio() {
        return humedadrelatinicio;
    }

    public void setHumedadrelatinicio(String humedadrelatinicio) {
        this.humedadrelatinicio = humedadrelatinicio;
    }

    public String getHumedadreltfin() {
        return humedadreltfin;
    }

    public void setHumedadreltfin(String humedadreltfin) {
        this.humedadreltfin = humedadreltfin;
    }

    public String getTempambientinic() {
        return tempambientinic;
    }

    public void setTempambientinic(String tempambientinic) {
        this.tempambientinic = tempambientinic;
    }

    public String getTempatambientfin() {
        return tempatambientfin;
    }

    public void setTempatambientfin(String tempatambientfin) {
        this.tempatambientfin = tempatambientfin;
    }

    public String getFechensayo() {
        return fechensayo;
    }

    public void setFechensayo(String fechensayo) {
        this.fechensayo = fechensayo;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getConducti() {
        return conducti;
    }

    public void setConducti(String conducti) {
        this.conducti = conducti;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTurbiedad() {
        return turbiedad;
    }

    public void setTurbiedad(String turbiedad) {
        this.turbiedad = turbiedad;
    }

    public String getClororecidulibre() {
        return clororecidulibre;
    }

    public void setClororecidulibre(String clororeducilibre) {
        this.clororecidulibre = clororeducilibre;
    }

    public String getCalcio() {
        return calcio;
    }

    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    public String getAlcalinidad() {
        return alcalinidad;
    }

    public void setAlcalinidad(String alcalinidad) {
        this.alcalinidad = alcalinidad;
    }

    public String getCloruros() {
        return cloruros;
    }

    public void setCloruros(String cloruros) {
        this.cloruros = cloruros;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public String getHierro() {
        return hierro;
    }

    public void setHierro(String hierro) {
        this.hierro = hierro;
    }

    public String getSulfato() {
        return sulfato;
    }

    public void setSulfato(String sulfato) {
        this.sulfato = sulfato;
    }

    public String getNitrito() {
        return nitrito;
    }

    public void setNitrito(String nitrito) {
        this.nitrito = nitrito;
    }

    public String getNitrato() {
        return nitrato;
    }

    public void setNitrato(String nitrato) {
        this.nitrato = nitrato;
    }

    public String getAluminio() {
        return aluminio;
    }

    public void setAluminio(String aluminio) {
        this.aluminio = aluminio;
    }

    public String getFosfato() {
        return fosfato;
    }

    public void setFosfato(String fosfato) {
        this.fosfato = fosfato;
    }

    public String getClorolibre() {
        return clorolibre;
    }

    public void setClorolibre(String clorolibre) {
        this.clorolibre = clorolibre;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getAplica() {
        return aplica;
    }

    public void setAplica(String aplica) {
        this.aplica = aplica;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObsanalisis() {
        return obsanalisis;
    }

    public void setObsanalisis(String obsanalisis) {
        this.obsanalisis = obsanalisis;
    }

    public String getFechpreparacion() {
        return fechpreparacion;
    }

    public void setFechpreparacion(String fechpreparacion) {
        this.fechpreparacion = fechpreparacion;
    }

    public String getHorapreparacion() {
        return horapreparacion;
    }

    public void setHorapreparacion(String horapreparacion) {
        this.horapreparacion = horapreparacion;
    }

    public String getFechaconteo() {
        return fechaconteo;
    }

    public void setFechaconteo(String fechaconteo) {
        this.fechaconteo = fechaconteo;
    }

    public String getHoraconteo() {
        return horaconteo;
    }

    public void setHoraconteo(String horaconteo) {
        this.horaconteo = horaconteo;
    }

    public String getColiformes() {
        return coliformes;
    }

    public void setColiformes(String coliformes) {
        this.coliformes = coliformes;
    }

    public String getEscherichia() {
        return escherichia;
    }

    public void setEscherichia(String escherichia) {
        this.escherichia = escherichia;
    }

    public String getAplicacont() {
        return aplicacont;
    }

    public void setAplicacont(String aplicacont) {
        this.aplicacont = aplicacont;
    }

    public String getRespconteo() {
        return respconteo;
    }

    public void setRespconteo(String respconteo) {
        this.respconteo = respconteo;
    }

    public String getObsconteo() {
        return obsconteo;
    }

    public void setObsconteo(String obsconteo) {
        this.obsconteo = obsconteo;
    }

    public String getObsgeconteo() {
        return obsgeconteo;
    }

    public void setObsgeconteo(String obsgeconteo) {
        this.obsgeconteo = obsgeconteo;
    }

    public String getCodintmues() {
        return codintmues;
    }

    public void setCodintmues(String codintmues) {
        this.codintmues = codintmues;
    }

    public String getMesolitos() {
        return mesolitos;
    }

    public void setMesolitos(String mesolitos) {
        this.mesolitos = mesolitos;
    }

    public String getCodmuestra() {
        return codmuestra;
    }

    public void setCodmuestra(String codmuestra) {
        this.codmuestra = codmuestra;
    }

    public Iterator<fisicoquimicooo> listar() {
        ArrayList<fisicoquimicooo> losFisi = new ArrayList<>();
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("SELECT * FROM  fisicoquimico");
            ResultSet rs = sql.executeQuery();
            fisicoquimicooo unFisi;
            while (rs.next()) {
                unFisi = new fisicoquimicooo();
                unFisi.setFecharecepc(rs.getString("fecharecepc"));
                unFisi.setControlinterno(rs.getString("controlinterno"));
                unFisi.setHorainianalisis(rs.getString("horainianalisis"));
                unFisi.setHorafinanalisis(rs.getString("horafinanalisis"));
                unFisi.setFechinianalisis(rs.getString("fechinianalisis"));
                unFisi.setFechfinanalisis(rs.getString("fechfinanalisis"));
                unFisi.setHumedadrelatinicio(rs.getString("humedadrelatinicio"));
                unFisi.setHumedadreltfin(rs.getString("humedadreltfin"));
                unFisi.setTempambientinic(rs.getString("tempambientinic"));
                unFisi.setTempatambientfin(rs.getString("tempatambientfin"));
                unFisi.setFechensayo(rs.getString("fechensayo"));
                unFisi.setPh(rs.getString("ph"));
                unFisi.setConducti(rs.getString("conducti"));
                unFisi.setColor(rs.getString("color"));
                unFisi.setTurbiedad(rs.getString("turbiedad"));
                unFisi.setClororecidulibre(rs.getString("clororecidulibre"));
                unFisi.setCalcio(rs.getString("calcio"));
                unFisi.setAlcalinidad(rs.getString("alcalinidad"));
                unFisi.setCloruros(rs.getString("cloruros"));
                unFisi.setDureza(rs.getString("dureza"));
                unFisi.setHierro(rs.getString("hierro"));
                unFisi.setSulfato(rs.getString("sulfato"));
                unFisi.setNitrito(rs.getString("nitrito"));
                unFisi.setNitrato(rs.getString("nitrato"));
                unFisi.setAluminio(rs.getString("aluminio"));
                unFisi.setFosfato(rs.getString("fosfato"));
                unFisi.setClorolibre(rs.getString("clorolibre"));
                unFisi.setOtros(rs.getString("otros"));
                unFisi.setAplica(rs.getString("aplica"));
                unFisi.setCodintmues(rs.getString("codintmues"));
                unFisi.setResponsable(rs.getString("responsable"));
                unFisi.setObservaciones(rs.getString("observaciones"));
                unFisi.setObsanalisis(rs.getString("obsanalisis"));
                unFisi.setFechpreparacion(rs.getString("fechpreparacion"));
                unFisi.setHorapreparacion(rs.getString("horapreparacion"));
                unFisi.setFechaconteo(rs.getString("fechaconteo"));
                unFisi.setHoraconteo(rs.getString("horaconteo"));
                unFisi.setColiformes(rs.getString("coliformes"));
                unFisi.setEscherichia(rs.getString("escherichia"));
                unFisi.setMesolitos(rs.getString("mesolitos"));
                unFisi.setAplicacont(rs.getString("aplicacont"));
                unFisi.setRespconteo(rs.getString("respconteo"));
                unFisi.setControlinterno(rs.getString("controlinterno"));
                unFisi.setObsgeconteo(rs.getString("obsgeconteo"));
                losFisi.add(unFisi);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar el reporte fisicoquimico: " + ex.getMessage());
        }
        if (losFisi.isEmpty()) {
            fisicoquimicooo fisico = new fisicoquimicooo();
            fisico.setControlinterno("No hay reporte fisicoquimico");
            losFisi.add(fisico);
        }
        return losFisi.iterator();
    }

    public void insertar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO fisicoquimico "
                    + "(fecharecepc, controlinterno, horainianalisis, horafinanalisis, fechinianalisis, fechfinanalisis, humedadrelatinicio, humedadreltfin, tempambientinic, tempatambientfin, fechensayo, ph, conducti, color, turbiedad, clororecidulibre, calcio, alcalinidad, cloruros, dureza, hierro, sulfato, nitrito, nitrato, aluminio, fosfato, clorolibre, otros, aplica, codintmues, responsable, observaciones, obsanalisis, fechpreparacion, horapreparacion, fechaconteo, horaconteo, coliformes, escherichia, mesolitos, aplicacont, respconteo, obsconteo, obsgeconteo,codigomuestra)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            sql.setString(1, this.getFecharecepc());
            sql.setString(2, this.getControlinterno());
            sql.setString(3, this.getHorainianalisis());
            sql.setString(4, this.getHorafinanalisis());
            sql.setString(5, this.getFechinianalisis());
            sql.setString(6, this.getFechfinanalisis());
            sql.setString(7, this.getHumedadrelatinicio());
            sql.setString(8, this.getHumedadreltfin());
            sql.setString(9, this.getTempambientinic());
            sql.setString(10, this.getTempatambientfin());
            sql.setString(11, this.getFechensayo());
            sql.setString(12, this.getPh());
            sql.setString(13, this.getConducti());
            sql.setString(14, this.getColor());
            sql.setString(15, this.getTurbiedad());
            sql.setString(16, this.getClororecidulibre());
            sql.setString(17, this.getCalcio());
            sql.setString(18, this.getAlcalinidad());
            sql.setString(19, this.getCloruros());
            sql.setString(20, this.getDureza());
            sql.setString(21, this.getHierro());
            sql.setString(22, this.getSulfato());
            sql.setString(23, this.getNitrito());
            sql.setString(24, this.getNitrato());
            sql.setString(25, this.getAluminio());
            sql.setString(26, this.getFosfato());
            sql.setString(27, this.getClorolibre());
            sql.setString(28, this.getOtros());
            sql.setString(29, this.getAplica());
            sql.setString(30, this.getCodintmues());
            sql.setString(31, this.getResponsable());
            sql.setString(32, this.getObservaciones());
            sql.setString(33, this.getObsanalisis());
            sql.setString(34, this.getFechpreparacion());
            sql.setString(35, this.getHorapreparacion());
            sql.setString(36, this.getFechaconteo());
            sql.setString(37, this.getHoraconteo());
            sql.setString(38, this.getColiformes());
            sql.setString(39, this.getEscherichia());
            sql.setString(40, this.getMesolitos());
            sql.setString(41, this.getAplicacont());
            sql.setString(42, this.getRespconteo());
            sql.setString(43, this.getObsconteo());
            sql.setString(44, this.getObsgeconteo());
            sql.setString(45, this.getCodmuestra());
            sql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los datos fueron ingresados correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }
    }

    public void modificar() {
        try {
            PreparedStatement sql = conexion.connection.prepareStatement("UPDATE fisicoquimico SET fecharecepc=?, horainianalisis=?, horafinanalisis=?, fechinianalisis=?, fechfinanalisis=?, humedadrelatinicio=?, humedadreltfin=?, tempambientinic=?, tempatambientfin=?, fechensayo=?, ph=?, conducti=?, color=?, turbiedad=?, clororecidulibre=?, calcio=?, alcalinidad=?, cloruros=?, dureza=?, hierro=?, sulfato=?, nitrito=?, nitrato=?, aluminio=?, fosfato=?, clorolibre=?, otros=?, aplica=?, codintmues=?, responsable=?, observaciones=?, obsanalisis=?, fechpreparacion=?, horapreparacion=?, fechaconteo=?, horaconteo=?, coliformes=?, escherichia=?, mesolitos=?, aplicacont=?, respconteo=?, obsconteo=?, obsgeconteo =?, codigomuestra=? WHERE controlinterno=?");

            sql.setString(1, this.getFecharecepc());
            sql.setString(2, this.getHorainianalisis());
            sql.setString(3, this.getHorafinanalisis());
            sql.setString(4, this.getFechinianalisis());
            sql.setString(5, this.getFechfinanalisis());
            sql.setString(6, this.getHumedadrelatinicio());
            sql.setString(7, this.getHumedadreltfin());
            sql.setString(8, this.getTempambientinic());
            sql.setString(9, this.getTempatambientfin());
            sql.setString(10, this.getFechensayo());
            sql.setString(11, this.getPh());
            sql.setString(12, this.getConducti());
            sql.setString(13, this.getColor());
            sql.setString(14, this.getTurbiedad());
            sql.setString(15, this.getClororecidulibre());
            sql.setString(16, this.getCalcio());
            sql.setString(17, this.getAlcalinidad());
            sql.setString(18, this.getCloruros());
            sql.setString(19, this.getDureza());
            sql.setString(20, this.getHierro());
            sql.setString(21, this.getSulfato());
            sql.setString(22, this.getNitrito());
            sql.setString(23, this.getNitrato());
            sql.setString(24, this.getAluminio());
            sql.setString(25, this.getFosfato());
            sql.setString(26, this.getClorolibre());
            sql.setString(27, this.getOtros());
            sql.setString(28, this.getAplica());
            sql.setString(29, this.getCodintmues());
            sql.setString(30, this.getResponsable());
            sql.setString(31, this.getObservaciones());
            sql.setString(32, this.getObsanalisis());
            sql.setString(33, this.getFechpreparacion());
            sql.setString(34, this.getHorapreparacion());
            sql.setString(35, this.getFechaconteo());
            sql.setString(36, this.getHoraconteo());
            sql.setString(37, this.getColiformes());
            sql.setString(38, this.getEscherichia());
            sql.setString(39, this.getMesolitos());
            sql.setString(40, this.getAplicacont());
            sql.setString(41, this.getRespconteo());
            sql.setString(42, this.getObsconteo());
            sql.setString(43, this.getObsgeconteo());
            sql.setString(44, this.getCodmuestra());
            sql.setString(45, this.getControlinterno());
            sql.executeUpdate();

            JOptionPane.showMessageDialog(null, " " + this.getClass().getSimpleName() + " fue modificado correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + ex.getMessage());
        }
    }

    public Iterator<fisicoquimicooo> buscar(String busqueda) {
        ArrayList<fisicoquimicooo> losFisi = new ArrayList<>();
        try {
            Statement sql = conexion.connection.createStatement();
            ResultSet rs = sql.executeQuery("SELECT * FROM fisicoquimico WHERE controlinterno = '" + getControlinterno() + "'");

            fisicoquimicooo fisic = new fisicoquimicooo();
            rs.next();
            fisic.setFecharecepc(rs.getString("fecharecepc"));
            fisic.setControlinterno(rs.getString("controlinterno"));
            fisic.setHorainianalisis(rs.getString("horainianalisis"));
            fisic.setHorafinanalisis(rs.getString("horafinanalisis"));
            fisic.setFechinianalisis(rs.getString("fechinianalisis"));
            fisic.setFechfinanalisis(rs.getString("fechfinanalisis"));
            fisic.setHumedadrelatinicio(rs.getString("humedadrelatinicio"));
            fisic.setHumedadreltfin(rs.getString("humedadreltfin"));
            fisic.setTempambientinic(rs.getString("tempambientinic"));
            fisic.setTempatambientfin(rs.getString("tempatambientfin"));
            fisic.setFechensayo(rs.getString("fechensayo"));
            fisic.setPh(rs.getString("ph"));
            fisic.setConducti(rs.getString("conducti"));
            fisic.setColor(rs.getString("color"));
            fisic.setTurbiedad(rs.getString("turbiedad"));
            fisic.setClororecidulibre(rs.getString("clororecidulibre"));
            fisic.setCalcio(rs.getString("calcio"));
            fisic.setAlcalinidad(rs.getString("alcalinidad"));
            fisic.setCloruros(rs.getString("cloruros"));
            fisic.setDureza(rs.getString("dureza"));
            fisic.setHierro(rs.getString("hierro"));
            fisic.setSulfato(rs.getString("sulfato"));
            fisic.setNitrito(rs.getString("nitrito"));
            fisic.setNitrato(rs.getString("nitrato"));
            fisic.setAluminio(rs.getString("aluminio"));
            fisic.setFosfato(rs.getString("fosfato"));
            fisic.setClorolibre(rs.getString("clorolibre"));
            fisic.setOtros(rs.getString("otros"));
            fisic.setAplica(rs.getString("aplica"));
            fisic.setCodintmues(rs.getString("codintmues"));
            fisic.setResponsable(rs.getString("responsable"));
            fisic.setObservaciones(rs.getString("observaciones"));
            fisic.setObsanalisis(rs.getString("obsanalisis"));
            fisic.setFechpreparacion(rs.getString("fechpreparacion"));
            fisic.setHorapreparacion(rs.getString("horapreparacion"));
            fisic.setFechaconteo(rs.getString("fechaconteo"));
            fisic.setHoraconteo(rs.getString("horaconteo"));
            fisic.setColiformes(rs.getString("coliformes"));
            fisic.setEscherichia(rs.getString("escherichia"));
            fisic.setMesolitos(rs.getString("mesolitos"));
            fisic.setAplicacont(rs.getString("aplicacont"));
            fisic.setObsconteo(rs.getString("obsconteo"));
            fisic.setRespconteo(rs.getString("respconteo"));
            fisic.setControlinterno(rs.getString("controlinterno"));
            fisic.setObsgeconteo(rs.getString("obsgeconteo"));
            fisic.setCodmuestra(rs.getString("codigomuestra"));
            losFisi.add(fisic);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + ex.getMessage());
        }
        return losFisi.iterator();
    }
}
