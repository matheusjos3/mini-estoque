package classes;

import javax.swing.JOptionPane;
import model.Loja;
import model.LojaCrud;

public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        textNomeLoja = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textCapacidade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        textSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        textCpf = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar no sistema");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/iconeEstoque.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        textNomeLoja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNomeLoja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 202, 202)));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(96, 96, 96));
        jLabel1.setText("* Nome da loja:");

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(96, 96, 96));
        jLabel3.setText("* Nome do proprietário:");

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(96, 96, 96));
        jLabel4.setText("Capacidade de estoque:");

        textNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 202, 202)));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 96, 96));
        jLabel5.setText("* CPF do proprietário:");

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(96, 96, 96));
        jLabel6.setText("Senha de acesso:");

        textCapacidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textCapacidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 202, 202)));

        btnCadastrar.setBackground(new java.awt.Color(255, 153, 51));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Document 2 Add.png"))); // NOI18N
        btnCadastrar.setText("SALVAR");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 44, 56));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Stop.png"))); // NOI18N
        btnLimpar.setText("LIMPAR TUDO");
        btnLimpar.setBorder(null);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        textSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 202, 202)));

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 96, 96));
        jLabel8.setText("*Impossivel atualizar depois");

        textCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 202, 202)));
        try {
            textCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(textCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)
                        .addComponent(textNomeLoja, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textNome, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(textSenha)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textCpf)))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNomeLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 470));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userLogo.png"))); // NOI18N
        jPanel2.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 240, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String capacidade = textCapacidade.getText();
        String cpf = textCpf.getText();
        String nome = textNome.getText();
        String nomeLoja = textNomeLoja.getText();
        String senha = String.valueOf(textSenha.getPassword());

        if (capacidade.isEmpty() || cpf.isEmpty() || nome.isEmpty()
                || nomeLoja.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            Loja l = new Loja();
            int capacidadeInt = Integer.parseInt(capacidade);

            l.setCpf(cpf);
            l.setNomeLoja(nomeLoja);
            l.setNome(nome);
            l.setCapacidadeEstoque(capacidadeInt);
            l.setSenha(senha);
            l.setNomeLoja(nomeLoja);

            LojaCrud lc = new LojaCrud();
            if (lc.create(l)) {
                JOptionPane.showMessageDialog(null, "A Loja foi cadastrada, agora faça login", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            }

        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void limpar() {
        textCapacidade.setText("");
        textCpf.setText("");
        textNome.setText("");
        textNomeLoja.setText("");
        textSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField textCapacidade;
    private javax.swing.JFormattedTextField textCpf;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textNomeLoja;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
