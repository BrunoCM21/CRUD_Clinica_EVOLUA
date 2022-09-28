package view;

import controller.PacienteDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Paciente;
import view.RoundedBorder;

public class DeletaPaciente extends javax.swing.JFrame {

    private List<Paciente> listaProduto;
    private PacienteDAO pDAO;
    private String id;

    public DeletaPaciente() {
        initComponents();
        configuraJanela();
        configuraTabela();
        preencherTabela(new PacienteDAO().listaPacientes());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelGrandeDeletar = new javax.swing.JLabel();
        gridProdutos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnListarTodos = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        labelIDSel = new javax.swing.JLabel();
        fldId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeDeletar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandeDeletar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeDeletar.setText("Deletar Paciente");
        labelGrandeDeletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        gridProdutos.setViewportView(jTable1);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnListarTodos.setBackground(new java.awt.Color(255, 255, 255));
        btnListarTodos.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnListarTodos.setText("Listar Todos");
        btnListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTodosActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        labelIDSel.setText("jLabel1");

        fldId.setText("jTextField1");
        fldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldIdActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(labelGrandeDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(gridProdutos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnListarTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelIDSel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fldId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGrandeDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(gridProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelIDSel)
                .addGap(18, 18, 18)
                .addComponent(fldId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(labelGrandeDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(gridProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDSel)
                    .addComponent(fldId))
                .addGap(12, 12, 12)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);
        btnListarTodos.setBorder(new RoundedBorder(10));
        btnListarTodos.setForeground(Color.BLACK);
        btnDeletar.setBorder(new RoundedBorder(10));
        btnDeletar.setForeground(Color.BLACK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTodosActionPerformed
        preencherTabela(new PacienteDAO().listaPacientes());
    }//GEN-LAST:event_btnListarTodosActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        Paciente pac = new Paciente();
        pac.setId(Integer.parseInt(fldId.getText()));
        pDAO.deletaPaciente(pac);
        preencherTabela(new PacienteDAO().listaPacientes());
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            fldId.setText(jTable1.getValueAt(linha, 0).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void fldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldIdActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnListarTodos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField fldId;
    private javax.swing.JScrollPane gridProdutos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelGrandeDeletar;
    private javax.swing.JLabel labelIDSel;
    // End of variables declaration//GEN-END:variables

    private void configuraJanela() {
        this.pDAO = new PacienteDAO();
        this.setTitle("Deletando Pacientes");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        fldId.setText("");
        labelIDSel.setText("ID: ");
    }

    private void configuraTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        m.addColumn("Id");
        m.addColumn("Nome");
        m.addColumn("Peso");
        m.addColumn("Altura");

        jTable1.setModel(m);
    }

    private void preencherTabela(List<Paciente> lista) {
        if (lista.size() > 0) {
            configuraTabela();
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            for (Paciente p : lista) {
                m.addRow(new Object[]{
                    p.getId(), p.getNome(), p.getPeso(), p.getAltura()
                });
            }
            jTable1.setModel(m);
        }
    }

    public List<Paciente> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Paciente> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public PacienteDAO getpDAO() {
        return pDAO;
    }

    public void setpDAO(PacienteDAO pDAO) {
        this.pDAO = pDAO;
    }
}
