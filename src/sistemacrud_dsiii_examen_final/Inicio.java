package sistemacrud_dsiii_examen_final;

import conector.BD2;
import conector.BD3;
import conector.Conexion;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.*;
import sistemacrud_dsiii_examen_final.Administrador;

public class Inicio extends javax.swing.JFrame {
  
    Statement st;
    ResultSet rs;
    public static String cedulaUsuarioActual;
    
    public Inicio() {
        initComponents();
        jPanel1.setVisible(false);
           setLocationRelativeTo(null);                     
    }
       
    class JPanelGradient extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        
        Color color1 = new Color(255,206,133);
        Color color2 = new Color(102,102,102);
        GradientPaint gp = new GradientPaint(0,0, color1, 180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, width, height);
    }
    }
       
    class JPanelGradient2 extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        
        Color color1 = new Color(255,255,255);
        Color color2 = new Color(255,228,132);
        GradientPaint gp = new GradientPaint(0,0, color1, -90, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, width, height);
    }
    }
        
    class JPanelGradient3 extends JLabel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        int height = getHeight();
        
        Color color1 = new Color(255,200,60);
        Color color2 = new Color(90,90,90);
        GradientPaint gp = new GradientPaint(0, 0, color1, 210, height, color2);
        g2d.setPaint(gp);
        g2d.drawString(jLabel3.getText(), 50, getFontMetrics(getFont()).getAscent());
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JPanelGradient();
        jPanel3 = new JPanelGradient2();
        jPanel1 = new javax.swing.JPanel();
        TBcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TBtelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BTNiniciosesion1 = new javax.swing.JButton();
        BTNiniciosesion2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TBnombre = new javax.swing.JTextField();
        BTNcrearusuario = new javax.swing.JButton();
        BTNiniciosesion = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new JPanelGradient3();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TBcedula = new javax.swing.JTextField();
        TBcontrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 228, 132));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 237, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 5, 5, new java.awt.Color(102, 102, 102)));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("CORREO");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("NOMBRE");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("TELÉFONO");

        BTNiniciosesion1.setBackground(new java.awt.Color(255, 206, 133));
        BTNiniciosesion1.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        BTNiniciosesion1.setForeground(new java.awt.Color(102, 102, 102));
        BTNiniciosesion1.setText("Unirce");
        BTNiniciosesion1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNiniciosesion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNiniciosesion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNiniciosesion1MouseExited(evt);
            }
        });
        BTNiniciosesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNiniciosesion1ActionPerformed(evt);
            }
        });

        BTNiniciosesion2.setBackground(new java.awt.Color(255, 206, 133));
        BTNiniciosesion2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BTNiniciosesion2.setForeground(new java.awt.Color(102, 102, 102));
        BTNiniciosesion2.setText("Iniciar sesion");
        BTNiniciosesion2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNiniciosesion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNiniciosesion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNiniciosesion2MouseExited(evt);
            }
        });
        BTNiniciosesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNiniciosesion2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 36, 0));
        jLabel7.setText("Ya tienes cuenta?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNiniciosesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TBcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(TBtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNiniciosesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BTNiniciosesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNiniciosesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 270, 230));

        BTNcrearusuario.setBackground(new java.awt.Color(255, 206, 133));
        BTNcrearusuario.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        BTNcrearusuario.setForeground(new java.awt.Color(102, 102, 102));
        BTNcrearusuario.setText("Crear usuario");
        BTNcrearusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNcrearusuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNcrearusuarioMouseExited(evt);
            }
        });
        BTNcrearusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcrearusuarioActionPerformed(evt);
            }
        });
        jPanel3.add(BTNcrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        BTNiniciosesion.setBackground(new java.awt.Color(255, 206, 133));
        BTNiniciosesion.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        BTNiniciosesion.setForeground(new java.awt.Color(102, 102, 102));
        BTNiniciosesion.setText("Iniciar sesion");
        BTNiniciosesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTNiniciosesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BTNiniciosesionMouseExited(evt);
            }
        });
        BTNiniciosesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNiniciosesionActionPerformed(evt);
            }
        });
        jPanel3.add(BTNiniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 206, 133));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cliente", "administrador" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cabin Sketch", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(167, 83, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("IBARRASA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 250, -1));

        jPanel4.setBackground(new java.awt.Color(255, 237, 172));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("CÉDULA");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("CONTRASEÑA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TBcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 270, 210));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 600, 510));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNiniciosesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNiniciosesionActionPerformed
        Login();        
    }//GEN-LAST:event_BTNiniciosesionActionPerformed

    private void BTNiniciosesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNiniciosesion1ActionPerformed
        CrearUsuario();
    }//GEN-LAST:event_BTNiniciosesion1ActionPerformed

    private void BTNcrearusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcrearusuarioActionPerformed
       jPanel1.setVisible(true);
       BTNiniciosesion.setVisible(false);
       BTNcrearusuario.setVisible(false);
    }//GEN-LAST:event_BTNcrearusuarioActionPerformed

    private void BTNiniciosesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNiniciosesion2ActionPerformed
       jPanel1.setVisible(false);
       BTNiniciosesion.setVisible(true);
       BTNcrearusuario.setVisible(true);
    }//GEN-LAST:event_BTNiniciosesion2ActionPerformed

    private void BTNcrearusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNcrearusuarioMouseEntered
        BTNcrearusuario.setBackground(new java.awt.Color(102,102,102));
        BTNcrearusuario.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_BTNcrearusuarioMouseEntered

    private void BTNcrearusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNcrearusuarioMouseExited
        BTNcrearusuario.setBackground(new java.awt.Color(255,206,133));
        BTNcrearusuario.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_BTNcrearusuarioMouseExited

    private void BTNiniciosesion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesion2MouseEntered
        BTNiniciosesion2.setBackground(new java.awt.Color(102,102,102));
        BTNiniciosesion2.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_BTNiniciosesion2MouseEntered

    private void BTNiniciosesion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesion2MouseExited
        BTNiniciosesion2.setBackground(new java.awt.Color(255,206,133));
        BTNiniciosesion2.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_BTNiniciosesion2MouseExited

    private void BTNiniciosesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesionMouseExited
        BTNiniciosesion.setBackground(new java.awt.Color(255,206,133));
        BTNiniciosesion.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_BTNiniciosesionMouseExited

    private void BTNiniciosesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesionMouseEntered
        BTNiniciosesion.setBackground(new java.awt.Color(102,102,102));
        BTNiniciosesion.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_BTNiniciosesionMouseEntered

    private void BTNiniciosesion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesion1MouseExited
        BTNiniciosesion1.setBackground(new java.awt.Color(255,206,133));
        BTNiniciosesion1.setForeground(new java.awt.Color(102,102,102));
    }//GEN-LAST:event_BTNiniciosesion1MouseExited

    private void BTNiniciosesion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesion1MouseEntered
        BTNiniciosesion1.setBackground(new java.awt.Color(102,102,102));
        BTNiniciosesion1.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_BTNiniciosesion1MouseEntered

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
      
    void Login() {    
        String cedula = TBcedula.getText().trim();
        String contrasena = new String(TBcontrasena.getPassword());
        String rol = jComboBox1.getSelectedItem().toString();
    
        if (cedula.isEmpty() || contrasena.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Campos vacíos. Por favor, complete todos los datos.");
            return;
        }

        try {
            Conexion con = new Conexion();       
            Connection c1 = con.getConnection();
            st = c1.createStatement();
            String sql = "SELECT * FROM usuarios WHERE cedula = '" + cedula + 
            "' AND contrasena = '" + contrasena + "' AND rol = '" + rol + "'";
            rs = st.executeQuery(sql);

            if (rs.next()) {
                cedulaUsuarioActual = cedula;
                
                if (rol.equals("cliente")) {
                    Cliente cliente = new Cliente();
                    cliente.setVisible(true);
                } else if (rol.equals("administrador")) {
                    Administrador admin = new Administrador();
                    admin.setVisible(true);
                }
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Credenciales incorrectas o rol no válido.");
            }
        } catch (HeadlessException | SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
        }
    }

    void CrearUsuario() {
        
        String correo = TBcorreo.getText().trim();    
        String telefono = TBtelefono.getText().trim();    
        String cedula = TBcedula.getText().trim();    
        String contrasena = new String(TBcontrasena.getPassword());    
        String nombre = TBnombre.getText().trim();
    
        if (correo.isEmpty() || telefono.isEmpty() || cedula.isEmpty() || contrasena.isEmpty() || nombre.isEmpty()) {        
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");       
            return;    
        }
    
        try {
            Conexion con = new Conexion();
            Connection c1 = con.getConnection();
            Connection c2 = BD2.conector();
            Connection c3 = BD3.conector();
            
            String checkSql = "SELECT cedula FROM usuarios WHERE cedula = ?";
            try (PreparedStatement checkStmt = c1.prepareStatement(checkSql)) {
                checkStmt.setString(1, cedula);
                rs = checkStmt.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Ya existe un usuario con esta cédula.");
                    return;
                }
            }
       
            String sql = "INSERT INTO usuarios(nombre, cedula, contrasena, correo, telefono) VALUES (?, ?, ?, ?, ?)";
            
            try (
                    PreparedStatement ps1 = c1.prepareStatement(sql);
                    PreparedStatement ps2 = c2.prepareStatement(sql);
                    PreparedStatement ps3 = c3.prepareStatement(sql);
                    ) {
                for (PreparedStatement ps : new PreparedStatement[]{ps1, ps2, ps3}) {
                ps.setString(1, nombre);
                ps.setString(2, cedula);
                ps.setString(3, contrasena);
                ps.setString(4, correo);
                ps.setString(5, telefono);                
            }
            
                int rows1 = ps1.executeUpdate();
                int rows2 = ps2.executeUpdate();
                int rows3 = ps3.executeUpdate();

                if (rows1 > 0 && rows2 > 0 && rows3 > 0) {
                    JOptionPane.showMessageDialog(this, "Usuario creado correctamente.");
                    jPanel1.setVisible(false);
                    BTNiniciosesion.setVisible(true);
                    BTNcrearusuario.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al insertar en alguna base de datos.");
                }
        }
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al crear usuario: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcrearusuario;
    private javax.swing.JButton BTNiniciosesion;
    private javax.swing.JButton BTNiniciosesion1;
    private javax.swing.JButton BTNiniciosesion2;
    private javax.swing.JTextField TBcedula;
    private javax.swing.JPasswordField TBcontrasena;
    private javax.swing.JTextField TBcorreo;
    private javax.swing.JTextField TBnombre;
    private javax.swing.JTextField TBtelefono;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
