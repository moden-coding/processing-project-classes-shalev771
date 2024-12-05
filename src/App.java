import processing.core.*;

public class App extends PApplet {
    PImage img1;
    Ball firstOne;
    float playerY = 40;
    float playerX = 200;
    float rectX = 250;
    float rectY = 450;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        img1 = loadImage("backround.png");
        firstOne = new Ball(400, 300, this);
    }

    public void settings() {
        size(700, 500);
    }

    public void draw() {
        image(img1, 0, 0, 700, 500);
        rect(rectX, rectY, playerX, playerY);
        fill(200, 0, 200);
        firstOne.display();
        firstOne.update();

    }

    public void keyPressed() {
        if (keyCode == RIGHT) {
            rectX += 30;
        }
        if (keyCode == LEFT) {
            rectX -= 30;
        }
         
        if (keyCode == ' ') {
            
        }

    }
}
