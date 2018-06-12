/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.controladornevera;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.conexion;
import modelo.temp;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;


/**
 *
 * @author GLOBAL
 */
public class validacioncon extends javax.swing.JInternalFrame {



    TimeSeries series = new TimeSeries("Temperatura maxima", Second.class);
    TimeSeries series2 = new TimeSeries("Temperatura minima", Second.class);
    TimeSeries series3 = new TimeSeries("Temperatura promedio", Second.class);
    TimeSeries series4 = new TimeSeries("Temperatura maxima limite", Second.class);
    TimeSeries series5 = new TimeSeries("Temperatura minima limite", Second.class);

    TimeSeriesCollection datos = new TimeSeriesCollection();
    
    TimeSeries series6 = new TimeSeries("Temperatura maxima", Second.class);
    TimeSeries series7 = new TimeSeries("Temperatura minima", Second.class);
    TimeSeries series8 = new TimeSeries("Temperatura promedio", Second.class);
    TimeSeries series9 = new TimeSeries("Temperatura maxima limite", Second.class);
    TimeSeries series10 = new TimeSeries("Temperatura minima limite", Second.class);
    
    TimeSeriesCollection datos2 = new TimeSeriesCollection();
    
    TimeSeries series11 = new TimeSeries("Humedad maxima", Second.class);
    TimeSeries series12 = new TimeSeries("Humedad minima", Second.class);
    TimeSeries series13 = new TimeSeries("Humedad promedio", Second.class);
    TimeSeries series14 = new TimeSeries("Humedad maxima limite", Second.class);
    TimeSeries series15 = new TimeSeries("Humedad minima limite", Second.class);
    
    TimeSeriesCollection datos3 = new TimeSeriesCollection();
    
    
    SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yy HH:mm:ss");

    controladornevera controlar = new controladornevera();

    /**
     * Creates new form validacioncon
     * @throws java.text.ParseException
     */
    public validacioncon() throws ParseException {
        conexion.getInstance();
        initComponents();
        setSize(1200, 600);
        setLocation(100, 30);
        llenarymostrargrafica();
        limpiarformulario();
        
    }
    
    
    
    
    public void llenarymostrargrafica(){
        datos.addSeries(series);
        datos.addSeries(series2);
        datos.addSeries(series3);
        datos.addSeries(series4);
        datos.addSeries(series5);

        JFreeChart grafica = ChartFactory.createTimeSeriesChart("Grafica de Temperatura", "Tiempo", "Temperatura", datos, true, true, true);

        ChartPanel mg1 = new ChartPanel(grafica);
        mg1.setBounds(10, 10, 550, 400);
        mg1.setLayout(new BorderLayout(0, 0));
        gn.add(mg1, BorderLayout.CENTER);
        
        
        datos2.addSeries(series6);
        datos2.addSeries(series7);
        datos2.addSeries(series8);
        datos2.addSeries(series9);
        datos2.addSeries(series10);
        
        JFreeChart grafica2 = ChartFactory.createTimeSeriesChart("Grafica de temperatura", "Tiempo", "Temperatura", datos2, true, true, true);
        ChartPanel mg2 = new ChartPanel(grafica2);
        mg2.setBounds(10,10,550,400);
        mg2.setLayout(new BorderLayout(0,0));
        datalo.add(mg2,BorderLayout.CENTER);
        
        datos3.addSeries(series11);
        datos3.addSeries(series12);
        datos3.addSeries(series13);
        datos3.addSeries(series14);
        datos3.addSeries(series15);
        
        JFreeChart grafica3 = ChartFactory.createTimeSeriesChart("Grafica de Humedad", "Tiempo", "Humedad", datos3, true, true, true);
        ChartPanel mg3 = new ChartPanel(grafica3);
        mg3.setBounds(10,10,550,400);
        mg3.setLayout(new BorderLayout(0,0));
        datalo2.add(mg3,BorderLayout.CENTER);
 
    }

