
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class CarroPalhaco extends Objeto{
    
    private Image imgCarroPalhaco;
    
    public CarroPalhaco(int x, int y) {
        super(x, y,true);
        URL url;
        try {
            url = new URL("file:///" + Ferramentas.getCodeBase() + "\\src\\imagens\\Pendulo.png");
            imgCarroPalhaco = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            System.out.println("Erro ao formar a url da imagem.");
            Logger.getLogger(CarroPalhaco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Erro ao carregar imagem.");
            Logger.getLogger(CarroPalhaco.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setAltura(imgCarroPalhaco.getHeight(null));
        this.setLargura(imgCarroPalhaco.getWidth(null));
    }

    @Override
    public void desenha(Graphics g) {
        g.drawImage(imgCarroPalhaco, this.getX(), this.getY(), this.getLargura(), this.getAltura(), null);
    }

    @Override
    public String getXML() {
        String xml ="";
        xml += "<Objeto tipo='carropalhaco'>";
        xml += "     <Posicao x='"+getX()+"' y="+getY()+" altura='"+getAltura()+"' largura='"+getLargura()+"'>";
        xml += "</Objeto>";                
        return xml;
    }
    
}
