import processing.core.PApplet;

public class Ball {

    private float x;
    private float y;
    private int size;
    private PApplet canvas;
    private int xSpeed;
    private float ySpeed;
    private int color;

    public Ball(int i, int j, PApplet c) {
        
        canvas = c;
        x = canvas.random(200);
        y = canvas.random(200);
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
            xSpeed = -xSpeed;
        }
        if (y <= 0) {
            ySpeed = -ySpeed;
            System.out.println("reflect y");
            System.out.println(y);
        }
        

        

    }

    public void checkBall(float playerX, float playerY){

        if (x < playerX || x > playerY) {
            ySpeed = -ySpeed;
        }
        
    
    }

}
