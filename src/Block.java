import processing.core.PApplet;

public class Block {
  private int x;
  private int y;
  private int size;
  private PApplet store;

  public Block(int xPos, int yPos, PApplet d) {
    x = xPos;
    y = yPos;
    size = 30;
    store = d;
  }


public void appear() {
  store.circle(x, y, size);
}
}
