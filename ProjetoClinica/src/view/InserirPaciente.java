package view;

import controller.PacienteDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Paciente;

public class InserirPaciente extends javax.swing.JFrame {

    public InserirPaciente() {
        initComponents();
        configuraFormularioInserir();
        txtId.setEditable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelGrandeInserir = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeInserir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandeInserir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeInserir.setText("Inserir Paciente");
        labelGrandeInserir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(labelGrandeInserir);
        labelGrandeInserir.setBounds(0, 0, 670, 60);

        labelPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPeso.setText("Peso:");
        desktopPane.add(labelPeso);
        labelPeso.setBounds(30, 210, 190, 30);

        labelId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelId.setText("Identificador:");
        desktopPane.add(labelId);
        labelId.setBounds(30, 90, 190, 30);

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNome.setText("Nome:");
        desktopPane.add(labelNome);
        labelNome.setBounds(30, 130, 190, 30);

        labelAltura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelAltura.setText("Altura:");
        desktopPane.add(labelAltura);
        labelAltura.setBounds(30, 170, 190, 30);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        desktopPane.add(btnVoltar);
        btnVoltar.setBounds(0, 270, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        desktopPane.add(btnNovo);
        btnNovo.setBounds(280, 250, 110, 30);
        btnNovo.setBorder(new RoundedBorder(10));
        btnNovo.setForeground(Color.BLACK);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        desktopPane.add(btnCancelar);
        btnCancelar.setBounds(520, 250, 110, 30);
        btnCancelar.setBorder(new RoundedBorder(10));
        btnCancelar.setForeground(Color.BLACK);

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        desktopPane.add(btnInserir);
        btnInserir.setBounds(400, 250, 110, 30);
        btnInserir.setBorder(new RoundedBorder(10));
        btnInserir.setForeground(Color.BLACK);

        txtPeso.setToolTipText("Insira o peso do Paciente");
        desktopPane.add(txtPeso);
        txtPeso.setBounds(160, 210, 470, 30);

        txtId.setToolTipText("Insira o identificador do Paciente");
        desktopPane.add(txtId);
        txtId.setBounds(160, 90, 470, 30);

        txtNome.setToolTipText("Insira o nome do Paciente");
        desktopPane.add(txtNome);
        txtNome.setBounds(160, 130, 470, 30);

        txtAltura.setToolTipText("Insira a altura do Paciente");
        desktopPane.add(txtAltura);
        txtAltura.setBounds(160, 170, 470, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        controleEstado(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        controleEstado(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        PacienteDAO pDAO = new PacienteDAO();
        Paciente p = new Paciente();
        if(!txtId.getText().isEmpty() && !txtId.getText().equals("0")) {
            p.setId(Integer.valueOf(txtId.getText()));
        }
        p.setNome(txtNome.getText());
        p.setPeso(Double.valueOf(txtPeso.getText()));
        p.setAltura(Double.valueOf(txtAltura.getText()));
        
        int retorno = -1;
        
        if(p.getId() == 0) {
            retorno = pDAO.inserePaciente(p);
            txtId.setText(retorno != -1 ? String.valueOf(retorno) : "0");
        } else {
            //retorno = pDAO.alteraPaciente(p);
        }
        
        if(retorno != -1) {
            JOptionPane.showMessageDialog(null, "Registro feito com sucesso.", "Pacientes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível concluir o registro..", "Pacientes", JOptionPane.ERROR_MESSAGE);
        }
        
        controleEstado(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelGrandeInserir;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

    /**
     * Inicia o formulário da tela
     */
    private void configuraFormularioInserir() {
        this.setResizable(false);
        this.setTitle("Inserir Paciente");
        this.setLocationRelativeTo(null);
        
        controleEstado(false);
    }
    
    private void controleEstado(boolean controlador){    
        txtAltura.setEditable(controlador);       
        txtPeso.setEditable(controlador);
        txtNome.setEditable(controlador);
        btnCancelar.setEnabled(controlador);
        btnInserir.setEnabled(controlador);
        btnNovo.setEnabled(!controlador);
        if(controlador) {
            prencheFormularioInserir();
        } else {
            limpaFormularioInserir();
        }
    }
    
    private void limpaFormularioInserir() {
        txtAltura.setText("Insira a altura do Paciente");
        txtId.setText("Insira o identificador do Paciente");
        txtNome.setText("Insira o nome do Paciente");
        txtPeso.setText("Insira o peso do Paciente");
        txtAltura.setToolTipText("");
        txtNome.setToolTipText("");
        txtId.setToolTipText("");
        txtPeso.setToolTipText("");
    }
    
    private void prencheFormularioInserir() {
        txtAltura.setText("");
        txtId.setText("");
        txtNome.setText("");
        txtPeso.setText("");
        txtAltura.setToolTipText("Insira a altura do Paciente");
        txtNome.setToolTipText("Insira o nome do Paciente");
        txtId.setToolTipText("Insira o identificador do Paciente");
        txtPeso.setToolTipText("Insira o peso do Paciente");
    }
}
