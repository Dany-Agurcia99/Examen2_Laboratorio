/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab_2;

import java.util.ArrayList;

/**
 *
 * @author Daniel Agurcia
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Temperatura", "Anillos", "Superficie", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Nacionalidad", "Sueldo", "Sexo", "Peso", "Experiencia"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(292, 292, 292))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)
                        .addGap(17, 17, 17)
                        .addComponent(jButton3)
                        .addGap(16, 16, 16)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ventana_planetas.pack();
        ventana_planetas.setLocationRelativeTo(this);
        ventana_planetas.setModal(true);
        ventana_planetas.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        ventana_astronautas.pack();
        ventana_astronautas.setLocationRelativeTo(this);
        ventana_astronautas.setModal(true);
        ventana_astronautas.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        ventana_escoger.pack();
        ventana_escoger.setLocationRelativeTo(this);
        ventana_escoger.setModal(true);
        ventana_escoger.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        ventana_naves_sonda.pack();
        ventana_naves_sonda.setLocationRelativeTo(this);
        ventana_naves_sonda.setModal(true);
        ventana_naves_sonda.setVisible(true);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        ventana_naves_tripulada.pack();
        ventana_naves_tripulada.setLocationRelativeTo(this);
        ventana_naves_tripulada.setModal(true);
        ventana_naves_tripulada.setVisible(true);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ventana_expedicion.pack();
        ventana_expedicion.setLocationRelativeTo(this);
        ventana_expedicion.setModal(true);
        ventana_expedicion.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
    ArrayList<Astronauta> lista_astronautas = new ArrayList();
    ArrayList<Planeta> lista_planetas = new ArrayList();
    ArrayList<Nave> lista_naves = new ArrayList();
    Admin_Planetas ap = new Admin_Planetas("./Planetas.txt");
    Admin_Astronautas aa = new Admin_Astronautas("./Astronautas.txt");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cb_astronautasTripulada;
    private javax.swing.JComboBox<String> cb_naves;
    private javax.swing.JComboBox<String> cb_planetaTripulada;
    private javax.swing.JComboBox<String> cb_planetasSonda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rb_FAstro;
    private javax.swing.JRadioButton rb_MAstro;
    private javax.swing.JRadioButton rb_noPlaneta;
    private javax.swing.JRadioButton rb_siPlaneta;
    private javax.swing.JSpinner sp_expAstro;
    private javax.swing.JTextField tf_distanciaPlaneta;
    private javax.swing.JTextField tf_lugarTripulada;
    private javax.swing.JTextField tf_materialSonda;
    private javax.swing.JTextField tf_nacionalidadAstro;
    private javax.swing.JTextField tf_nombreAstro;
    private javax.swing.JTextField tf_nombrePlaneta;
    private javax.swing.JTextField tf_pesoAstro;
    private javax.swing.JTextField tf_pesoSonda;
    private javax.swing.JTextField tf_serieSonda;
    private javax.swing.JTextField tf_serieTripulada;
    private javax.swing.JTextField tf_sueloAstro;
    private javax.swing.JTextField tf_superficiePlaneta;
    private javax.swing.JTextField tf_tempPlaneta;
    private javax.swing.JTextField tf_velocidadSonda;
    private javax.swing.JTextField tf_velocidadTripulada;
    private javax.swing.JDialog ventana_astronautas;
    private javax.swing.JDialog ventana_escoger;
    private javax.swing.JDialog ventana_expedicion;
    private javax.swing.JDialog ventana_naves_sonda;
    private javax.swing.JDialog ventana_naves_tripulada;
    private javax.swing.JDialog ventana_planetas;
    // End of variables declaration//GEN-END:variables
}
