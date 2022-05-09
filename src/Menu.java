
import javax.swing.JInternalFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        aluno = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuaddaluno = new javax.swing.JMenuItem();
        fileprofessores = new javax.swing.JMenu();
        verProfessores = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        addProfessor = new javax.swing.JMenuItem();
        fileturmas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        filecursos = new javax.swing.JMenu();
        verCursos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        addCurso = new javax.swing.JMenuItem();
        menuDisciplinas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        aluno.setMnemonic('a');
        aluno.setText("Alunos");
        aluno.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        aluno.setMargin(new java.awt.Insets(0, 5, 0, 5));
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jMenuItem1.setText("Ver Alunos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        aluno.add(jMenuItem1);
        aluno.add(jSeparator1);

        menuaddaluno.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        menuaddaluno.setText("Adicionar Aluno");
        menuaddaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddalunoActionPerformed(evt);
            }
        });
        aluno.add(menuaddaluno);

        menuBar.add(aluno);

        fileprofessores.setMnemonic('p');
        fileprofessores.setText("Professores");
        fileprofessores.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        fileprofessores.setMargin(new java.awt.Insets(0, 5, 0, 5));

        verProfessores.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        verProfessores.setText("Ver Professores");
        verProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProfessoresActionPerformed(evt);
            }
        });
        fileprofessores.add(verProfessores);
        fileprofessores.add(jSeparator2);

        addProfessor.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        addProfessor.setText("Adicionar Professor");
        addProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProfessorActionPerformed(evt);
            }
        });
        fileprofessores.add(addProfessor);

        menuBar.add(fileprofessores);

        fileturmas.setMnemonic('t');
        fileturmas.setText("Turmas");
        fileturmas.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        fileturmas.setMargin(new java.awt.Insets(0, 5, 0, 5));

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jMenuItem2.setText("Ver Turmas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileturmas.add(jMenuItem2);

        menuBar.add(fileturmas);

        filecursos.setText("Cursos");
        filecursos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        filecursos.setMargin(new java.awt.Insets(0, 5, 0, 5));

        verCursos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        verCursos.setText("Ver Cursos");
        verCursos.setActionCommand("");
        verCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCursosActionPerformed(evt);
            }
        });
        filecursos.add(verCursos);
        filecursos.add(jSeparator3);

        addCurso.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        addCurso.setText("Adicionar Curso");
        addCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCursoActionPerformed(evt);
            }
        });
        filecursos.add(addCurso);

        menuBar.add(filecursos);

        menuDisciplinas.setText("Disciplinas");
        menuDisciplinas.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jMenuItem4.setText("Adicionar Disciplina");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuDisciplinas.add(jMenuItem4);

        menuBar.add(menuDisciplinas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        //Abrir Mostrar Alunos
        
        
        
    }//GEN-LAST:event_alunoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        mostraralunos frame = new mostraralunos();
        boolean check = false;
        
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }

        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuaddalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddalunoActionPerformed
        // TODO add your handling code here:
        
        addAluno frame = new addAluno();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }

        frame.setVisible(true);
        
    }//GEN-LAST:event_menuaddalunoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        MostrarTurmas frame = new MostrarTurmas();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }
        
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void addProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProfessorActionPerformed
        // TODO add your handling code here:
        
        AdicionarProfessor frame = new AdicionarProfessor();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }
        
        frame.setVisible(true);
        
        
    }//GEN-LAST:event_addProfessorActionPerformed

    private void verProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProfessoresActionPerformed
        // TODO add your handling code here:
        
        MostrarProfessor frame = new MostrarProfessor();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }
        
        frame.setVisible(true);
        
    }//GEN-LAST:event_verProfessoresActionPerformed

    private void addCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCursoActionPerformed
        // TODO add your handling code here:
        
        adicionar_Curso frame = new adicionar_Curso();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }
        
        frame.setVisible(true);
    }//GEN-LAST:event_addCursoActionPerformed

    private void verCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCursosActionPerformed
        // TODO add your handling code here:
        
        Ver_Cursos frame = new Ver_Cursos();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }
        
        frame.setVisible(true);
        
        
    }//GEN-LAST:event_verCursosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        AdicionarDisciplinas frame = new AdicionarDisciplinas();
        boolean check = false;
        
         
        if(verificarJanela(frame) == false){
            desktopPane.add(frame);
        }
        
        frame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed


    public boolean verificarJanela(JInternalFrame frame){
        
        for(JInternalFrame  f: desktopPane.getAllFrames()){
           
            if(f.getTitle() == frame.getTitle()){
                
                return true;
            }
            
        }
        
        return false;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCurso;
    private javax.swing.JMenuItem addProfessor;
    private javax.swing.JMenu aluno;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu filecursos;
    private javax.swing.JMenu fileprofessores;
    private javax.swing.JMenu fileturmas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuDisciplinas;
    private javax.swing.JMenuItem menuaddaluno;
    private javax.swing.JMenuItem verCursos;
    private javax.swing.JMenuItem verProfessores;
    // End of variables declaration//GEN-END:variables

}
