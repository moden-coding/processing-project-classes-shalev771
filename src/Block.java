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
    size = 60;
    store = d;
    ySpeed = 5;
    xSpeed = 5;
  }


public void appear() {
  store.rect(x, y,  size, size);
}
public void move(){
  y += ySpeed;
 // x += xSpeed;
  
}

public boolean checkBlock(float playerX, float playerY, float playerWidth, float rectWidth){

  if (x >= playerX && y  >= playerY && playerX + playerWidth >= x) {
      System.out.println("changing y speed");
      rectWidth --;
      return true;
  }else{
      return false;
  }
  

} 
public boolean offScreen(){
  if (y > store.height){
    //a.remove();
    return true;
    

}
return false;

}

}
