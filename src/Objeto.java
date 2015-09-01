
import java.awt.Graphics;

public abstract class Objeto {
    private int x, y;
    protected float cteEscalaGrafico=0.3f;
    private int largura, altura;
    protected double angulo = 0;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    abstract public void desenha(Graphics g);
    
    abstract public void getXML();

    public boolean colisao(int x, int y) {
        if(x > this.getX() && x < this.getX()+this.getLargura()){
            if(y > this.getY() && y < this.getY()+this.getAltura()){
                return true;
            }
        }
        return false;
    }
    
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
        return (int)(largura*cteEscalaGrafico);
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return (int) (altura*cteEscalaGrafico);
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