    private void limpiarformulario() throws ParseException {
        id.setValue(0);
        tm.setText("Ingrese temperatura maxima");
        tmn.setText("ingrese temperatura minima");
        hummax.setText("Ingrese humedad maxima");
        hummin.setText("Ingrese humedad minima");
        obser.setText("Ingrese la observacion");
        tml.setValue(0);
        tmnl.setValue(0);
        Insertar.setEnabled(false);
        re.setEnabled(false);
        re.setVisible(false);
        id.setVisible(false);
        id.setValue(0);
        tml.setVisible(false);
        tml.setValue(0);
        tmnl.setVisible(false);
        tmnl.setValue(0);
        tm.setEnabled(true);
        tmn.setEnabled(true);
        obser.setEnabled(false);
        Insertar.setEnabled(false);
        tmd.setVisible(false);
        tmnd.setVisible(false);
        tpd.setVisible(false);
        nor.setValue(0);
        fechaini.setEnabled(false);
        fechafin.setEnabled(false);
        tmp.setEnabled(false);
        tmp.setText("");
        nor.setVisible(false);
        hummax.setEnabled(false);
        hummin.setEnabled(false);
        hump.setEnabled(false);
        hump.setText("");
        huml.setValue(0);
        humlm.setValue(0);
        huml.setVisible(false);
        humlm.setVisible(false);
        valid.setEnabled(false);
        fechaini.setText("");
        fechafin.setText("");
        
        tpt.setSelectedIndex(0);
        llenarTabla(title);
        llenargrafica();
    }

    public void llenarTabla(String text) {

        temp unTemp = new temp();
        DefaultTableModel tabla = (DefaultTableModel) this.TABLAT.getModel();
        Iterator<temp> itTemp = unTemp.listar();
        Object[] filatemp = new Object[TABLAT.getColumnCount()];
        tabla.setRowCount(0);
        while (itTemp.hasNext()) {
            unTemp = itTemp.next();

            filatemp[0] = unTemp.getNoreporte();
            filatemp[1] = unTemp.getTempmax();
            filatemp[2] = unTemp.getTempmin();
            filatemp[3] = unTemp.getTempp();
            filatemp[4] = unTemp.getTemplm();
            filatemp[5] = unTemp.getTemplmn();
            filatemp[6] = unTemp.getHummax();
            filatemp[7] = unTemp.getHummin();
            filatemp[8] = unTemp.getHump();
            filatemp[9] = unTemp.getHumlm();
            filatemp[10] = unTemp.getHumlmn();
            filatemp[11] = unTemp.getFinicio();
            filatemp[12] = unTemp.getFfin();
            filatemp[13] = unTemp.getObser();
            filatemp[14] = unTemp.getTipodetoma();
            tabla.addRow(filatemp);
            
        }
    }

