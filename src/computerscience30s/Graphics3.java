
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
 * with our custom code (a 'hybrid' approach) to make a "mini final project" 
 * type of application (a mini 'PhotoShop')
 *
 * @author Mr. Wachs 
 * @since December 2024 
 */
public class Graphics3 extends javax.swing.JFrame 
{

    /**
     * Default class constructor, sets class properties
     */
    public Graphics3() {
        initComponents();
        setup();                // jump to custom method
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

        titlelabel = new java.awt.Label();
        filledOvalRadioButton = new javax.swing.JRadioButton();
        openOvalRadioButton = new javax.swing.JRadioButton();
        filledRectangleRadioButton = new javax.swing.JRadioButton();
        openRectangleRadioButton = new javax.swing.JRadioButton();
        threeDRectangleRadioButton = new javax.swing.JRadioButton();
        arcRadioButton = new javax.swing.JRadioButton();
        brushSizeLabel = new javax.swing.JLabel();
        brushSizeSpinner = new javax.swing.JSpinner();
        foregroundColorButton = new javax.swing.JButton();
        backgroundColorButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        starBurstButton = new javax.swing.JButton();
        drawingPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wachs FotoShopish");
        setResizable(false);

        titlelabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titlelabel.setText("Wachs FotoShopish");

        filledOvalRadioButton.setText("Filled Oval");
        filledOvalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filledOvalRadioButtonActionPerformed(evt);
            }
        });

        openOvalRadioButton.setText("Open Oval");
        openOvalRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOvalRadioButtonActionPerformed(evt);
            }
        });

        filledRectangleRadioButton.setText("Filled Rectangle");
        filledRectangleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filledRectangleRadioButtonActionPerformed(evt);
            }
        });

        openRectangleRadioButton.setText("Open Rectangle");
        openRectangleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRectangleRadioButtonActionPerformed(evt);
            }
        });

        threeDRectangleRadioButton.setText("3D Rectangle");
        threeDRectangleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeDRectangleRadioButtonActionPerformed(evt);
            }
        });

        arcRadioButton.setText("Arc");
        arcRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcRadioButtonActionPerformed(evt);
            }
        });

        brushSizeLabel.setText("Brush size:");
        brushSizeLabel.setToolTipText("");

        brushSizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brushSizeSpinnerStateChanged(evt);
            }
        });

        foregroundColorButton.setText("Foreground Color");
        foregroundColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foregroundColorButtonActionPerformed(evt);
            }
        });

        backgroundColorButton.setText("Background Color");
        backgroundColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundColorButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        starBurstButton.setText("Star Burst");
        starBurstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starBurstButtonActionPerformed(evt);
            }
        });

        drawingPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        drawingPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingPanelMouseDragged(evt);
            }
        });
        drawingPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                drawingPanelMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filledOvalRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openOvalRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filledRectangleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openRectangleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeDRectangleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arcRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(brushSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(brushSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(foregroundColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backgroundColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(starBurstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titlelabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(filledOvalRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(openOvalRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(filledRectangleRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(openRectangleRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(threeDRectangleRadioButton)
                        .addGap(12, 12, 12)
                        .addComponent(arcRadioButton)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brushSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(brushSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addComponent(foregroundColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(backgroundColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(starBurstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foregroundColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foregroundColorButtonActionPerformed
        setForeground();        // jump to custom method
    }//GEN-LAST:event_foregroundColorButtonActionPerformed

    private void backgroundColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundColorButtonActionPerformed
        setBackground();        // jump to custom method
    }//GEN-LAST:event_backgroundColorButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clear();                // jump to custom method
    }//GEN-LAST:event_clearButtonActionPerformed

    private void starBurstButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starBurstButtonActionPerformed
        starBurst();            // jump to custom method
    }//GEN-LAST:event_starBurstButtonActionPerformed

    private void filledOvalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filledOvalRadioButtonActionPerformed
        radio(filledOvalRadioButton,BRUSHES[0]);     // jump to custom method
    }//GEN-LAST:event_filledOvalRadioButtonActionPerformed

    private void openOvalRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOvalRadioButtonActionPerformed
        radio(openOvalRadioButton,BRUSHES[1]);     // jump to custom method
    }//GEN-LAST:event_openOvalRadioButtonActionPerformed

    private void filledRectangleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filledRectangleRadioButtonActionPerformed
        radio(filledRectangleRadioButton,BRUSHES[2]);     // jump to custom method
    }//GEN-LAST:event_filledRectangleRadioButtonActionPerformed

    private void openRectangleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRectangleRadioButtonActionPerformed
        radio(openRectangleRadioButton,BRUSHES[3]);     // jump to custom method
    }//GEN-LAST:event_openRectangleRadioButtonActionPerformed

    private void threeDRectangleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeDRectangleRadioButtonActionPerformed
        radio(threeDRectangleRadioButton,BRUSHES[4]);     // jump to custom method
    }//GEN-LAST:event_threeDRectangleRadioButtonActionPerformed

    private void arcRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcRadioButtonActionPerformed
        radio(arcRadioButton,BRUSHES[5]);     // jump to custom method
    }//GEN-LAST:event_arcRadioButtonActionPerformed

    private void brushSizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brushSizeSpinnerStateChanged
        spinner();                          // jump to custom method
    }//GEN-LAST:event_brushSizeSpinnerStateChanged

    private void drawingPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingPanelMouseDragged
        drag(evt);              // jump to custom method
    }//GEN-LAST:event_drawingPanelMouseDragged

    private void drawingPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_drawingPanelMouseWheelMoved
        wheel(evt);             // jump to custom method
    }//GEN-LAST:event_drawingPanelMouseWheelMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arcRadioButton;
    private javax.swing.JButton backgroundColorButton;
    private javax.swing.JLabel brushSizeLabel;
    private javax.swing.JSpinner brushSizeSpinner;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JRadioButton filledOvalRadioButton;
    private javax.swing.JRadioButton filledRectangleRadioButton;
    private javax.swing.JButton foregroundColorButton;
    private javax.swing.JRadioButton openOvalRadioButton;
    private javax.swing.JRadioButton openRectangleRadioButton;
    private javax.swing.JButton starBurstButton;
    private javax.swing.JRadioButton threeDRectangleRadioButton;
    private java.awt.Label titlelabel;
    // End of variables declaration//GEN-END:variables

    
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
        graphics   = drawingPanel.getGraphics();
        model      = (SpinnerNumberModel)brushSizeSpinner.getModel();        
        // assign them to the controls
        model.setValue(size);
        model.setStepSize(CHANGE);
        model.setMaximum(MAX);
        model.setMinimum(MIN);        
        filledOvalRadioButton.setSelected(true);        
        graphics.setColor(foreground);
        drawingPanel.setBackground(background);
        // setup the timer
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tick();
            }
        });
        this.setSize(950, 560);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        drawingPanel.setBackground(background);                  // set chosen color
    }

    /**
     * Clears the drawing surface of all graphics
     */
    private void clear() {
        timer.stop();
        drawingPanel.repaint();
    }

    /**
     * Starts a timer drawing random stars on the drawing surface
     */
    private void starBurst() {
        drawingPanel.repaint();
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
            filledOvalRadioButton,openOvalRadioButton,filledRectangleRadioButton,
            openRectangleRadioButton,threeDRectangleRadioButton,arcRadioButton
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
        int w = drawingPanel.getWidth() - (SPACE * 5);
        int h = drawingPanel.getHeight() - (SPACE * 5);
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
