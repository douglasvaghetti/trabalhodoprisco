
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joelzinho
 */
public class Plataforma extends Objeto{

    private Image imgPlataforma;
    
    public Plataforma(int x, int y) {
        super(x, y,false,true);
        
        URL url;
        try {
            url = new URL("file:///" + Ferramentas.getCodeBase() + "\\src\\imagens\\Plataforma.png");
            imgPlataforma = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            System.out.println("Erro ao formar a url da imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Erro ao carregar imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setAltura(imgPlataforma.getHeight(null));
        this.setLargura(imgPlataforma.getWidth(null));
    }

    @Override
    public void desenha(Graphics g) {
        g.drawImage(imgPlataforma, this.getX(), this.getY(), this.getLargura(), this.getAltura(), null);
    }

     @Override
    public String getXML() {
        String xml ="";
        xml += "     <Objeto tipo='plataforma'>\n";
        xml += "          <Posicao x='"+getX()+"' y='"+getY()+"' altura='"+getAltura()+"' largura='"+getLargura()+"'>\n";
        xml += "     </Objeto>";                
        return xml;
    }
    
}