    public void llenargrafica() throws ParseException {

       
       
        
        for (int i = 0; i < TABLAT.getRowCount(); i++) {
            if (TABLAT.getValueAt(i, 14).equals("Nevera")) {
            Date  d = formato.parse((String) TABLAT.getValueAt(i, 11));
            series.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
            series2.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
            series3.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
            series4.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
            series5.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
        }
            else if (TABLAT.getValueAt(i, 14).equals("Dataloyed")) {
            Date  d = formato.parse((String) TABLAT.getValueAt(i, 11));
            series6.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 1))));
            series7.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 2))));
            series8.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 3))));
            series9.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 4))));
            series10.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 5))));
            
            series11.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 6))));
            series12.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 7))));
            series13.addOrUpdate(new Second(d), (Double.parseDouble((String) TABLAT.getValueAt(i, 8))));
            series14.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 9))));
            series15.addOrUpdate(new Second(d), (Integer.parseInt((String) TABLAT.getValueAt(i, 10)))); 
            }

        }
         
    }

    private temp obtenertemp() {
        
        temp lostemp = new temp();
        lostemp.setTempmax(tm.getText());
        lostemp.setTempmin(tmn.getText());
        lostemp.setTempp(tmp.getText());
        lostemp.setTemplm(tml.getText());
        lostemp.setTemplmn(tmnl.getText());
        lostemp.setFinicio(fecha.getText());
        lostemp.setObser(obser.getText());
        lostemp.setTipodetoma((String) tpt.getSelectedItem());
        return lostemp;

    }
    
    
    private temp obtenertemp2(){
        
        temp lostemp = new temp();
        lostemp.setTempmax(tm.getText());
        lostemp.setTempmin(tmn.getText());
        lostemp.setTempp(tmp.getText());
        lostemp.setTemplm(tml.getText());
        lostemp.setTemplmn(tmnl.getText());
        lostemp.setHummax(hummax.getText());
        lostemp.setHummin(hummin.getText());
        lostemp.setHump(hump.getText());
        lostemp.setHumlm(huml.getText());
        lostemp.setHumlmn(humlm.getText());
        lostemp.setFinicio(fechaini.getText());
        lostemp.setFfin(fechafin.getText());
        lostemp.setObser(obser.getText());
        lostemp.setTipodetoma((String) tpt.getSelectedItem());
        return lostemp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladouble = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaenteros = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TABLAT = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        tmn = new javax.swing.JTextField();
        tm = new javax.swing.JTextField();
        id = new javax.swing.JFormattedTextField();
        tml = new javax.swing.JFormattedTextField();
        tmnl = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obser = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        fechaini = new javax.swing.JFormattedTextField();
        fechafin = new javax.swing.JFormattedTextField();
        nor = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tpt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hummax = new javax.swing.JTextField();
        hummin = new javax.swing.JTextField();
        hump = new javax.swing.JTextField();
        huml = new javax.swing.JFormattedTextField();
        humlm = new javax.swing.JFormattedTextField();
        valid = new javax.swing.JButton();
        Insertar = new javax.swing.JButton();
        re = new javax.swing.JTextField();
        never = new javax.swing.JTabbedPane();
        gn = new javax.swing.JPanel();
        datalo = new javax.swing.JPanel();
        datalo2 = new javax.swing.JPanel();
        tmd = new javax.swing.JFormattedTextField();
        tmnd = new javax.swing.JFormattedTextField();
        tpd = new javax.swing.JFormattedTextField();
        fecha = new javax.swing.JTextField();
        r2 = new javax.swing.JLabel();

        tabladouble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "tempmax", "tempmin", "tempp"
            }
        ));
        jScrollPane1.setViewportView(tabladouble);

        tablaenteros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "templm", "templmn", "dia", "año", "hora", "min", "seg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaenteros);

        TABLAT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "tempm", "tempmn", "tempp", "templm", "templmn", "hummax", "hummin", "hump", "huml", "hulmn", "finicio", "ffin", "obser", "Tipotoma"
            }
        ));
        jScrollPane4.setViewportView(TABLAT);
        if (TABLAT.getColumnModel().getColumnCount() > 0) {
            TABLAT.getColumnModel().getColumn(0).setResizable(false);
            TABLAT.getColumnModel().getColumn(1).setResizable(false);
            TABLAT.getColumnModel().getColumn(2).setResizable(false);
            TABLAT.getColumnModel().getColumn(3).setResizable(false);
            TABLAT.getColumnModel().getColumn(4).setResizable(false);
            TABLAT.getColumnModel().getColumn(5).setResizable(false);
            TABLAT.getColumnModel().getColumn(6).setResizable(false);
            TABLAT.getColumnModel().getColumn(7).setResizable(false);
            TABLAT.getColumnModel().getColumn(8).setResizable(false);
            TABLAT.getColumnModel().getColumn(9).setResizable(false);
            TABLAT.getColumnModel().getColumn(10).setResizable(false);
            TABLAT.getColumnModel().getColumn(11).setResizable(false);
            TABLAT.getColumnModel().getColumn(12).setResizable(false);
            TABLAT.getColumnModel().getColumn(13).setResizable(false);
            TABLAT.getColumnModel().getColumn(14).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("VALIDACIÖN");

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.jpg"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMULARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setOpaque(false);

        tmn.setText("ingrese temperatura minima");
        tmn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tmnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tmnFocusLost(evt);
            }
        });
        tmn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmnKeyTyped(evt);
            }
        });

        tm.setText("Ingrese temperatura maxima");
        tm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tmFocusLost(evt);
            }
        });
        tm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Temperatura maxima °C");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Temperatura minima °C");

        obser.setColumns(20);
        obser.setRows(5);
        jScrollPane3.setViewportView(obser);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("observacion");

        fechaini.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        fechafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechafinActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("fecha inicio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("fecha fin");

        tpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de unidad", "Nevera", "Dataloyed" }));
        tpt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tptItemStateChanged(evt);
            }
        });
        tpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tptActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Tipo de Toma");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Temperaturta promedio °C");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Humedad maxima");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Humedad minima");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Humedad promedio");

        hummax.setText("Ingrese humedad maxima");
        hummax.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hummaxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hummaxFocusLost(evt);
            }
        });
        hummax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hummaxKeyTyped(evt);
            }
        });

        hummin.setText("Ingrese humedad minima");
        hummin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                humminFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                humminFocusLost(evt);
            }
        });
        hummin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                humminKeyTyped(evt);
            }
        });

        hump.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                humpKeyTyped(evt);
            }
        });

        valid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar-verde-ok-si-icono-8925-32.png"))); // NOI18N
        valid.setToolTipText("VALIDAR");
        valid.setContentAreaFilled(false);
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });

        Insertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-la-linea-grafica-icono-4590-32.png"))); // NOI18N
        Insertar.setToolTipText("INSERTAR");
        Insertar.setContentAreaFilled(false);
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(nor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tml, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaini, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tpt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(174, 174, 174))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tmn)
                                    .addComponent(tmp)
                                    .addComponent(hummax, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hummin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hump, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valid)
                                    .addComponent(Insertar))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tmnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(huml, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                                        .addComponent(humlm))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tmn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hummax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(huml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tmnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Insertar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hummin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(humlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(hump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fechaini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        re.setOpaque(false);

        never.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Graficas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        never.setForeground(new java.awt.Color(102, 102, 102));
        never.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N

        javax.swing.GroupLayout gnLayout = new javax.swing.GroupLayout(gn);
        gn.setLayout(gnLayout);
        gnLayout.setHorizontalGroup(
            gnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        gnLayout.setVerticalGroup(
            gnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        never.addTab("Nevera", gn);

        javax.swing.GroupLayout dataloLayout = new javax.swing.GroupLayout(datalo);
        datalo.setLayout(dataloLayout);
        dataloLayout.setHorizontalGroup(
            dataloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        dataloLayout.setVerticalGroup(
            dataloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        never.addTab("Dataloyed Temperatura", datalo);

        javax.swing.GroupLayout datalo2Layout = new javax.swing.GroupLayout(datalo2);
        datalo2.setLayout(datalo2Layout);
        datalo2Layout.setHorizontalGroup(
            datalo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        datalo2Layout.setVerticalGroup(
            datalo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        never.addTab("Dataloyed Humedad", datalo2);

        tmd.setOpaque(false);

        tmnd.setOpaque(false);

        tpd.setOpaque(false);

        fecha.setOpaque(false);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(tpd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(never, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(never, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(tmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tpd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmnFocusGained
        // TODO add your handling code here:
        if (tmn.getText().equals("ingrese temperatura minima")) {
            tmn.setText("");
        }
    }//GEN-LAST:event_tmnFocusGained

    private void tmnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmnFocusLost
        // TODO add your handling code here:
        if (tmn.getText().equals("")) {
            tmn.setText("ingrese temperatura minima");
        }
    }//GEN-LAST:event_tmnFocusLost

    private void tmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmFocusGained
        // TODO add your handling code here:
        if (tm.getText().equals("Ingrese temperatura maxima")) {
            tm.setText("");
        }
    }//GEN-LAST:event_tmFocusGained

    private void tmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tmFocusLost
        // TODO add your handling code here:
        if (tm.getText().equals("")) {
            tm.setText("Ingrese temperatura maxima");
        }
    }//GEN-LAST:event_tmFocusLost

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        // TODO add your handling code here:

        
        
        if (tpt.getSelectedItem().equals("Nevera")) {
            
            funciones();
            controlar.controladoraccion("Insertar", obtenertemp());
            
        }else if (tpt.getSelectedItem().equals("Dataloyed")) {
            
            funciones2();
            controlar.controladoraccion("Insertar", obtenertemp2());
            
        }
        try {
            limpiarformulario();
        } catch (ParseException ex) {
            Logger.getLogger(validacioncon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_InsertarActionPerformed

    public void funciones(){
        
        double v = Double.parseDouble(tm.getText());
        double v2 = Double.parseDouble(tmn.getText());
        double v3 = (v + v2) / 2;

        Date fe = new Date();
    
        fecha.setText(""+fe);
        tmp.setText(""+v3);
        fecha.setText(""+formato.format(fe));
        
    }
    
    
    
    public void funciones2(){
        double v = Double.parseDouble(tm.getText());
        double v2 = Double.parseDouble(tmn.getText());
        double v3 = (v + v2) / 2;
        double v4 = Double.parseDouble(hummax.getText());
        double v5 = Double.parseDouble(hummin.getText());
        double v6 = (v4 + v5) / 2;


        Date fe = new Date();
    
        fecha.setText(""+fe);
        tmp.setText(""+v3);
        hump.setText(""+v6);
        fecha.setText(""+formato.format(fe));
        
    }
    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
        
        
        if (tpt.getSelectedItem().equals("Nevera")) {
            if(Double.parseDouble(tm.getText()) > 4 ||Double.parseDouble(tmn.getText()) < 2 ){
            obser.setEnabled(true);
            Insertar.setEnabled(true);
        }else if(Double.parseDouble(tm.getText()) <= 4 || Double.parseDouble(tmn.getText()) >= 2 ){
            obser.setEnabled(false);
            Insertar.setEnabled(true);
        } else if(Double.parseDouble(tm.getText()) > 4 && Double.parseDouble(tmn.getText()) < 2 ){
            obser.setEnabled(true);
            Insertar.setEnabled(true);
        }else if(Double.parseDouble(tm.getText()) <= 4 && Double.parseDouble(tmn.getText()) >= 2 ){
            obser.setEnabled(false);
            Insertar.setEnabled(true);
        }
        }else if (tpt.getSelectedItem().equals("Dataloyed")) {
             if(Double.parseDouble(tm.getText()) > 30 ||Double.parseDouble(tmn.getText()) < 15 || Double.parseDouble(hummax.getText()) > 80 ||Double.parseDouble(hummin.getText()) < 30 ){
            obser.setEnabled(true);
            Insertar.setEnabled(true);
        }else if(Double.parseDouble(tm.getText()) <= 30 || Double.parseDouble(tmn.getText()) >= 15 || Double.parseDouble(hummax.getText()) <= 80 || Double.parseDouble(hummin.getText()) >= 30 ){
            obser.setEnabled(false);
            Insertar.setEnabled(true);
        } else if(Double.parseDouble(tm.getText()) > 30 && Double.parseDouble(tmn.getText()) < 15 && Double.parseDouble(hummax.getText()) > 80 && Double.parseDouble(hummin.getText()) < 30){
            obser.setEnabled(true);
            Insertar.setEnabled(true);
        }else if(Double.parseDouble(tm.getText()) <= 30 && Double.parseDouble(tmn.getText()) >= 15 && Double.parseDouble(hummax.getText()) <= 80 && Double.parseDouble(hummin.getText()) >= 30){
            obser.setEnabled(false);
            Insertar.setEnabled(true);
        }
        }
        
        
        
    }//GEN-LAST:event_validActionPerformed

    private void tmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmKeyTyped
        // TODO add your handling code here:
           int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Datos incompatibles",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Datos incompatibles",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            tm.transferFocus();
        }
    }//GEN-LAST:event_tmKeyTyped

    private void tmnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmnKeyTyped
        // TODO add your handling code here:           int k=(int)evt.getKeyChar();
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            tm.transferFocus();
        }
    }//GEN-LAST:event_tmnKeyTyped

    private void tptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tptActionPerformed

    private void tptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tptItemStateChanged
        // TODO add your handling code here:
        if (tpt.getSelectedItem().equals("Nevera")) {
            fechaini.setEnabled(false);
            fechafin.setEnabled(false);
            tmp.setEnabled(false);
            hummax.setEnabled(false);
            hummin.setEnabled(false);
            hump.setEnabled(false);
            valid.setEnabled(true);
            tml.setValue(4);
            tmnl.setValue(2);
        } else if (tpt.getSelectedItem().equals("Dataloyed")) {
            fechaini.setEnabled(true);
            fechafin.setEnabled(true);
            tmp.setEnabled(true);
            hummax.setEnabled(true);
            hummin.setEnabled(true);
            hump.setEnabled(true);
            valid.setEnabled(true);
            tml.setValue(30);
            tmnl.setValue(15);
            huml.setValue(80);
            humlm.setValue(30);
        }
        else if (tpt.getSelectedItem().equals("Seleccione el tipo de unidad")) {
            fechaini.setEnabled(false);
            fechafin.setEnabled(false);
            tmp.setEnabled(false);
            hummax.setEnabled(false);
            hummin.setEnabled(false);
            hump.setEnabled(false);
            valid.setEnabled(false);
            tml.setValue(0);
            tmnl.setValue(0);
        }
        
    }//GEN-LAST:event_tptItemStateChanged

    private void fechafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechafinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechafinActionPerformed

    private void hummaxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hummaxFocusGained
        // TODO add your handling code here:
        if (hummax.getText().equals("Ingrese humedad maxima")) {
            hummax.setText("");
        }
             
    }//GEN-LAST:event_hummaxFocusGained

    private void hummaxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hummaxFocusLost
        // TODO add your handling code here:}
        if (hummax.getText().equals("")) {
            hummax.setText("Ingrese humedad maxima");
        }
    }//GEN-LAST:event_hummaxFocusLost

    private void humminFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_humminFocusGained
        // TODO add your handling code here:
         if (hummin.getText().equals("Ingrese humedad minima")) {
            hummin.setText("");
        }
    }//GEN-LAST:event_humminFocusGained

    private void humminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_humminFocusLost
        // TODO add your handling code here:
         if (hummin.getText().equals("")) {
            hummin.setText("Ingrese humedad minima");
        }
    }//GEN-LAST:event_humminFocusLost

    private void hummaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hummaxKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            tm.transferFocus();
        }
    }//GEN-LAST:event_hummaxKeyTyped

    private void humminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_humminKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            tm.transferFocus();
        }
    }//GEN-LAST:event_humminKeyTyped

    private void humpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_humpKeyTyped
        // TODO add your handling code here:
        int k=(int)evt.getKeyChar();
        if (k >= 97 && k <= 122 || k>=65 && k<=90){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==241 || k==209){
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null,"Este campo solo permite valores numericos, No debe ingresar letras!!!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
        if(k==10){
            tm.transferFocus();
        }
    }//GEN-LAST:event_humpKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insertar;
    private javax.swing.JTable TABLAT;
    private javax.swing.JPanel datalo;
    private javax.swing.JPanel datalo2;
    private javax.swing.JTextField fecha;
    private javax.swing.JFormattedTextField fechafin;
    private javax.swing.JFormattedTextField fechaini;
    private javax.swing.JPanel gn;
    private javax.swing.JFormattedTextField huml;
    private javax.swing.JFormattedTextField humlm;
    private javax.swing.JTextField hummax;
    private javax.swing.JTextField hummin;
    private javax.swing.JTextField hump;
    private javax.swing.JFormattedTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane never;
    private javax.swing.JFormattedTextField nor;
    private javax.swing.JTextArea obser;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JLabel r2;
    private javax.swing.JTextField re;
    private javax.swing.JTable tabladouble;
    private javax.swing.JTable tablaenteros;
    private javax.swing.JTextField tm;
    private javax.swing.JFormattedTextField tmd;
    private javax.swing.JFormattedTextField tml;
    private javax.swing.JTextField tmn;
    private javax.swing.JFormattedTextField tmnd;
    private javax.swing.JFormattedTextField tmnl;
    private javax.swing.JTextField tmp;
    private javax.swing.JFormattedTextField tpd;
    private javax.swing.JComboBox<String> tpt;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables

}
