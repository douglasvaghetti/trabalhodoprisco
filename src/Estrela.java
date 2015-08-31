
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Estrela extends Objeto {

    private Image imgEstrela;

    public Estrela(int x, int y)  {
        super(x, y);
        this.setAltura(50);
        this.setLargura(50);
        URL url;
        try {
            url = new URL("file:///" + Ferramentas.getCodeBase() + "\\src\\imagens\\Estrela.png");
            imgEstrela = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            System.out.println("Erro ao formar a url da imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Erro ao carregar imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void desenha(Graphics g) {
        g.drawImage(imgEstrela, this.getX(), this.getY(), this.getLargura(), this.getAltura(), null);
    }

    @Override
    public void getXML() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
