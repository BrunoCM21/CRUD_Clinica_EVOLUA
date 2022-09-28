package view;

import controller.UsuarioDAO;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Usuario;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        iniciaComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        btnCriarNovo = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnRecSenha = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        labelLoginGrande = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelEmail1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        btnCriarNovo.setText("Criar");
        btnCriarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarNovoActionPerformed(evt);
            }
        });
        desktopPane.add(btnCriarNovo);
        btnCriarNovo.setBounds(50, 190, 110, 23);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        desktopPane.add(btnEntrar);
        btnEntrar.setBounds(160, 190, 110, 23);

        btnRecSenha.setBackground(new java.awt.Color(255, 255, 255));
        btnRecSenha.setText("Recuperar Senha");
        btnRecSenha.setBorderPainted(false);
        btnRecSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecSenhaActionPerformed(evt);
            }
        });
        desktopPane.add(btnRecSenha);
        btnRecSenha.setBounds(80, 210, 150, 23);

        txtEmail.setToolTipText("nome@email.com");
        txtEmail.setOpaque(false);
        desktopPane.add(txtEmail);
        txtEmail.setBounds(60, 80, 200, 30);

        txtSenha.setToolTipText("nome@email.com");
        txtSenha.setOpaque(false);
        desktopPane.add(txtSenha);
        txtSenha.setBounds(60, 130, 200, 30);

        labelLoginGrande.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelLoginGrande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLoginGrande.setText("LOGIN");
        labelLoginGrande.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(labelLoginGrande);
        labelLoginGrande.setBounds(0, 0, 306, 50);

        labelSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSenha.setText("Senha");
        desktopPane.add(labelSenha);
        labelSenha.setBounds(0, 110, 310, 20);

        labelEmail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail1.setText("E-Mail");
        desktopPane.add(labelEmail1);
        labelEmail1.setBounds(0, 60, 310, 20);

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

    private void btnCriarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarNovoActionPerformed
        registro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCriarNovoActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String email = txtEmail.getText();
        String senha = txtSenha.getText();

        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.executaLogin(email, senha);
        if(u != null) {
            menu.setVisible(true);
            this.dispose();
            menu.controleLogin(u);
        } else {
            JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos.", "Login", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnRecSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecSenhaActionPerformed
        recSenha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRecSenhaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

        
    private MenuPrincipal menu = new MenuPrincipal();
    private Registro registro = new Registro();
    private RecuperaSenha recSenha = new RecuperaSenha();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarNovo;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRecSenha;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelLoginGrande;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void iniciaComponentes() {
        this.setResizable(false);
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
    }
    
    public MenuPrincipal getMenu() {
        return menu;
    }

    public void setMenu(MenuPrincipal menu) {
        this.menu = menu;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public RecuperaSenha getRecSenha() {
        return recSenha;
    }

    public void setRecSenha(RecuperaSenha recSenha) {
        this.recSenha = recSenha;
    }

    public JButton getBtnCriarNovo() {
        return btnCriarNovo;
    }

    public void setBtnCriarNovo(JButton btnCriarNovo) {
        this.btnCriarNovo = btnCriarNovo;
    }

    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public void setBtnEntrar(JButton btnEntrar) {
        this.btnEntrar = btnEntrar;
    }

    public JButton getBtnRecSenha() {
        return btnRecSenha;
    }

    public void setBtnRecSenha(JButton btnRecSenha) {
        this.btnRecSenha = btnRecSenha;
    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public void setDesktopPane(JDesktopPane desktopPane) {
        this.desktopPane = desktopPane;
    }

    public JLabel getLabelEmail1() {
        return labelEmail1;
    }

    public void setLabelEmail1(JLabel labelEmail1) {
        this.labelEmail1 = labelEmail1;
    }

    public JLabel getLabelLoginGrande() {
        return labelLoginGrande;
    }

    public void setLabelLoginGrande(JLabel labelLoginGrande) {
        this.labelLoginGrande = labelLoginGrande;
    }

    public JLabel getLabelSenha() {
        return labelSenha;
    }

    public void setLabelSenha(JLabel labelSenha) {
        this.labelSenha = labelSenha;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    
    
}
