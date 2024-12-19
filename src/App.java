import java.util.ArrayList;

import processing.core.*;

public class App extends PApplet {
    PImage img1;
    Ball firstOne;
    float rectHeight = 40;
    float rectWidth = 200;
    float rectX = 250;
    float rectY = 650;
    ArrayList<Ball> balls = new ArrayList<>();
    int health = 3;
    int score = 0;
    Block blockOne;
    ArrayList<Block> blocks = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void setup() {
        img1 = loadImage("backround.png");
        firstOne = new Ball(400, 300, this);
        balls.add(firstOne);
        blockOne = new Block(100, 400, this);

    }

    public void settings() {
        size(1000, 700);
    }

    public void draw() {
        image(img1, 0, 0, 1000, 700);
        rect(rectX, rectY, rectWidth, rectHeight);
        fill(200, 0, 200);

        // for (Ball b : balls) {
        for (int i = 0; i < balls.size(); i++) {
            Ball b = balls.get(i);
            b.update();
            b.display();
            fill(0, 150, 150);
            if (b.checkBall(rectX, rectY, rectWidth)) {
                score++;
            }
            if (b.goesOffScreen()) {
                health--;
                balls.remove(b);
            }

        }
        if(random(1) < .008){
            Block b = new Block((int) random(500), (int) (10), this);
            blocks.add(b);
        }
        for (int i = 0; i < blocks.size(); i++) {
            Block b = blocks.get(i);
            b.appear();
            b.move();
            if (b.checkBlock(rectX, rectY, rectHeight, rectWidth)) {
                score--;

            }
            if (b.offScreen()) {
                blocks.remove(b);
            } 
            if (b.checkBlock(rectX, rectY, rectHeight, rectWidth))
            blocks.remove(b);
        }
       
        fill(255);
        textSize(30);
        text("health " + health, 50, 50);

        if (health == 0) {
            fill(255, 0, 0);
            textSize(100);
            text("GAME OVER", 120, 300);
            fill(255, 0, 0);
            textSize(40);
            text("press space then p to restart", 180, 350);
        }
        fill(255);
        textSize(30);
        text("Score " + score, 50, 100);

        if (health == 0) {
            score -= score;
        }

        if (score == 1) {
            fill(255);
            textSize(100);
            text("Level 1", 120, 300);

        }

        if (score == 10) {
            fill(255);
            textSize(100);
            text("Level 2", 120, 300);
        }
        if (score == 20) {
            fill(255);
            textSize(100);
            text("Level 3", 120, 300);
        }
        if (score == 30) {
            fill(255);
            textSize(100);
            text("Level 4", 120, 300);
        }
        if (score == 40) {
            fill(255);
            textSize(100);
            text("Level 5", 120, 300);
        }
        if (score == 50) {
            fill(255);
            textSize(100);
            text("Level 6", 120, 300);
        }
        if (score == 60) {
            fill(255);
            textSize(100);
            text("Final Level", 120, 300);
        }

        if (health == 0) {
            fill(240);
            textSize(40);
            text("High score " + score, 200, 100);
        }
        

    }

    public void keyPressed() {
        if (key == 'p') {
            for (int i = 0; i < 1; i++) {
                Ball ball = new Ball((int) random(600), (int) random(600), this);
                balls.add(ball);
            }
        }

        if (keyCode == RIGHT) {
            rectX += 60;
        }
        if (keyCode == LEFT) {
            rectX -= 60;
        }
        if (keyCode == ' ') {
            health += 3;
        }

    }
}
