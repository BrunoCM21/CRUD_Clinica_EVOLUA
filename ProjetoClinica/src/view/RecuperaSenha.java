package view;

import controller.UsuarioDAO;
import java.util.List;
import model.Usuario;

public class RecuperaSenha extends javax.swing.JFrame {

    public RecuperaSenha() {
        initComponents();
        iniciaComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        labelResultadoSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("E-Mail");
        desktopPane.add(labelEmail);
        labelEmail.setBounds(0, 30, 310, 20);

        txtEmail.setToolTipText("nome@email.com");
        txtEmail.setOpaque(false);
        desktopPane.add(txtEmail);
        txtEmail.setBounds(60, 50, 200, 30);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        desktopPane.add(btnVoltar);
        btnVoltar.setBounds(110, 210, 100, 23);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        desktopPane.add(btnPesquisar);
        btnPesquisar.setBounds(110, 90, 100, 23);

        labelResultadoSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelResultadoSenha.setText("Senha Recuperada: ");
        desktopPane.add(labelResultadoSenha);
        labelResultadoSenha.setBounds(0, 160, 310, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String email = txtEmail.getText();
        UsuarioDAO u = new UsuarioDAO();
        List<Usuario> lista = u.pesquisaEmailUsuario(email);
        if(lista != null && !lista.isEmpty()) {
            labelResultadoSenha.setText(labelResultadoSenha.getText() + lista.get(0).getSenha());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperaSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelResultadoSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void iniciaComponentes() {
        this.setResizable(false);
        this.setTitle("Recuperando sua Senha");
        this.setLocationRelativeTo(null);
    }
}
