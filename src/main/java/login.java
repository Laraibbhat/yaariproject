/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author laraib
 */
public class login extends javax.swing.JFrame {

    methods met=new methods();

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jpHOD = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPass = new javax.swing.JLabel();
        TFuser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        TFPASS = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        loginl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpHOD.setBackground(new java.awt.Color(254, 247, 248));

        jLabel1.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        jLabel1.setText("USERNAME");

        btnPass.setFont(new java.awt.Font("URW Chancery L", 3, 24)); // NOI18N
        btnPass.setText("PASSWORD");

        TFuser.setFont(new java.awt.Font("Ubuntu Condensed", 0, 24)); // NOI18N

        btnLogin.setFont(new java.awt.Font("URW Chancery L", 1, 24)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        TFPASS.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("URW Chancery L", 3, 50)); // NOI18N
        jLabel2.setText("HOD Login");

        btnLogin1.setFont(new java.awt.Font("URW Chancery L", 1, 24)); // NOI18N
        btnLogin1.setText("MENU");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        loginl.setBackground(new java.awt.Color(242, 240, 240));
        loginl.setFont(new java.awt.Font("URW Chancery L", 1, 24)); // NOI18N
        loginl.setText("LOGIN STATUS");

        javax.swing.GroupLayout jpHODLayout = new javax.swing.GroupLayout(jpHOD);
        jpHOD.setLayout(jpHODLayout);
        jpHODLayout.setHorizontalGroup(
                jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHODLayout.createSequentialGroup()
                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpHODLayout.createSequentialGroup()
                                                .addGap(289, 289, 289)
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpHODLayout.createSequentialGroup()
                                                .addGap(168, 168, 168)
                                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnPass, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32)
                                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jpHODLayout.createSequentialGroup()
                                                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                                                .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jpHODLayout.createSequentialGroup()
                                                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(loginl)
                                                                        .addComponent(TFPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(78, 78, 78))
        );
        jpHODLayout.setVerticalGroup(
                jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpHODLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TFPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jpHODLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(loginl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpHOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpHOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>
            static int t=0;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


        if(TFuser.getText().equals("")&&TFPASS.getText().equals("")){
            t=1;
            loginl.setText("LOGGED SUCCESSFULLY");
            this.dispose();
            Laraib um=new Laraib();
            String s="TIMETABLE OF SE";
            //TIME fa =new TIME(um.SEE,um.);
           // Master ma=new Master(um.SEE,um.TEE,um.BEE);
            met.ALLCLASSRETRIEVESUBJECTS ();
            Master ma=new Master(MENU.SEESUBJECTS,MENU.TEESUBJECTS,MENU.BEESUBJECTS);
            //Master ma=new Master(um.SEE,um.TEE,um.BEE);
            ma.setVisible(true);
            this.dispose();
        }
        else{

            //Flash fa=new Flash();
            //fa.setVisible(true);
            // this.dispose();
            loginl.setText("LOGGING FAILED");

        }


    }

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MENU ME =new MENU();
        ME.setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPasswordField TFPASS;
    private javax.swing.JTextField TFuser;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel btnPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpHOD;
    private javax.swing.JLabel loginl;
    // End of variables declaration
}
