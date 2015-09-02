
import java.awt.Graphics;

public abstract class Objeto {
    private int x, y;
    protected float cteEscalaGrafico=0.3f;
    private int largura, altura;
    private float angulo = 0.0f;
    private boolean anguloFixo;
    private float escalaX;
    private boolean escalavel;
  

    public Objeto(int x, int y,boolean anguloFixo) {
        this.x = x;
        this.y = y;
        this.anguloFixo=anguloFixo;
        this.escalaX=1.0f;
    }
    
    public Objeto(int x, int y,boolean anguloFixo,boolean escalavel) {
        this.x = x;
        this.y = y;
        this.anguloFixo=anguloFixo;
        this.escalaX=1.0f;
        this.escalavel=escalavel;
        
    }
    public Objeto(int x, int y, float angulo,boolean anguloFixo){
        this.x=x;
        this.y=y;
        this.angulo=angulo;
        this.anguloFixo=anguloFixo;
        this.escalaX=1.0f;
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
        return (int)(largura*cteEscalaGrafico*getEscalaX());
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
    public boolean getAnguloFixo(){
        return anguloFixo;
    }

    
    public float getAngulo() {
        return angulo;
    }

    
    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    /**
     * @return the escalaX
     */
    public float getEscalaX() {
        return escalaX;
    }

    /**
     * @param escalaX the escalaX to set
     */
    public void setEscalaX(float escalaX) {
        this.escalaX = escalaX;
    }

    /**
     * @return the escalavel
     */
    public boolean isEscalavel() {
        return escalavel;
    }
    
    
}
