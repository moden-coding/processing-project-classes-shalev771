import java.util.ArrayList;

import processing.core.*;

public class App extends PApplet {
    PImage img1;
    Ball firstOne;
    float playerY = 40;
    float playerX = 200;
    float rectX = 250;
    float rectY = 450;
     ArrayList<Ball> balls = new ArrayList<>();

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
        for (Ball b : balls) {
            b.update();
            b.display();
            b.checkBall(rectX, rectY);
        }

    }

    public void keyPressed() {
        if (key == ' ') {
            for (int i = 0; i < 1; i++) {
                Ball ball = new Ball((int) random(600), (int) random(600), this);
                balls.add(ball);
            }
        }

        if (keyCode == RIGHT) {
            rectX += 40;
        }
        if (keyCode == LEFT) {
            rectX -= 40;
        }
        

    }
}
