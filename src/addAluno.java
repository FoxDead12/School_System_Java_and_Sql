
import Classes.Aluno;
import Classes.DataBaseQuerys;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class addAluno extends javax.swing.JInternalFrame {

    public addAluno() {
        initComponents();
        
        CarregarHabilitacoes();
        CarregarFomacoes();
        CarregarCursos(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs_manager = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        box_sexo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        txt_nacionalidade = new javax.swing.JTextField();
        box_hab = new javax.swing.JComboBox<>();
        btn_seguinte_tab1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_cidadao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_distrito = new javax.swing.JTextField();
        txt_concelho = new javax.swing.JTextField();
        txt_freguesia = new javax.swing.JTextField();
        txt_localidade = new javax.swing.JTextField();
        txt_morada = new javax.swing.JTextField();
        txt_codigopostal = new javax.swing.JTextField();
        txt_telemovel = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        btn_seguinte_tab2 = new javax.swing.JButton();
        btn_anterior_tab2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        box_for = new javax.swing.JComboBox<>();
        box_curso = new javax.swing.JComboBox<>();
        btn_adicionar_aluno = new javax.swing.JButton();
        btn_anterior_tab3 = new javax.swing.JButton();
        txtInfo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Adicionar Aluno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel2.setText("Nome");

        box_sexo.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        box_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel1.setText("Sexo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel3.setText("Data Nascimento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel4.setText("Nacionalidade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel5.setText("Habilita????es Literarias");

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_data.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_data.setText("dd/mm/yyyy");
        txt_data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_dataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_dataFocusLost(evt);
            }
        });
        txt_data.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dataKeyReleased(evt);
            }
        });

        txt_nacionalidade.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_nacionalidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        box_hab.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N

        btn_seguinte_tab1.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btn_seguinte_tab1.setText("Seguinte");
        btn_seguinte_tab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinte_tab1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel16.setText("N??mero Cart??o Cidad??o");

        txt_cidadao.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_cidadao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cidadao, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_seguinte_tab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(box_hab, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(box_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(box_hab, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(9, 9, 9)
                .addComponent(txt_cidadao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_seguinte_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        tabs_manager.addTab("Dados Pessoais", jPanel1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel6.setText("Distrito");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel7.setText("Concelho");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel8.setText("Freguesia");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel9.setText("Morada");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel10.setText("Codigo-Postal");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel11.setText("Localidade");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel12.setText("Telemovel");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel13.setText("Email");

        txt_distrito.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_distrito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_distrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_distritoActionPerformed(evt);
            }
        });

        txt_concelho.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_concelho.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_freguesia.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_freguesia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_freguesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_freguesiaActionPerformed(evt);
            }
        });

        txt_localidade.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_localidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_morada.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_morada.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_codigopostal.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_codigopostal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_codigopostal.setText("****-***");
        txt_codigopostal.setToolTipText("");
        txt_codigopostal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_codigopostalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_codigopostalFocusLost(evt);
            }
        });
        txt_codigopostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigopostalKeyReleased(evt);
            }
        });

        txt_telemovel.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_telemovel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txt_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_seguinte_tab2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btn_seguinte_tab2.setText("Seguinte");
        btn_seguinte_tab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinte_tab2ActionPerformed(evt);
            }
        });

        btn_anterior_tab2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btn_anterior_tab2.setText("Anterior");
        btn_anterior_tab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior_tab2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_codigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_telemovel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_morada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_freguesia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_concelho, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_anterior_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_seguinte_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_concelho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_freguesia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_localidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telemovel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_morada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(9, 9, 9)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_seguinte_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_anterior_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 140, Short.MAX_VALUE))
        );

        tabs_manager.addTab("Contactos", jPanel2);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel14.setText(" Nivel do Curso");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel15.setText("Curso");

        box_for.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        box_for.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_forActionPerformed(evt);
            }
        });

        box_curso.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        box_curso.setMaximumRowCount(10);
        box_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cursoActionPerformed(evt);
            }
        });

        btn_adicionar_aluno.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btn_adicionar_aluno.setText("Adicionar Aluno");
        btn_adicionar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionar_alunoActionPerformed(evt);
            }
        });

        btn_anterior_tab3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        btn_anterior_tab3.setText("Anterior");
        btn_anterior_tab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior_tab3ActionPerformed(evt);
            }
        });

        txtInfo.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        txtInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(536, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_for, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btn_anterior_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_adicionar_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(9, 9, 9)
                .addComponent(box_for, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel15)
                .addGap(9, 9, 9)
                .addComponent(box_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionar_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_anterior_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        tabs_manager.addTab("Candidatar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs_manager)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs_manager)
        );

        tabs_manager.getAccessibleContext().setAccessibleName("Candidatar");

        setBounds(0, 0, 1500, 869);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_freguesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_freguesiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_freguesiaActionPerformed

    private void txt_distritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_distritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_distritoActionPerformed

    private void btn_seguinte_tab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinte_tab1ActionPerformed
        // TODO add your handling code here:
        
        tabs_manager.setSelectedIndex(1);
        
    }//GEN-LAST:event_btn_seguinte_tab1ActionPerformed

    private void btn_anterior_tab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior_tab2ActionPerformed
        // TODO add your handling code here:
        tabs_manager.setSelectedIndex(0);
    }//GEN-LAST:event_btn_anterior_tab2ActionPerformed

    private void btn_seguinte_tab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinte_tab2ActionPerformed
        // TODO add your handling code here:
        
        tabs_manager.setSelectedIndex(2);
    }//GEN-LAST:event_btn_seguinte_tab2ActionPerformed

    private void btn_anterior_tab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior_tab3ActionPerformed
        // TODO add your handling code here:
        
        tabs_manager.setSelectedIndex(1);
    }//GEN-LAST:event_btn_anterior_tab3ActionPerformed

    private void btn_adicionar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionar_alunoActionPerformed
        
        
        //ADICIONAR ALUNO
        
        
        //CRIAR ALUNO COM A CLASS
        
        if(VerificarInputDosDados(txt_nome.getText(), "") == false || VerificarInputDosDados(txt_data.getText(), "dd/mm/yyyy") == false  || VerificarInputDosDados(txt_nacionalidade.getText(), "") == false ||  
            VerificarInputDosDados(txt_localidade.getText(), "") == false || VerificarInputDosDados(txt_codigopostal.getText(), "****-***") == false || VerificarInputDosDados(txt_telemovel.getText(), "") == false  ||
            VerificarInputDosDados(txt_cidadao.getText(), "") == false || VerificarInputDosDados(txt_email.getText(),"") == false ){
            
            txtInfo.setForeground(Color.decode("#DF0101"));
            txtInfo.setText("TEM DE PREENCHER TODOS OS CAMPOS!");
            tabs_manager.setSelectedIndex(2);
            return;
        }
        else{
            
            System.out.print("Dados Certos");
        }
        
        
        
        String Mensagem = CriarAluno(txt_nome.getText(),box_sexo.getSelectedItem().toString(), txt_data.getText(), txt_nacionalidade.getText(), 
                box_hab.getSelectedIndex() , txt_distrito.getText(), txt_concelho.getText(), txt_freguesia.getText(), 
                txt_localidade.getText(), txt_codigopostal.getText(), txt_telemovel.getText(), 
                txt_morada.getText(), txt_email.getText(), box_curso.getSelectedItem().toString() , txt_cidadao.getText(), box_for.getSelectedItem().toString());
        
        
        if(Mensagem.contains("ESTE ALUNO J?? EXISTE!!")){
            
            txtInfo.setForeground(Color.decode("#DF0101"));
        }
        else{
            txtInfo.setForeground(Color.decode("#31B404"));
        }
        
        
        txtInfo.setText(Mensagem);
        
        
    }//GEN-LAST:event_btn_adicionar_alunoActionPerformed

    private void box_forActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_forActionPerformed
        // TODO add your handling code here:
        
        CarregarCursos(box_for.getSelectedIndex());
    }//GEN-LAST:event_box_forActionPerformed

    private void txt_dataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dataKeyReleased
        // TODO add your handling code here:
        
        DataFormat();
    }//GEN-LAST:event_txt_dataKeyReleased

    private void txt_dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_dataFocusGained
        // TODO add your handling code here:
        txt_data.setText("");
    }//GEN-LAST:event_txt_dataFocusGained

    private void txt_dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_dataFocusLost
        // TODO add your handling code here:
        
        if(txt_data.getText().equals("")){
            
            txt_data.setText("dd/mm/yyyy");
        }
    }//GEN-LAST:event_txt_dataFocusLost

    private void txt_codigopostalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_codigopostalFocusGained
        // TODO add your handling code here:
        
        txt_codigopostal.setText("");
    }//GEN-LAST:event_txt_codigopostalFocusGained

    private void txt_codigopostalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_codigopostalFocusLost
        // TODO add your handling code here:
        
        if(txt_codigopostal.getText().equals("")){
            
            txt_codigopostal.setText("****-***");
        }
    }//GEN-LAST:event_txt_codigopostalFocusLost

    private void txt_codigopostalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigopostalKeyReleased
        // TODO add your handling code here:
        CodigoPostalFormat();
    }//GEN-LAST:event_txt_codigopostalKeyReleased

    private void box_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_cursoActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //MINHAS FUN????ES
    String dataTxtSave = "";
    String codigoPostalSave = "";
   
    
    void CarregarHabilitacoes(){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();
            try {
                
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM habilitacoes ORDER BY ID_HABILITACOES ASC");
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                
                    box_hab.addItem(rs.getString("NOME_HABILITACAO"));
                    
                }
                
                
            }catch (SQLException ex) {
                
            }
    }
    
    void CarregarFomacoes(){
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();
            try {
                
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM formacoes ORDER BY ID_FORMACAO ASC");
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                
                    box_for.addItem(rs.getString("NOME_FORMACAO"));
                    
                }
                
                
            }catch (SQLException ex) {
                
            }
    }
    
    void CarregarCursos(int formacao){
        
        box_curso.removeAllItems();
        
        
        DataBaseQuerys baseDados = new DataBaseQuerys();
            Connection conn = baseDados.getDataBaseQuerys();
            try {
                
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM cursos WHERE ID_FORMACAO = "+ formacao +" ORDER BY ID_CURSO ASC");
                ResultSet rs = statement.executeQuery();
                while(rs.next()){
                
                    box_curso.addItem(rs.getString("NOME_CURSO"));
                    
                }
                
                
            }catch (SQLException ex) {
                
                System.out.print(ex);
            }
    }
    
    void DataFormat(){
        if(txt_data.getText().length() <= 10 ){
            if(txt_data.getText().length() == 2){
            txt_data.setText(txt_data.getText() + "/");
            }
            else if(txt_data.getText().length() == 5){
                txt_data.setText(txt_data.getText() + "/");
            }
            dataTxtSave = txt_data.getText();
        }
        else{
            txt_data.setText(dataTxtSave);
        }
        
    }
    
    void CodigoPostalFormat(){
        
        
        if(txt_codigopostal.getText().length() <= 8 ){
            if(txt_codigopostal.getText().length() == 4){
                txt_codigopostal.setText(txt_codigopostal.getText() + "-");
            }
            
            codigoPostalSave = txt_codigopostal.getText();
        }
        else{
             txt_codigopostal.setText(codigoPostalSave);
        }
    }
    
    String CriarAluno(String nome, String sexo, String data_nasc, String nacionalidade, int habilitacao, String distrito,String concelho ,String freguesia,String localidade,String codigo_postal, String telemovel,String  morada,String email ,String curso, String numCartaoCidadao, String formacao){
        
        String Mensagem = "";
        
        Aluno aluno = new Aluno();
        aluno.CriarAluno(nome,sexo,data_nasc,nacionalidade,habilitacao,distrito,concelho,freguesia,localidade,codigo_postal,telemovel,morada,email,curso,numCartaoCidadao,formacao);
        Mensagem = aluno. AdicionarAlunoDB();
        
        return Mensagem;
    }

    
    boolean VerificarInputDosDados(String TextRight, String TextoToCompare){
        
        if(TextoToCompare.equals(TextRight)){
            
            System.out.print("\nDados igauis");
            return false;
            
        }
        else{
            return true;
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_curso;
    private javax.swing.JComboBox<String> box_for;
    private javax.swing.JComboBox<String> box_hab;
    private javax.swing.JComboBox<String> box_sexo;
    private javax.swing.JButton btn_adicionar_aluno;
    private javax.swing.JButton btn_anterior_tab2;
    private javax.swing.JButton btn_anterior_tab3;
    private javax.swing.JButton btn_seguinte_tab1;
    private javax.swing.JButton btn_seguinte_tab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane tabs_manager;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JTextField txt_cidadao;
    private javax.swing.JTextField txt_codigopostal;
    private javax.swing.JTextField txt_concelho;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_distrito;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_freguesia;
    private javax.swing.JTextField txt_localidade;
    private javax.swing.JTextField txt_morada;
    private javax.swing.JTextField txt_nacionalidade;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_telemovel;
    // End of variables declaration//GEN-END:variables
}
