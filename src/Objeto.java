
import java.awt.Graphics;

public abstract class Objeto {
    private int x, y;
    private int largura, altura;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract public void desenha(Graphics g);
    
    abstract public void getXML();

    abstract public boolean colisao(int x, int y);
    
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

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
