
/** Required package class namespace */
package computerscience30s;

/**
 * Graphics2.java - this is a form (or frame, or 'container', or user interface)
 * built using the NetBeans WYSIWYG ("what you see is what you get") UI 
 * designer. To make this type of JFrame, you go to "File -> New File" and  
 * select "JFrame Form" and the UI editor will appear. To switch between code  
 * and the designer, use the buttons under the "Graphics1.java" tab named 
 * "Source" and "Design". We will be using the editor's "Pallette" and 
 * "Properties" windows to build and change the design and then adding code as 
 * needed. We will examine this frame and Graphics2 to compare doing the same 
 * things using a designer vs. writing all the code ourselves.
 *
 * @author Mr. Wachs
 * @since May 30, 2023
 */
public class Graphics2 extends javax.swing.JFrame {

    /**
     * Creates new form Graphics2
     */
    public Graphics2() {
        initComponents();
        
        // Add code after the call to the method in the line above (which do 
        // not erase that line which is a method call) - now add a line to make  
        // the form (frame, container, window, etc.) appear to the user
        this.setVisible(true);
    }

    ////////////////////////////////////////////////////////////////////////////
    // NOTE: the NetBeans visual designer adds the code below which can NOT be
    // edited, it also adds other code like the constructor above which you can 
    // edit, add to, delete etc. The "Generated code" below can be seen by 
    // clicking the "plus sign +" to expand the code
    ////////////////////////////////////////////////////////////////////////////
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelWithAnImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelWithAnImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computerscience30s/santa.gif"))); // NOI18N
        labelWithAnImage.setText("Hello World");
        labelWithAnImage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelWithAnImageMouseMoved(evt);
            }
        });

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWithAnImage)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelWithAnImage)
                .addGap(65, 65, 65)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        // Double clicking a button in the design mode, immediately jumps to 
        // code written for you connected to that button - to add in your 
        // code to execute (just like in Visual Studio). Parts of this code
        // is also not editable (that is why is appears in grey) but you can 
        // add the code for the "action" for this event
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
        // For other actions, like this, right click on the object in the 
        // WYSIWYG ("What You See Is What You Get") designer and go to the
        // menu -> Events -> then the action you wish to add
        labelWithAnImage.setText("Key pressed was " + evt.getKeyCode());
    }//GEN-LAST:event_jTextField1KeyPressed

    private void labelWithAnImageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelWithAnImageMouseMoved
        // TODO add your handling code here:
        
        // You can (but are not required to) rename objects in the designer
        // (however, you are also not required to add three letter prefixes)
        // But, this is still a good idea if you want). If you want to rename 
        // an object right click on the object in the designer (or in the 
        // navigator window) and select "Change Variable Name..."        
        labelWithAnImage.setText("Mouse (" + evt.getX() + "," + evt.getY() + ")");
    }//GEN-LAST:event_labelWithAnImageMouseMoved

    ////////////////////////////////////////////////////////////////////////////
    // NOTE: the NetBeans visual designer when a JFrame form is added to a 
    // project also adds a main method below for each JFrame form, but this 
    // main method can be edited and removed. I have removed the main method  
    // for this class (by commenting it out below)
    ////////////////////////////////////////////////////////////////////////////

    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Graphics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Graphics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Graphics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Graphics2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Graphics2().setVisible(true);
//            }
//        });
//    }

    
    ////////////////////////////////////////////////////////////////////////////
    // NOTE: the NetBeans visual designer adds the code below for each 
    // component (control, widget, property, global variable) which also 
    // cannot be edited
    ////////////////////////////////////////////////////////////////////////////
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelWithAnImage;
    // End of variables declaration//GEN-END:variables
}
