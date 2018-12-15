/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab_2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Agurcia
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        aa.cargarArchivo();
        ap.cargarArchivo();
        an.cargarArchivo();
        AddAstronautaTabla();
        AddPlanetaTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_planetas = new javax.swing.JDialog();
        tf_nombrePlaneta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_tempPlaneta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_superficiePlaneta = new javax.swing.JTextField();
        rb_siPlaneta = new javax.swing.JRadioButton();
        rb_noPlaneta = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_distanciaPlaneta = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        ventana_astronautas = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_nombreAstro = new javax.swing.JTextField();
        tf_nacionalidadAstro = new javax.swing.JTextField();
        tf_sueloAstro = new javax.swing.JTextField();
        tf_pesoAstro = new javax.swing.JTextField();
        sp_expAstro = new javax.swing.JSpinner();
        rb_MAstro = new javax.swing.JRadioButton();
        rb_FAstro = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        ventana_naves_sonda = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        tf_serieSonda = new javax.swing.JTextField();
        cb_planetasSonda = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_velocidadSonda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_materialSonda = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tf_pesoSonda = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        ventana_expedicion = new javax.swing.JDialog();
        cb_naves = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        ventana_naves_tripulada = new javax.swing.JDialog();
        tf_velocidadTripulada = new javax.swing.JTextField();
        tf_serieTripulada = new javax.swing.JTextField();
        tf_lugarTripulada = new javax.swing.JTextField();
        cb_planetaTripulada = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cb_astronautasTripulada = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        ventana_escoger = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        popupPlanetas = new javax.swing.JPopupMenu();
        EliminarPlaneta = new javax.swing.JMenuItem();
        ModificarPlaneta = new javax.swing.JMenuItem();
        popupAstronautas = new javax.swing.JPopupMenu();
        EliminarAstro = new javax.swing.JMenuItem();
        ModificarAstro = new javax.swing.JMenuItem();
        ventana_modificar_planeta = new javax.swing.JDialog();
        tf_superficiePlaneta1 = new javax.swing.JTextField();
        rb_siPlaneta1 = new javax.swing.JRadioButton();
        rb_noPlaneta1 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        tf_nombrePlaneta1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf_distanciaPlaneta1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        tf_tempPlaneta1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ventana_modificar_astro = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        tf_nombreAstro1 = new javax.swing.JTextField();
        tf_nacionalidadAstro1 = new javax.swing.JTextField();
        tf_sueloAstro1 = new javax.swing.JTextField();
        tf_pesoAstro1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        sp_expAstro1 = new javax.swing.JSpinner();
        jLabel33 = new javax.swing.JLabel();
        rb_MAstro1 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        rb_FAstro1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPlanetas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAstronautas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel2.setText("Nombre");

        jLabel3.setText("Temperatura");

        jLabel4.setText("Superficie");

        buttonGroup1.add(rb_siPlaneta);
        rb_siPlaneta.setText("Si");

        buttonGroup1.add(rb_noPlaneta);
        rb_noPlaneta.setText("No");

        jLabel5.setText("Anillos");

        jLabel6.setText("Distancia");

        jButton5.setText("Agregar Planeta");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_planetasLayout = new javax.swing.GroupLayout(ventana_planetas.getContentPane());
        ventana_planetas.getContentPane().setLayout(ventana_planetasLayout);
        ventana_planetasLayout.setHorizontalGroup(
            ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_planetasLayout.createSequentialGroup()
                .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_planetasLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventana_planetasLayout.createSequentialGroup()
                                .addComponent(rb_siPlaneta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_noPlaneta))
                            .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_nombrePlaneta)
                                .addComponent(tf_tempPlaneta)
                                .addComponent(tf_superficiePlaneta, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                            .addComponent(tf_distanciaPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ventana_planetasLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton5)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        ventana_planetasLayout.setVerticalGroup(
            ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_planetasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombrePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_tempPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tf_superficiePlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_siPlaneta)
                    .addComponent(rb_noPlaneta)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(ventana_planetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_distanciaPlaneta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(19, 19, 19))
        );

        jLabel7.setText("Nombre");

        jLabel8.setText("Nacionalidad");

        jLabel9.setText("Sueldo");

        jLabel10.setText("Sexo");

        jLabel11.setText("Peso");

        jLabel12.setText("Experiencia");

        buttonGroup2.add(rb_MAstro);
        rb_MAstro.setText("M");

        buttonGroup2.add(rb_FAstro);
        rb_FAstro.setText("F");

        jButton6.setText("Agregar Astronauta");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_astronautasLayout = new javax.swing.GroupLayout(ventana_astronautas.getContentPane());
        ventana_astronautas.getContentPane().setLayout(ventana_astronautasLayout);
        ventana_astronautasLayout.setHorizontalGroup(
            ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_astronautasLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_astronautasLayout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ventana_astronautasLayout.createSequentialGroup()
                        .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventana_astronautasLayout.createSequentialGroup()
                                .addComponent(rb_MAstro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_FAstro))
                            .addComponent(tf_pesoAstro)
                            .addComponent(sp_expAstro)
                            .addComponent(tf_nombreAstro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nacionalidadAstro)
                            .addComponent(tf_sueloAstro))
                        .addGap(72, 72, 72))))
        );
        ventana_astronautasLayout.setVerticalGroup(
            ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_astronautasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nombreAstro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nacionalidadAstro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_sueloAstro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rb_MAstro)
                    .addComponent(rb_FAstro))
                .addGap(24, 24, 24)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_pesoAstro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_astronautasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sp_expAstro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton6)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel13.setText("Serie");

        jLabel14.setText("Planeta");

        jLabel15.setText("Velocidad");

        jLabel17.setText("Material");

        jLabel18.setText("Peso");

        jButton7.setText("Agregar Sonda");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_naves_sondaLayout = new javax.swing.GroupLayout(ventana_naves_sonda.getContentPane());
        ventana_naves_sonda.getContentPane().setLayout(ventana_naves_sondaLayout);
        ventana_naves_sondaLayout.setHorizontalGroup(
            ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_naves_sondaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ventana_naves_sondaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_velocidadSonda))
                    .addGroup(ventana_naves_sondaLayout.createSequentialGroup()
                        .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_serieSonda)
                            .addComponent(cb_planetasSonda, 0, 163, Short.MAX_VALUE)))
                    .addGroup(ventana_naves_sondaLayout.createSequentialGroup()
                        .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_materialSonda, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(tf_pesoSonda)))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        ventana_naves_sondaLayout.setVerticalGroup(
            ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_naves_sondaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_serieSonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_planetasSonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_velocidadSonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_materialSonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventana_naves_sondaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_pesoSonda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton7)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jButton11.setText("Comenzar Expedicion");

        javax.swing.GroupLayout ventana_expedicionLayout = new javax.swing.GroupLayout(ventana_expedicion.getContentPane());
        ventana_expedicion.getContentPane().setLayout(ventana_expedicionLayout);
        ventana_expedicionLayout.setHorizontalGroup(
            ventana_expedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_expedicionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cb_naves, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        ventana_expedicionLayout.setVerticalGroup(
            ventana_expedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_expedicionLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(ventana_expedicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_naves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel19.setText("Serie");

        jLabel20.setText("Planeta");

        jLabel21.setText("Velocidad");

        jLabel22.setText("Lugar");

        jLabel23.setText("Astronautas");

        jButton8.setText("Agregar Nave Tripulada");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_naves_tripuladaLayout = new javax.swing.GroupLayout(ventana_naves_tripulada.getContentPane());
        ventana_naves_tripulada.getContentPane().setLayout(ventana_naves_tripuladaLayout);
        ventana_naves_tripuladaLayout.setHorizontalGroup(
            ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventana_naves_tripuladaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(ventana_naves_tripuladaLayout.createSequentialGroup()
                        .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(23, 23, 23)
                        .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_velocidadTripulada)
                            .addComponent(tf_serieTripulada)
                            .addComponent(cb_planetaTripulada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ventana_naves_tripuladaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_astronautasTripulada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_lugarTripulada, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))))
                .addGap(118, 118, 118))
            .addGroup(ventana_naves_tripuladaLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton8)
                .addContainerGap(155, Short.MAX_VALUE))
        );
        ventana_naves_tripuladaLayout.setVerticalGroup(
            ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_naves_tripuladaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_serieTripulada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_planetaTripulada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_velocidadTripulada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_lugarTripulada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(ventana_naves_tripuladaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(cb_astronautasTripulada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton8)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel24.setText("Que tipo de nave desea?");

        jButton9.setText("Sonda");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Nave Tripulada");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_escogerLayout = new javax.swing.GroupLayout(ventana_escoger.getContentPane());
        ventana_escoger.getContentPane().setLayout(ventana_escogerLayout);
        ventana_escogerLayout.setHorizontalGroup(
            ventana_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_escogerLayout.createSequentialGroup()
                .addGroup(ventana_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_escogerLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel24))
                    .addGroup(ventana_escogerLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        ventana_escogerLayout.setVerticalGroup(
            ventana_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_escogerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventana_escogerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        EliminarPlaneta.setText("Eliminar Planeta");
        EliminarPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPlanetaActionPerformed(evt);
            }
        });
        popupPlanetas.add(EliminarPlaneta);

        ModificarPlaneta.setText("Modificar Planeta");
        ModificarPlaneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPlanetaActionPerformed(evt);
            }
        });
        popupPlanetas.add(ModificarPlaneta);

        EliminarAstro.setText("Eliminar Astronauta");
        EliminarAstro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAstroActionPerformed(evt);
            }
        });
        popupAstronautas.add(EliminarAstro);

        ModificarAstro.setText("Modificar Astronauta");
        ModificarAstro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAstroActionPerformed(evt);
            }
        });
        popupAstronautas.add(ModificarAstro);

        buttonGroup1.add(rb_siPlaneta1);
        rb_siPlaneta1.setSelected(true);
        rb_siPlaneta1.setText("Si");

        buttonGroup1.add(rb_noPlaneta1);
        rb_noPlaneta1.setText("No");

        jLabel16.setText("Anillos");

        jLabel25.setText("Distancia");

        jLabel26.setText("Nombre");

        jButton12.setText("Modificar Planeta");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        jLabel27.setText("Temperatura");

        jLabel28.setText("Superficie");

        javax.swing.GroupLayout ventana_modificar_planetaLayout = new javax.swing.GroupLayout(ventana_modificar_planeta.getContentPane());
        ventana_modificar_planeta.getContentPane().setLayout(ventana_modificar_planetaLayout);
        ventana_modificar_planetaLayout.setHorizontalGroup(
            ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_modificar_planetaLayout.createSequentialGroup()
                .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_modificar_planetaLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(46, 46, 46)
                        .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventana_modificar_planetaLayout.createSequentialGroup()
                                .addComponent(rb_siPlaneta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_noPlaneta1))
                            .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_nombrePlaneta1)
                                .addComponent(tf_tempPlaneta1)
                                .addComponent(tf_superficiePlaneta1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                            .addComponent(tf_distanciaPlaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ventana_modificar_planetaLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton12)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        ventana_modificar_planetaLayout.setVerticalGroup(
            ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_modificar_planetaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombrePlaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_tempPlaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(tf_superficiePlaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_siPlaneta1)
                    .addComponent(rb_noPlaneta1)
                    .addComponent(jLabel16))
                .addGap(27, 27, 27)
                .addGroup(ventana_modificar_planetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_distanciaPlaneta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton12)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel29.setText("Sexo");

        jLabel30.setText("Peso");

        jLabel31.setText("Experiencia");

        jButton13.setText("Modificar Astronauta");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jLabel32.setText("Nombre");

        jLabel33.setText("Nacionalidad");

        buttonGroup2.add(rb_MAstro1);
        rb_MAstro1.setSelected(true);
        rb_MAstro1.setText("M");

        jLabel34.setText("Sueldo");

        buttonGroup2.add(rb_FAstro1);
        rb_FAstro1.setText("F");

        javax.swing.GroupLayout ventana_modificar_astroLayout = new javax.swing.GroupLayout(ventana_modificar_astro.getContentPane());
        ventana_modificar_astro.getContentPane().setLayout(ventana_modificar_astroLayout);
        ventana_modificar_astroLayout.setHorizontalGroup(
            ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_modificar_astroLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel29))
                .addGap(27, 27, 27)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_modificar_astroLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ventana_modificar_astroLayout.createSequentialGroup()
                        .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventana_modificar_astroLayout.createSequentialGroup()
                                .addComponent(rb_MAstro1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rb_FAstro1))
                            .addComponent(tf_pesoAstro1)
                            .addComponent(sp_expAstro1)
                            .addComponent(tf_nombreAstro1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nacionalidadAstro1)
                            .addComponent(tf_sueloAstro1))
                        .addGap(72, 72, 72))))
        );
        ventana_modificar_astroLayout.setVerticalGroup(
            ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_modificar_astroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(tf_nombreAstro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_nacionalidadAstro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tf_sueloAstro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(rb_MAstro1)
                    .addComponent(rb_FAstro1))
                .addGap(24, 24, 24)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_pesoAstro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(ventana_modificar_astroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(sp_expAstro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton13)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaPlanetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Temperatura", "Anillos", "Superficie", "Distancia"
            }
        ));
        TablaPlanetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPlanetasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPlanetas);

        TablaAstronautas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nacionalidad", "Sueldo", "Sexo", "Peso", "Experiencia"
            }
        ));
        TablaAstronautas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAstronautasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaAstronautas);

        jButton1.setText("Expedicion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Agregar Planeta");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Agregar Astronautas");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Agregar Nave");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tiempo Ida", "Tiempo Vuelta", "Estado"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ventana_planetas.pack();
        ventana_planetas.setLocationRelativeTo(this);
        ventana_planetas.setModal(true);
        ventana_planetas.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    //Ventana Astronauta
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        ventana_astronautas.pack();
        ventana_astronautas.setLocationRelativeTo(this);
        ventana_astronautas.setModal(true);
        ventana_astronautas.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked
    //Ventana Escoger
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        ventana_escoger.pack();
        ventana_escoger.setLocationRelativeTo(this);
        ventana_escoger.setModal(true);
        ventana_escoger.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked
    //Ventana Nave Sonda
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        ventana_naves_sonda.pack();
        ventana_naves_sonda.setLocationRelativeTo(this);
        ventana_naves_sonda.setModal(true);
        ventana_naves_sonda.setVisible(true);
    }//GEN-LAST:event_jButton9MouseClicked
    //Ventana Nave Tripulada
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        ventana_naves_tripulada.pack();
        ventana_naves_tripulada.setLocationRelativeTo(this);
        ventana_naves_tripulada.setModal(true);
        ventana_naves_tripulada.setVisible(true);
    }//GEN-LAST:event_jButton10MouseClicked
    //Ventana Expedicion
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ventana_expedicion.pack();
        ventana_expedicion.setLocationRelativeTo(this);
        ventana_expedicion.setModal(true);
        ventana_expedicion.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked
    //Agregra Planetas
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String anillos;
        if (rb_siPlaneta.isSelected()) {
            anillos = "Si";
        } else {
            anillos = "No";
        }
        Planeta p = new Planeta(tf_nombrePlaneta.getText(), Integer.parseInt(tf_tempPlaneta.getText()), anillos, tf_superficiePlaneta.getText(), Integer.parseInt(tf_distanciaPlaneta.getText()));
        ap.cargarArchivo();
        ap.setPlaneta(p);
        ap.escribirArchivo();
        AddPlanetaTabla();
        tf_nombrePlaneta.setText("");
        tf_tempPlaneta.setText("");
        tf_superficiePlaneta.setText("");
        tf_distanciaPlaneta.setText("");
        JOptionPane.showMessageDialog(this, "Planeta Agregado Exitosamente");
        ventana_planetas.dispose();
    }//GEN-LAST:event_jButton5MouseClicked
    //Agregar Astronautas
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        String sexo;
        if (rb_MAstro.isSelected()) {
            sexo = "M";
        } else {
            sexo = "F";
        }
        int experiencia = (int) sp_expAstro.getValue();
        Astronauta a = new Astronauta(tf_nombreAstro.getText(), tf_nacionalidadAstro.getText(), Integer.parseInt(tf_sueloAstro.getText()), sexo, Integer.parseInt(tf_pesoAstro.getText()), experiencia);
        aa.cargarArchivo();
        aa.setAstronauta(a);
        aa.escribirArchivo();
        AddAstronautaTabla();
        tf_nombreAstro.setText("");
        tf_nacionalidadAstro.setText("");
        tf_sueloAstro.setText("");
        tf_pesoAstro.setText("");
        sp_expAstro.setValue(0);
        JOptionPane.showMessageDialog(this, "Astronauta Agregado Exitosamente");
        ventana_astronautas.dispose();
    }//GEN-LAST:event_jButton6MouseClicked
    //Agregar Nave Sonda
    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int serie = Integer.parseInt(tf_serieSonda.getText());
        double velocidad = Double.parseDouble(tf_velocidadSonda.getText());
        String mat = tf_materialSonda.getText();
        int peso = Integer.parseInt(tf_pesoSonda.getText());
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_planetasSonda.getModel();
        Planeta p = (Planeta) modelo.getSelectedItem();
        Sonda s = new Sonda(mat, peso, serie, p, velocidad);
        an.cargarArchivo();
        an.setNave(s);
        an.escribirArchivo();
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_naves.getModel();
        modelo2.addElement(s);
        cb_naves.setModel(modelo2);
        JOptionPane.showMessageDialog(this, "Nave Agregada Exitosamente");
        tf_serieSonda.setText("");
        tf_velocidadSonda.setText("");
        tf_materialSonda.setText("");
        tf_pesoSonda.setText("");
        ventana_naves_sonda.dispose();
    }//GEN-LAST:event_jButton7MouseClicked
    //Agregar Nave Tripulante
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        int serie = Integer.parseInt(tf_serieTripulada.getText());
        double velocidad = Double.parseDouble(tf_velocidadTripulada.getText());
        String lugar = tf_lugarTripulada.getText();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_planetaTripulada.getModel();
        Planeta p = (Planeta) modelo.getSelectedItem();
        Nave_Tripulada nt = new Nave_Tripulada(lugar, serie, p, velocidad);
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_astronautasTripulada.getModel();
        Astronauta a = (Astronauta) modelo2.getSelectedItem();
        nt.getLista_astro().add(a);
        an.cargarArchivo();
        an.setNave(nt);
        an.escribirArchivo();
        DefaultComboBoxModel modelo3 = (DefaultComboBoxModel) cb_naves.getModel();
        modelo3.addElement(nt);
        cb_naves.setModel(modelo3);
        JOptionPane.showMessageDialog(this, "Nave Agregada Exitosamente");
        tf_serieTripulada.setText("");
        tf_velocidadTripulada.setText("");
        tf_lugarTripulada.setText("");
        ventana_naves_tripulada.dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void TablaPlanetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPlanetasMouseClicked
        if (evt.isMetaDown()) {
            if (TablaPlanetas.getSelectedRowCount() == 1D) {
                popupPlanetas.show(this.TablaPlanetas, evt.getX(), evt.getY());
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un Planeta para usar el popup");
            }
        }
    }//GEN-LAST:event_TablaPlanetasMouseClicked

    private void TablaAstronautasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAstronautasMouseClicked
        if (evt.isMetaDown()) {
            if (TablaAstronautas.getSelectedRowCount() == 1D) {
                popupAstronautas.show(this.TablaAstronautas, evt.getX(), evt.getY());
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un Astronauta para usar el popup");
            }
        }
    }//GEN-LAST:event_TablaAstronautasMouseClicked

    private void EliminarPlanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPlanetaActionPerformed
        ap.cargarArchivo();
        lista_p = ap.getListaPlanetas();
        DefaultTableModel modelo = (DefaultTableModel) TablaPlanetas.getModel();
        int pos = TablaPlanetas.getSelectedRow();
        pm = lista_p.get(pos);
        ap.getListaPlanetas().remove(pm);
        modelo.removeRow(pos);
        ap.escribirArchivo();
        AddPlanetaTabla();
    }//GEN-LAST:event_EliminarPlanetaActionPerformed

    private void ModificarPlanetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPlanetaActionPerformed
        ap.cargarArchivo();
        lista_p = ap.getListaPlanetas();
        DefaultTableModel modelo = (DefaultTableModel) TablaPlanetas.getModel();
        int pos = TablaPlanetas.getSelectedRow();
        pm = lista_p.get(pos);
        tf_nombrePlaneta1.setText(pm.getNombre());
        tf_tempPlaneta1.setText(String.valueOf(pm.getTemperatura()));
        tf_superficiePlaneta1.setText(pm.getTipo_s());
        tf_distanciaPlaneta1.setText(String.valueOf(pm.getDistancia()));
        ventana_modificar_planeta.pack();
        ventana_modificar_planeta.setLocationRelativeTo(this);
        ventana_modificar_planeta.setModal(true);
        ventana_modificar_planeta.setVisible(true);
    }//GEN-LAST:event_ModificarPlanetaActionPerformed

    private void EliminarAstroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAstroActionPerformed
        aa.cargarArchivo();
        lista_a = aa.getListaAstronautas();
        DefaultTableModel modelo = (DefaultTableModel) TablaAstronautas.getModel();
        int pos = TablaAstronautas.getSelectedRow();
        am = lista_a.get(pos);
        aa.getListaAstronautas().remove(am);
        modelo.removeRow(pos);
        aa.escribirArchivo();
        AddAstronautaTabla();
    }//GEN-LAST:event_EliminarAstroActionPerformed

    private void ModificarAstroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAstroActionPerformed
        aa.cargarArchivo();
        lista_a = aa.getListaAstronautas();
        DefaultTableModel modelo = (DefaultTableModel) TablaAstronautas.getModel();
        int pos = TablaAstronautas.getSelectedRow();
        am = lista_a.get(pos);
        tf_nombreAstro1.setText(am.getNombre());
        tf_nacionalidadAstro1.setText(am.getNacionalidad());
        tf_sueloAstro1.setText(String.valueOf(am.getSueldo()));
        tf_pesoAstro1.setText(String.valueOf(am.getPeso()));
        sp_expAstro1.setValue(am.getExperiencia());
        ventana_modificar_astro.pack();
        ventana_modificar_astro.setLocationRelativeTo(this);
        ventana_modificar_astro.setModal(true);
        ventana_modificar_astro.setVisible(true);

    }//GEN-LAST:event_ModificarAstroActionPerformed
    //modificar planeta
    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        pm.setNombre(tf_nombrePlaneta1.getText());
        pm.setTipo_s(tf_superficiePlaneta1.getText());
        pm.setTemperatura(Integer.parseInt(tf_tempPlaneta1.getText()));
        pm.setDistancia(Integer.parseInt(tf_distanciaPlaneta1.getText()));
        String anillos;
        if (rb_noPlaneta1.isSelected()) {
            anillos = "No";
        } else {
            anillos = "Si";
        }
        pm.setAnillos(anillos);
        tf_nombrePlaneta1.setText("");
        tf_tempPlaneta1.setText("");
        tf_superficiePlaneta1.setText("");
        tf_distanciaPlaneta1.setText("");
        ap.escribirArchivo();
        AddPlanetaTabla();
        JOptionPane.showMessageDialog(this, "Planeta Modificado Exitosamente");
        ventana_modificar_planeta.dispose();
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked

        int exp = (int) sp_expAstro1.getValue();
        am.setExperiencia(exp);
        am.setNacionalidad(tf_nacionalidadAstro1.getText());
        am.setNombre(tf_nombreAstro1.getText());
        am.setPeso(Integer.parseInt(tf_pesoAstro1.getText()));
        String sexo;
        if (rb_MAstro1.isSelected()) {
            sexo = "M";
        } else {
            sexo = "F";
        }
        am.setSexo(sexo);
        am.setSueldo(Integer.parseInt(tf_sueloAstro1.getText()));
        tf_nombreAstro1.setText("");
        tf_nacionalidadAstro1.setText("");
        tf_sueloAstro1.setText("");
        tf_pesoAstro1.setText("");
        sp_expAstro1.setValue(0);
        aa.escribirArchivo();
        AddAstronautaTabla();
        JOptionPane.showMessageDialog(this, "Astronauta Modificado Exitosamente");
        ventana_modificar_astro.dispose();
    }//GEN-LAST:event_jButton13MouseClicked

    private void AddPlanetaTabla() {
        ap.cargarArchivo();
        TablaPlanetas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Temperatura", "Anillos", "Superficie", "Distancia"
                }
        ));
        DefaultTableModel modelo = (DefaultTableModel) TablaPlanetas.getModel();
        for (Planeta p : ap.getListaPlanetas()) {
            Object[] row = new Object[5];
            row[0] = p.getNombre();
            row[1] = p.getTemperatura();
            row[2] = p.getAnillos();
            row[3] = p.getTipo_s();
            row[4] = p.getDistancia();
            modelo.addRow(row);
        }
        TablaPlanetas.setModel(modelo);
        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel();
        DefaultComboBoxModel modelo3 = new DefaultComboBoxModel();
        for (Planeta listaPlaneta : ap.getListaPlanetas()) {
            modelo2.addElement(listaPlaneta);
            modelo3.addElement(listaPlaneta);
        }
        cb_planetaTripulada.setModel(modelo3);
        cb_planetasSonda.setModel(modelo2);
    }

    private void AddAstronautaTabla() {
        aa.cargarArchivo();
        TablaAstronautas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Nacionalidad", "Sueldo", "Sexo", "Peso", "Experiencia"
                }
        ));
        DefaultTableModel modelo = (DefaultTableModel) TablaAstronautas.getModel();
        for (Astronauta a : aa.getListaAstronautas()) {
            Object[] row = new Object[6];
            row[0] = a.getNombre();
            row[1] = a.getNacionalidad();
            row[2] = a.getSueldo();
            row[3] = a.getSexo();
            row[4] = a.getPeso();
            row[5] = a.getExperiencia();
            modelo.addRow(row);
        }
        TablaAstronautas.setModel(modelo);
        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel();
        for (Astronauta Astronauta1 : aa.getListaAstronautas()) {
            modelo2.addElement(Astronauta1);
        }
        cb_astronautasTripulada.setModel(modelo2);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    Admin_Naves an = new Admin_Naves("./Naves.txt");
    Admin_Planetas ap = new Admin_Planetas("./Planetas.txt");
    Admin_Astronautas aa = new Admin_Astronautas("./Astronautas.txt");
    ArrayList<Planeta> lista_p = new ArrayList();
    ArrayList<Astronauta> lista_a = new ArrayList();
    ArrayList<Nave> lista_naves = an.getLista_Naves();
    Planeta pm;
    Astronauta am;
    Nave ne;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarAstro;
    private javax.swing.JMenuItem EliminarPlaneta;
    private javax.swing.JMenuItem ModificarAstro;
    private javax.swing.JMenuItem ModificarPlaneta;
    private javax.swing.JTable TablaAstronautas;
    private javax.swing.JTable TablaPlanetas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cb_astronautasTripulada;
    private javax.swing.JComboBox<String> cb_naves;
    private javax.swing.JComboBox<String> cb_planetaTripulada;
    private javax.swing.JComboBox<String> cb_planetasSonda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPopupMenu popupAstronautas;
    private javax.swing.JPopupMenu popupPlanetas;
    private javax.swing.JRadioButton rb_FAstro;
    private javax.swing.JRadioButton rb_FAstro1;
    private javax.swing.JRadioButton rb_MAstro;
    private javax.swing.JRadioButton rb_MAstro1;
    private javax.swing.JRadioButton rb_noPlaneta;
    private javax.swing.JRadioButton rb_noPlaneta1;
    private javax.swing.JRadioButton rb_siPlaneta;
    private javax.swing.JRadioButton rb_siPlaneta1;
    private javax.swing.JSpinner sp_expAstro;
    private javax.swing.JSpinner sp_expAstro1;
    private javax.swing.JTextField tf_distanciaPlaneta;
    private javax.swing.JTextField tf_distanciaPlaneta1;
    private javax.swing.JTextField tf_lugarTripulada;
    private javax.swing.JTextField tf_materialSonda;
    private javax.swing.JTextField tf_nacionalidadAstro;
    private javax.swing.JTextField tf_nacionalidadAstro1;
    private javax.swing.JTextField tf_nombreAstro;
    private javax.swing.JTextField tf_nombreAstro1;
    private javax.swing.JTextField tf_nombrePlaneta;
    private javax.swing.JTextField tf_nombrePlaneta1;
    private javax.swing.JTextField tf_pesoAstro;
    private javax.swing.JTextField tf_pesoAstro1;
    private javax.swing.JTextField tf_pesoSonda;
    private javax.swing.JTextField tf_serieSonda;
    private javax.swing.JTextField tf_serieTripulada;
    private javax.swing.JTextField tf_sueloAstro;
    private javax.swing.JTextField tf_sueloAstro1;
    private javax.swing.JTextField tf_superficiePlaneta;
    private javax.swing.JTextField tf_superficiePlaneta1;
    private javax.swing.JTextField tf_tempPlaneta;
    private javax.swing.JTextField tf_tempPlaneta1;
    private javax.swing.JTextField tf_velocidadSonda;
    private javax.swing.JTextField tf_velocidadTripulada;
    private javax.swing.JDialog ventana_astronautas;
    private javax.swing.JDialog ventana_escoger;
    private javax.swing.JDialog ventana_expedicion;
    private javax.swing.JDialog ventana_modificar_astro;
    private javax.swing.JDialog ventana_modificar_planeta;
    private javax.swing.JDialog ventana_naves_sonda;
    private javax.swing.JDialog ventana_naves_tripulada;
    private javax.swing.JDialog ventana_planetas;
    // End of variables declaration//GEN-END:variables
}
