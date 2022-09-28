package view;

import controller.UsuarioDAO;
import model.Usuario;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        iniciaComponentes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelRegistrarGrande = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setPreferredSize(new java.awt.Dimension(306, 257));

        labelRegistrarGrande.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelRegistrarGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistrarGrande.setText("REGISTRAR");
        labelRegistrarGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(labelRegistrarGrande);
        labelRegistrarGrande.setBounds(0, 0, 306, 50);

        txtEmail.setToolTipText("nome@email.com");
        txtEmail.setOpaque(false);
        desktopPane.add(txtEmail);
        txtEmail.setBounds(60, 80, 200, 30);

        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("E-Mail");
        desktopPane.add(labelEmail);
        labelEmail.setBounds(0, 60, 310, 20);

        labelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSenha.setText("Senha");
        desktopPane.add(labelSenha);
        labelSenha.setBounds(0, 110, 310, 20);

        txtSenha.setToolTipText("nome@email.com");
        txtSenha.setOpaque(false);
        desktopPane.add(txtSenha);
        txtSenha.setBounds(60, 130, 200, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        desktopPane.add(btnRegistrar);
        btnRegistrar.setBounds(100, 190, 110, 23);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        desktopPane.add(btnVoltar);
        btnVoltar.setBounds(100, 220, 110, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String email = txtEmail.getText();
        String senha = txtSenha.getText();

        UsuarioDAO u = new UsuarioDAO();
        Usuario user = u.insereUsuario(email, senha);
        MenuPrincipal e = new MenuPrincipal();
        e.setVisible(true);
        e.controleLogin(user);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelRegistrarGrande;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void iniciaComponentes() {
        this.setResizable(false);
        this.setTitle("Registro");
        this.setLocationRelativeTo(null);
    }
}
