import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 500, 400);  
        myCanvas.erase();
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));
            
            pen.randomSquiggle();
        }
    }
    
    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    }
    
     /**
     * Permita dibujar un triangulo verde en las coordenadas pasadas 
     * como parametro
     */
    public void drawTriangle(int xPosition, int yPosition){
        Pen pen = new Pen(xPosition, yPosition, myCanvas);
        pen.setColor(Color.GREEN);
        
        pen.move(200);
        pen.turn(120);
        pen.move(200);
        pen.turn(120);
        pen.move(200);
        pen.turn(120);
        
    }
    
    /**
     * Permitir dibujar un pentagono verde
     */
    public void drawPentagon(){
        Pen pen = new Pen(200, 100, myCanvas);
        pen.setColor(Color.GREEN);
        for(int i=0; i<5; i++){
            pen.move(100);
            pen.turn(360/5);
        }
    }
    
    /**
     * Permite dibujar un poligono regular con n lados, es decir, si n vale 3
     * sera un triangulo, si vale 4 sera un cuadrado, etc
     */
    public void drawPolygon(int n){
        Pen pen = new Pen(200,100, myCanvas);
        pen.setColor(Color.GREEN);
        for(int i=0; i<n; i++){
            pen.move(100);
            pen.turn(360/n);
        }
    
    }
    
    /**
     * Permite dibujar una espiral como la que se muestra en la figura 6.6
     */
    public void drawSpiral(){
        Pen pen = new Pen(200,100, myCanvas);
        pen.setColor(Color.BLACK);
        
        for(int i=0; i<60; i++){
            pen.move(i*2);
            pen.turn(90);
        }
    }
}
