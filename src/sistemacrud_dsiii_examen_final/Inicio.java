package sistemacrud_dsiii_examen_final;
import conector.Conexion;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import java.io.FileOutputStream;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author antho
 */
public class Inicio extends javax.swing.JFrame {
  Conexion con= new Conexion();
  
   Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
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
        
        Color color1 = new Color(255,228,120);
        Color color2 = new Color(255,255,245);
        GradientPaint gp = new GradientPaint(0,0, color1, width, height, color2);
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
        GradientPaint gp = new GradientPaint(0,0, color1, 180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, width, height);
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
        TBcedula = new javax.swing.JTextField();
        BTNiniciosesion1 = new javax.swing.JButton();
        BTNiniciosesion2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BTNcrearusuario = new javax.swing.JButton();
        BTNiniciosesion = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        TBcontrasena = new javax.swing.JPasswordField();
        TBnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 228, 132));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 228, 132));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel4.setText("CORREO");

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel5.setText("CÉDULA");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel6.setText("TELÉFONO");

        BTNiniciosesion1.setBackground(new java.awt.Color(235, 180, 74));
        BTNiniciosesion1.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        BTNiniciosesion1.setForeground(new java.awt.Color(255, 255, 255));
        BTNiniciosesion1.setText("Unirce");
        BTNiniciosesion1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNiniciosesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNiniciosesion1ActionPerformed(evt);
            }
        });

        BTNiniciosesion2.setBackground(new java.awt.Color(235, 180, 74));
        BTNiniciosesion2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        BTNiniciosesion2.setForeground(new java.awt.Color(255, 250, 228));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TBtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(TBcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNiniciosesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TBcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNiniciosesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
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
                    .addComponent(TBcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addComponent(BTNiniciosesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNiniciosesion2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 270, 220));

        BTNcrearusuario.setBackground(new java.awt.Color(236, 180, 74));
        BTNcrearusuario.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        BTNcrearusuario.setForeground(new java.awt.Color(255, 255, 255));
        BTNcrearusuario.setText("Crear usuario");
        BTNcrearusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNcrearusuarioMouseClicked(evt);
            }
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

        BTNiniciosesion.setBackground(new java.awt.Color(235, 180, 74));
        BTNiniciosesion.setFont(new java.awt.Font("Schadow BT", 1, 12)); // NOI18N
        BTNiniciosesion.setForeground(new java.awt.Color(255, 255, 255));
        BTNiniciosesion.setText("Iniciar sesion");
        BTNiniciosesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNiniciosesionActionPerformed(evt);
            }
        });
        jPanel3.add(BTNiniciosesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cliente", "administrador" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));
        jPanel3.add(TBcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 105, -1));
        jPanel3.add(TBnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 105, -1));

        jLabel3.setFont(new java.awt.Font("Cinzel Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 153, 0));
        jLabel3.setText("Inicia sesion en IBARRASA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 250, -1));

        jPanel4.setBackground(new java.awt.Color(255, 228, 132));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("USUARIO");

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
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(130, Short.MAX_VALUE))
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

    private void BTNcrearusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNcrearusuarioMouseClicked
        
    }//GEN-LAST:event_BTNcrearusuarioMouseClicked

    private void BTNcrearusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNcrearusuarioMouseEntered
        BTNcrearusuario.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_BTNcrearusuarioMouseEntered

    private void BTNcrearusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNcrearusuarioMouseExited
        BTNcrearusuario.setBackground(new java.awt.Color(236, 180, 74));
    }//GEN-LAST:event_BTNcrearusuarioMouseExited

    private void BTNiniciosesion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesion2MouseEntered
        BTNiniciosesion2.setBackground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_BTNiniciosesion2MouseEntered

    private void BTNiniciosesion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNiniciosesion2MouseExited
        BTNiniciosesion2.setBackground(new java.awt.Color(236, 180, 74));
    }//GEN-LAST:event_BTNiniciosesion2MouseExited

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
   
}

void CrearUsuario() {
   
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
