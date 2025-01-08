import processing.core.PApplet;

public class Ball {

    private float x;
    private float y;
    private int size;
    private PApplet canvas;
    private int xSpeed;
    private float ySpeed;
    private int color;
    private int health;

    public Ball(int i, int j, PApplet c) {
        
        canvas = c;
        x = canvas.random(200);
        y = canvas.random(200);
        size = 50;
        xSpeed = 10;
        ySpeed = 10;
        color = canvas.color(0, 200, 200);
        health = 3;
       

       }

    //}
    //public void removeBall(){
       // if (y > canvas.height) {
       //  ballExists = false;
       // }
  //  }
    // method to get the ball to apear
    public void display() {
        canvas.fill(color);
        canvas.circle(x, y, size);
        
    }

    public void update() {
        y += ySpeed;
        x += xSpeed;
        

        if (x >= canvas.width || x <= 0) {
            xSpeed = -xSpeed;
            System.out.println(health);
        }
        if (y <= 0) {
            ySpeed = -ySpeed;
            System.out.println("reflect y");
            System.out.println(y);
        }
        
        

        

    }
    // must remove the ball from the array list when it go0es off screen
    // because it would still be tracking the ball.
    public boolean goesOffScreen(){
        if (y > canvas.height){
            //a.remove();
            return true;
            

        }
        return false;
    }
    
    // to reflect the ball when it collides with the bouncer.
    public boolean checkBall(float playerX, float playerY, float playerWidth){

        if (x >= playerX && y >= playerY && playerX + playerWidth >= x) {
            System.out.println("changing y speed");
            ySpeed = -ySpeed;
            return true;
        }else{
            return false;
        }
        
    
    } 
    public void increaseSpeed(){
        if (xSpeed > 0){
            xSpeed += 2;
         }else{
            xSpeed -= 2;
         }  if (ySpeed > 0){
            ySpeed += 2;
         }else{
            ySpeed -= 2;
         }
    }


}
