
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Cartola extends Objeto{
    
    private Image imgCartola;
    
    public Cartola(int x, int y) throws IOException {
        super(x, y);
        imgCartola = ImageIO.read(new URL(Ferramentas.getCodeBase(), "imagens/cartola.jpg"));
    }

    @Override
    public void desenha(Graphics g) {
        g.drawImage(imgCartola, this.getX(), this.getY(), 50, 50, null);
    }

    @Override
    public void getXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}