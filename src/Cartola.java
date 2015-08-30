
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Cartola extends Objeto{
    
    private Image imgCartola;
    
    public Cartola(int x, int y) throws IOException {
        super(x, y);
        this.setAltura(50);
        this.setLargura(50);
        System.out.println("base= "+Ferramentas.getCodeBase());
        System.out.println(Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Azul.png");
        URL url= new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Azul.png");
        System.out.println("url = "+url.toString());
        
        imgCartola = ImageIO.read(url);
    }

    @Override
    public void desenha(Graphics g) {
        g.drawImage(imgCartola, this.getX(), this.getY(), this.getLargura(), this.getAltura(), null);
    }

    @Override
    public void getXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}