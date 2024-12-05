import processing.core.PApplet;

public class Ball {

    private int x;
    private int y;
    private int size;
    private PApplet canvas;
    private int xSpeed;
    private float ySpeed;  
    private int color;
     
    public Ball(int i, int j, PApplet c) {
        x = 0;
        y = 200;
        canvas = c;
        size = 50;
        xSpeed = 5;
        ySpeed = 5;
        color = canvas.color(0, 200, 200);
        
    }

    public void display() {
        canvas.fill(color);
        canvas.circle(x, y, size);
    }

    public void update() {
        y += ySpeed;
        x += xSpeed;

       
        if (x >= canvas.width || x <= 0) {
            xSpeed = -xSpeed;{

            }
             
         if (y <= canvas.height|| y <= 0)   {
            ySpeed = -ySpeed;
         }
            
     

       
       

            // got this from chat gpt makes it so that when ball
            //makes contact with the bouncer it detects collision.
            int rectY = canvas.height - 50;
            if (y + size / 2 >= rectY && ySpeed > 0) {
                y = rectY - size / 2; 
                ySpeed = -ySpeed * 0.8f; 
            }
        }
    }

    


}
