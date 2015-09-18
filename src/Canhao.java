
import java.awt.Graphics;

public class Canhao extends Objeto{

    public Canhao(int x, int y) {
        super(x, y,false);
    }

    @Override
    public void desenha(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getXML() {
        return "<Objeto tipo='canhao'>"
                + "</Objeto>";
    }
    
}
