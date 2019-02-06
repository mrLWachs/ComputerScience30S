
/** required package class namespace */
package computerscience30s;

/** required imports */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JColorChooser;
import javax.swing.JRadioButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;


/**
 * Graphics3.java - using the NetBeans visual designer in combination
 * with our custom code to make a "mini final project" type of application
 *
 * @author Mr. Wachs 
 * @since 13-Dec-2018 
 */
public class Graphics3 extends javax.swing.JFrame 
{

    // Global variables (properties) below ....................................
    
    // constants:
    private final int MIN    = 2;       // for the brushes
    private final int MAX    = 200;
    private final int CHANGE = 5;
    private final String[] BRUSHES = {
        "filled oval", "open oval",
        "filled rectangle", "open rectangle",
        "3D rectangle", "arc"
    };
    
    // primitive variables:
    private String brush;
    private int    size;
    private int    currentX;
    private int    currentY;
    
    // class object variables:
    private Color              foreground;
    private Color              background;
    private Graphics           graphics;
    private SpinnerNumberModel model;
    private Timer              timer;
    
    
    /**
     * Default class constructor, sets class properties
     */
    public Graphics3() {
        initComponents();
        setup();                // jump to custom method
        this.setVisible(true);
    }

    // NetBeans designer code below ...........................................
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel1MouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        jRadioButton1.setText("Filled Oval");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Open Oval");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Filled Rectangle");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Open Rectangle");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("3D Rectangle");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Arc");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jLabel1.setText("Brush size:");
        jLabel1.setToolTipText("");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jButton1.setText("Foreground Color");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Background Color");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Star Burst");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setForeground();        // jump to custom method
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setBackground();        // jump to custom method
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();                // jump to custom method
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        starBurst();            // jump to custom method
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        drag(evt);              // jump to custom method
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel1MouseWheelMoved
        wheel(evt);             // jump to custom method
    }//GEN-LAST:event_jPanel1MouseWheelMoved

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        radio(jRadioButton1,BRUSHES[0]);     // jump to custom method
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        radio(jRadioButton2,BRUSHES[1]);     // jump to custom method
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        radio(jRadioButton3,BRUSHES[2]);     // jump to custom method
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        radio(jRadioButton4,BRUSHES[3]);     // jump to custom method
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        radio(jRadioButton5,BRUSHES[4]);     // jump to custom method
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        radio(jRadioButton6,BRUSHES[5]);     // jump to custom method
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        spinner();                          // jump to custom method
    }//GEN-LAST:event_jSpinner1StateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables

    // Custom methods below ...................................................
    
    /**
     * Sets up the objects needed to draw the graphics eventually
     */
    private void setup() {
        // setup the primitives
        size     = MIN;
        brush    = BRUSHES[0];
        currentX = 0;
        currentY = 0;
        // setup the advanced data types
        background = Color.white;
        foreground = Color.black;
        graphics   = jPanel1.getGraphics();
        model      = (SpinnerNumberModel)jSpinner1.getModel();        
        // assign them to the controls
        model.setValue(size);
        model.setStepSize(CHANGE);
        model.setMaximum(MAX);
        model.setMinimum(MIN);        
        jRadioButton1.setSelected(true);        
        graphics.setColor(foreground);
        jPanel1.setBackground(background);
        // setup the timer
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tick();
            }
        });
    }

    /**
     * Sets the foreground color for the brushes
     */
    private void setForeground() {
        timer.stop();                               // stop timer (if running)
        foreground = JColorChooser.showDialog(this, 
                "Choose a foreground color", foreground);   // dialog selection
        if (foreground == null) {                           // nothing chosen
            foreground = Color.black;                       // default color
        }
        graphics.setColor(foreground);                      // set chosen color
    }

    /**
     * Set the background color of the drawing surface
     */
    private void setBackground() {
        timer.stop();                               // stop timer (if running)
        background = JColorChooser.showDialog(this, 
                "Choose a background color", background);   // dialog selection
        if (background == null) {                           // nothing chosen
            background = Color.white;                       // default color
        }
        jPanel1.setBackground(background);                  // set chosen color
    }

    /**
     * Clears the drawing surface of all graphics
     */
    private void clear() {
        timer.stop();
        jPanel1.repaint();
    }

    /**
     * Starts a timer drawing random stars on the drawing surface
     */
    private void starBurst() {
        jPanel1.repaint();
        timer.start();
    }

    /**
     * The event of dragging a mouse over the panel drawing area
     * 
     * @param evt the mouse event 
     */
    private void drag(MouseEvent evt) {
        timer.stop();
        int x = evt.getX()-(size/2);
        int y = evt.getY()-(size/2);        
        if      (brush.equals(BRUSHES[0])) 
            graphics.fillOval(x, y, size, size);
        else if (brush.equals(BRUSHES[1])) 
            graphics.drawOval(x, y, size, size);
        else if (brush.equals(BRUSHES[2])) 
            graphics.fillRect(x, y, size, size);
        else if (brush.equals(BRUSHES[3])) 
            graphics.drawRect(x, y, size, size);
        else if (brush.equals(BRUSHES[4])) 
            graphics.fill3DRect(x, y, size, size,true);
        else if (brush.equals(BRUSHES[5])) 
            graphics.drawArc(x, y, size, size,45,120);        
    }

    /**
     * The event of the mouse wheel spinning over the panel drawing area
     * 
     * @param evt the mouse wheel event 
     */
    private void wheel(MouseWheelEvent evt) {
        timer.stop();
        if (evt.getWheelRotation() < 0) size += CHANGE;
        else                            size -= CHANGE;
        if (size < MIN) size = MIN;
        if (size > MAX) size = MAX;
        model.setValue(size);
    }

    /**
     * User selected a brush radio button
     * 
     * @param button the specific radio button selected
     * @param brush the specific brush selected
     */
    private void radio(JRadioButton button, String brush) {
        timer.stop();
        JRadioButton[] buttons = {
            jRadioButton1,jRadioButton2,jRadioButton3,
            jRadioButton4,jRadioButton5,jRadioButton6
        };
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setSelected(false);
        }
        button.setSelected(true);
        this.brush = brush;
    }

    /**
     * The event for the brush size spinner
     */
    private void spinner() {
        if (timer != null) timer.stop();
        size = (Integer)model.getNumber();
    }

    /**
     * The event the timer runs on it's interval
     */
    private void tick() {
        final int SPACE = 8;
        final int POINTS = 10;
        int w = jPanel1.getWidth() - (SPACE * 5);
        int h = jPanel1.getHeight() - (SPACE * 5);
        currentX = (int)((w-SPACE+1d)*Math.random()+SPACE);
        currentY = (int)((h-SPACE+1d)*Math.random()+SPACE);
        // all the points
        int x1  = currentX;
        int x2  = x1 + SPACE;
        int x3  = x2 + SPACE;
        int x4  = x3 + SPACE;
        int x5  = x4 + SPACE;
        int x6  = x5 - SPACE;
        int x7  = x6 + SPACE;
        int x8  = x7 - (SPACE * 2);
        int x9  = x8 - (SPACE * 2);
        int x10 = x9 + SPACE;
        // all the y points
        int y1  = currentY;
        int y2  = y1;
        int y3  = y2 - SPACE;
        int y4  = y3 + SPACE;
        int y5  = y4;
        int y6  = y5 + SPACE;
        int y7  = y6 + (SPACE * 2);
        int y8  = y7 - SPACE;
        int y9  = y8 + SPACE;
        int y10 = y9 - (SPACE * 2);
        // put all points in a array
        int xPoints[] = {x1,x2,x3,x4,x5,x6,x7,x8,x9,x10};
        int yPoints[] = {y1,y2,y3,y4,y5,y6,y7,y8,y9,y10};
        int r = (int)((255d-0d+1d)*Math.random()+0d);
        int g = (int)((255d-0d+1d)*Math.random()+0d);
        int b = (int)((255d-0d+1d)*Math.random()+0d);
        Color color = new Color(r, g, b);
        Polygon polygon = new Polygon(xPoints, yPoints, POINTS);
        graphics.setColor(color);
        graphics.fillPolygon(polygon);
    }
    
}
