
package trabajo;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class intro extends javax.swing.JFrame {
private static ArrayList<persona> lista=new ArrayList<persona>();
private static int numero=0;
    

    
public intro() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contraseña = new javax.swing.JPasswordField();
        id = new javax.swing.JTextField();
        boton_de_entrar = new javax.swing.JButton();
        texcontraseña = new javax.swing.JLabel();
        texid = new javax.swing.JLabel();
        texcrearcuenta = new javax.swing.JLabel();
        EXIT = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 406, 356, 30));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 324, 356, 30));

        boton_de_entrar.setBackground(new java.awt.Color(204, 255, 204));
        boton_de_entrar.setText("INGRESAR");
        boton_de_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_de_entrarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_de_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 150, 31));

        texcontraseña.setBackground(new java.awt.Color(0, 0, 0));
        texcontraseña.setText("CONTRASEÑA:");
        jPanel1.add(texcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 372, 100, 21));

        texid.setBackground(new java.awt.Color(0, 0, 0));
        texid.setText("CORREO:");
        jPanel1.add(texid, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 290, 441, 21));

        texcrearcuenta.setText("¿No cuentas con cuenta haz clik aqui?");
        texcrearcuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        texcrearcuenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                texcrearcuentaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                texcrearcuentaMouseMoved(evt);
            }
        });
        texcrearcuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                texcrearcuentaMouseClicked(evt);
            }
        });
        jPanel1.add(texcrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 505, 230, 21));

        EXIT.setBackground(new java.awt.Color(204, 255, 204));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/7d6e4aca-e750-417b-bda7-d493f641413e.jpg"))); // NOI18N
        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                fondoMouseMoved(evt);
            }
        });
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco.png"))); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 220, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void texcrearcuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texcrearcuentaMouseClicked
      agregargente gente=new agregargente(this,true);
      lista=agregargente.getLista();
      gente.setVisible(true);
    }//GEN-LAST:event_texcrearcuentaMouseClicked

    private void texcrearcuentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texcrearcuentaMouseMoved
    texcrearcuenta.setForeground(Color.BLUE);
    }//GEN-LAST:event_texcrearcuentaMouseMoved

    private void fondoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseMoved
       texcrearcuenta.setForeground(Color.BLACK);
    }//GEN-LAST:event_fondoMouseMoved

    private void boton_de_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_de_entrarActionPerformed
     String contraseña=""; 
     for(int i=0;i<this.contraseña.getPassword().length;i++){
      contraseña+=this.contraseña.getPassword()[i];
     }
     
         if(correo(id.getText())){
          if(contraseña(contraseña)){
              System.out.println(lista.get(numero).getNumerodetrans());
              movientos mo=new movientos();
              mo.setVisible(true);
              dispose();
          }else{
              JOptionPane.showMessageDialog(null,"Error contraseña incorrecta");
          }   
         }else{
            JOptionPane.showMessageDialog(null,"Error correo incorrecto");
         }
     
     
    }//GEN-LAST:event_boton_de_entrarActionPerformed

    private void texcrearcuentaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texcrearcuentaMouseDragged
       texcrearcuenta.setForeground(Color.cyan); 
       texcrearcuentaMouseClicked(evt);
    }//GEN-LAST:event_texcrearcuentaMouseDragged
    private boolean correo(String i){
       for (persona per:lista){
          if(per.getCorreo().equals(i)){
             return true;
          } 
       } 
       return false;
    }
    private boolean contraseña(String i){
      numero=0;
        for (persona per:lista){
          if(per.getContraseña().equals(i)){
             return true;
          } 
          numero++;
       } 
       return false;
    }

    public static int getNumero() {
        return numero;
    }
    
     @Override
   public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/hola.png"));
   return retValue;
}
    
    public static void main(String args[]) throws ClassNotFoundException {
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
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (InstantiationException ex) {
            //Logger.getLogger(clase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // Logger.getLogger(clase.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(clase.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intro().setVisible(true);
            }
        });
    }
    public static ArrayList<persona> getLista() {
        return lista;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton boton_de_entrar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel texcontraseña;
    private javax.swing.JLabel texcrearcuenta;
    private javax.swing.JLabel texid;
    // End of variables declaration//GEN-END:variables
}
