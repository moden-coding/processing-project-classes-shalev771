import processing.core.PApplet;

public class Block {
  private int x;
  private int y;
  private int size;
  private PApplet store;
  private int xSpeed;
  private int ySpeed;

  public Block(int xPos, int yPos, PApplet d) {
    x = xPos;
    y = yPos;
    size = 30;
    store = d;
    ySpeed = 5;
    xSpeed = 5;
  }

// makes block apearin app.java
public void appear() {
  store.rect(x, y,  size, size);
}
public void move(){
  y += ySpeed;
 // x += xSpeed;
  
}
// method to check a collision between the balls and the block
public boolean checkBlock(float rectX, float rectY, float playerWidth, float rectWidth){

  if (x == rectX && y  == rectY && rectX + playerWidth == x) {
      System.out.println("changing y speed");
      rectWidth --;
      return true;
  }else{
      return false;
  }
  

} 
// method to check if block goes offscreen
public boolean offScreen(){
  if (y > store.height){
    //a.remove();
    return true;
    

}
return false;

}

}
