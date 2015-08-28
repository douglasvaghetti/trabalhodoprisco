
import java.awt.Graphics;

public abstract class Objeto {
    private int x, y;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract public void desenha(Graphics g);
    
    abstract public void getXML();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
