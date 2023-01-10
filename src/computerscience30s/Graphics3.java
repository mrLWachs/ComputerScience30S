
/** Required package class namespace */
package computerscience30s;

/** Required imports */
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
 * @since 10-Jan-2022, 11:40:10 AM
 */
public class Graphics3 extends javax.swing.JFrame {

    /**
     * Creates new form Graphics3
     */
    public Graphics3() {
        initComponents();
        // The "hybrid" approach means is you use the designer combined
        // with your own code to make the user interface what you want
        // So we call our own custom method that we place at the bottom of 
        // the code
        initializeContainer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foregroundColor = new javax.swing.JButton();
        backgroundColor = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        starBurst = new javax.swing.JButton();
        information = new javax.swing.JLabel();
        brushSize = new javax.swing.JSpinner();
        filledOval = new javax.swing.JRadioButton();
        openOval = new javax.swing.JRadioButton();
        filledRectangle = new javax.swing.JRadioButton();
        openRectangle = new javax.swing.JRadioButton();
        threeDRectangle = new javax.swing.JRadioButton();
        arc = new javax.swing.JRadioButton();
        drawArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        foregroundColor.setText("Foreground Color");
        foregroundColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foregroundColorActionPerformed(evt);
            }
        });
        getContentPane().add(foregroundColor);
        foregroundColor.setBounds(10, 230, 200, 30);

        backgroundColor.setText("Background Color");
        backgroundColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundColorActionPerformed(evt);
            }
        });
        getContentPane().add(backgroundColor);
        backgroundColor.setBounds(10, 270, 200, 30);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(10, 310, 200, 30);

        starBurst.setText("Star Burst");
        starBurst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starBurstActionPerformed(evt);
            }
        });
        getContentPane().add(starBurst);
        starBurst.setBounds(10, 350, 200, 30);

        information.setText("Brush size:");
        getContentPane().add(information);
        information.setBounds(10, 190, 80, 20);

        brushSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                brushSizeStateChanged(evt);
            }
        });
        getContentPane().add(brushSize);
        brushSize.setBounds(90, 190, 40, 22);

        filledOval.setText("Filled Oval");
        filledOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filledOvalActionPerformed(evt);
            }
        });
        getContentPane().add(filledOval);
        filledOval.setBounds(10, 10, 140, 20);

        openOval.setText("Open Oval");
        openOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openOvalActionPerformed(evt);
            }
        });
        getContentPane().add(openOval);
        openOval.setBounds(10, 40, 140, 20);

        filledRectangle.setText("Filled Rectangle");
        filledRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filledRectangleActionPerformed(evt);
            }
        });
        getContentPane().add(filledRectangle);
        filledRectangle.setBounds(10, 70, 140, 20);

        openRectangle.setText("Open Rectangle");
        openRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRectangleActionPerformed(evt);
            }
        });
        getContentPane().add(openRectangle);
        openRectangle.setBounds(10, 100, 140, 20);

        threeDRectangle.setText("3D Rectangle");
        threeDRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeDRectangleActionPerformed(evt);
            }
        });
        getContentPane().add(threeDRectangle);
        threeDRectangle.setBounds(10, 130, 140, 20);

        arc.setText("Arc");
        arc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcActionPerformed(evt);
            }
        });
        getContentPane().add(arc);
        arc.setBounds(10, 160, 140, 20);

        drawArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        drawArea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawAreaMouseDragged(evt);
            }
        });
        drawArea.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                drawAreaMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout drawAreaLayout = new javax.swing.GroupLayout(drawArea);
        drawArea.setLayout(drawAreaLayout);
        drawAreaLayout.setHorizontalGroup(
            drawAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        drawAreaLayout.setVerticalGroup(
            drawAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        getContentPane().add(drawArea);
        drawArea.setBounds(220, 10, 600, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foregroundColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foregroundColorActionPerformed
        setForeground();        // Use "lightbulb" to create custom method
    }//GEN-LAST:event_foregroundColorActionPerformed

    private void backgroundColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundColorActionPerformed
        setBackground();
    }//GEN-LAST:event_backgroundColorActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        setClear();
    }//GEN-LAST:event_clearActionPerformed

    private void starBurstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starBurstActionPerformed
        setStarBurst();
    }//GEN-LAST:event_starBurstActionPerformed

    private void brushSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_brushSizeStateChanged
        setSpinner();
    }//GEN-LAST:event_brushSizeStateChanged

    private void filledOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filledOvalActionPerformed
        setRadio(filledOval,BRUSHES[0]);
    }//GEN-LAST:event_filledOvalActionPerformed

    private void openOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openOvalActionPerformed
        setRadio(openOval,BRUSHES[1]);
    }//GEN-LAST:event_openOvalActionPerformed

    private void filledRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filledRectangleActionPerformed
        setRadio(filledRectangle,BRUSHES[2]);
    }//GEN-LAST:event_filledRectangleActionPerformed

    private void openRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRectangleActionPerformed
        setRadio(openRectangle,BRUSHES[3]);
    }//GEN-LAST:event_openRectangleActionPerformed

    private void threeDRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeDRectangleActionPerformed
        setRadio(threeDRectangle,BRUSHES[4]);
    }//GEN-LAST:event_threeDRectangleActionPerformed

    private void arcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcActionPerformed
        setRadio(arc,BRUSHES[5]);
    }//GEN-LAST:event_arcActionPerformed

    private void drawAreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawAreaMouseDragged
        setDrag(evt);
    }//GEN-LAST:event_drawAreaMouseDragged

    private void drawAreaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_drawAreaMouseWheelMoved
        setWheel(evt);
    }//GEN-LAST:event_drawAreaMouseWheelMoved

    // NOTE: the NetBeans visual designer when a JFrame form is added to a 
    // project also adds a main method below for each JFrame form, but this 
    // main method can be edited and removed. I have removed the main method  
    // for this class
    
    // NOTE: the NetBeans visual designer adds the code below for each 
    // component (control, widget, property, global variable) which also 
    // cannot be edited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton arc;
    private javax.swing.JButton backgroundColor;
    private javax.swing.JSpinner brushSize;
    private javax.swing.JButton clear;
    private javax.swing.JPanel drawArea;
    private javax.swing.JRadioButton filledOval;
    private javax.swing.JRadioButton filledRectangle;
    private javax.swing.JButton foregroundColor;
    private javax.swing.JLabel information;
    private javax.swing.JRadioButton openOval;
    private javax.swing.JRadioButton openRectangle;
    private javax.swing.JButton starBurst;
    private javax.swing.JRadioButton threeDRectangle;
    // End of variables declaration//GEN-END:variables

    // Global variables (properties of the class) below........................
    
    // Constants:
    private final int MIN    = 2;           // for the brushes
    private final int MAX    = 200;         
    private final int CHANGE = 5;           
    private final String[] BRUSHES = {
        "Filled oval",
        "Open oval",
        "Filled rectangle",
        "Open rectangle",
        "3D rectangle",
        "Arc"
    };
    
    // Variables (primitive)
    private String brush;
    private int    size;
    private int    currentX;
    private int    currentY;
    
    // Class object variables (non-primitive)
    private Color              foreground;
    private Color              background;
    private Graphics           graphics;
    private SpinnerNumberModel model;
    private Timer              timer;
    
    // Custom Methods (that I wrote) below.....................................
    
    /**
     * Sets the properties of this form
     */
    private void initializeContainer() {
        // Setup the frame properties
        this.setSize(853,430);
        this.setTitle("Graphics 3");    // Sets the title at top of form (frame)
        this.setResizable(false);       // Makes it so the user cannot resize
        this.setLocationRelativeTo(null);   // Centers the form on screen
        
        // Code to initialize the other code variables....
        
        // Setup the primitives to default values
        size     = MIN;
        brush    = BRUSHES[0];
        currentX = 0;
        currentY = 0;
        
        // Setup the advanced data types to default values
        background = Color.white;
        foreground = Color.black;
        graphics   = drawArea.getGraphics();
        model      = (SpinnerNumberModel)brushSize.getModel(); 
        
        // Assign the variables and defualts to the controls
        model.setValue(size);
        model.setStepSize(CHANGE);
        model.setMaximum(MAX);
        model.setMinimum(MIN);        
        filledOval.setSelected(true);        
        graphics.setColor(foreground);
        drawArea.setBackground(background);
        
        // Setup the timer (use autocomplete to help write this code)
        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tick();                                 // Call custom method
            }
        });
        
        this.setVisible(true);                          // Make form appear
    }
    
    /**
     * Sets the foreground color for the brushes
     */
    private void setForeground() {
        timer.stop();                               // Stop timer (if running)
        foreground = JColorChooser.showDialog(this, 
                "Choose a foreground color", foreground);   // Dialog selection
        if (foreground == null) {                           // Nothing chosen
            foreground = Color.black;                       // Default color
        }
        graphics.setColor(foreground);                      // Set chosen color
    }

    /**
     * Set the background color of the drawing surface
     */
    private void setBackground() {
        timer.stop();                               // Stop timer (if running)
        background = JColorChooser.showDialog(this, 
                "Choose a background color", background);   // Dialog selection
        if (background == null) {                           // Nothing chosen
            background = Color.white;                       // Default color
        }
        drawArea.setBackground(background);                 // Set chosen color
    }

    /**
     * Clears the drawing surface of all graphics
     */
    private void setClear() {
        timer.stop();                   // Timer should be off
        drawArea.repaint();             // Have the surface clear of all marks
    }

    /**
     * Starts a timer drawing random stars on the drawing surface
     */
    private void setStarBurst() {
        drawArea.repaint();             // Have the surface clear of all marks
        timer.start();                  // Start timer code to make stars
    }

    /**
     * The event of dragging a mouse over the panel drawing area
     * 
     * @param event the mouse event 
     */
    private void setDrag(MouseEvent event) {
        timer.stop();                           // Timer should be off
        int x = event.getX()-(size/2);          // Get mouse x coordinate
        int y = event.getY()-(size/2);          // and y coordinate
        if      (brush.equals(BRUSHES[0])) graphics.fillOval(x, y, size, size);
        else if (brush.equals(BRUSHES[1])) graphics.drawOval(x, y, size, size);
        else if (brush.equals(BRUSHES[2])) graphics.fillRect(x, y, size, size);
        else if (brush.equals(BRUSHES[3])) graphics.drawRect(x, y, size, size);
        else if (brush.equals(BRUSHES[4])) graphics.fill3DRect(x, y, size, size,true);
        else if (brush.equals(BRUSHES[5])) graphics.drawArc(x, y, size, size,45,120);  
    }

    /**
     * The event of the mouse wheel spinning over the panel drawing area
     * 
     * @param event the mouse wheel event 
     */
    private void setWheel(MouseWheelEvent event) {
        timer.stop();                                       // Timer off
        if (event.getWheelRotation() < 0) size += CHANGE;   // Increase size
        else                              size -= CHANGE;   // Decrease size
        if (size < MIN) size = MIN;                         // Check for edge
        if (size > MAX) size = MAX; 
        model.setValue(size);                               // Set spinner
    }

    /**
     * The event for the brush size spinner
     */
    private void setSpinner() {
        if (timer != null) timer.stop();        // Timer should be off
        size = (Integer)model.getNumber();      // Set size from spinner
    }

    /**
     * User selected a brush radio button
     * 
     * @param button the specific radio button selected
     * @param brush the specific brush selected 
     */
    private void setRadio(JRadioButton button, String brush) {
        timer.stop();                       // Timer should be off
        JRadioButton[] buttons = {
            openOval,
            filledOval,
            openRectangle,
            filledRectangle,
            threeDRectangle,
            arc
        };                                          // Put buttons in an array
        for (int i = 0; i < buttons.length; i++) {  // Traverse array
            buttons[i].setSelected(false);          // set button to false
        }
        button.setSelected(true);                   // Select the one button
        this.brush = brush;                         // Select this brush
    }
    
    /**
     * The event the timer runs on it's interval
     */
    private void tick() {
        final int SPACE = 8;            // Spacing between points
        final int POINTS = 10;          // Total number of vertices
        int w = drawArea.getWidth() - (SPACE * 5);  // Width of drawing area
        int h = drawArea.getHeight() - (SPACE * 5); // Height of drawing area
        currentX = (int)((w-SPACE+1d)*Math.random()+SPACE); // Random x
        currentY = (int)((h-SPACE+1d)*Math.random()+SPACE); // Random y
        // Set all the x coordinate points
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
        // Set all the y coordinate points
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
        // Put all the x and y points into two arrays
        int xPoints[] = {x1,x2,x3,x4,x5,x6,x7,x8,x9,x10};
        int yPoints[] = {y1,y2,y3,y4,y5,y6,y7,y8,y9,y10};
        // Generate random color values
        int r = (int)((255d-0d+1d)*Math.random()+0d);
        int g = (int)((255d-0d+1d)*Math.random()+0d);
        int b = (int)((255d-0d+1d)*Math.random()+0d);
        Color color = new Color(r, g, b);                   // Random color
        Polygon polygon = new Polygon(xPoints, yPoints, POINTS);    
        graphics.setColor(color);                           // Set color
        graphics.fillPolygon(polygon);                      // Draw star
    }

}
