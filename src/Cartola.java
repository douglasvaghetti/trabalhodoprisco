
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Cartola extends Objeto{
    
    private Image imgCartola;
    public enum Cor {Azul,Amarela,Vermelha,Verde};
    public Cartola(int x, int y,Cor cor) {
        super(x, y);
        this.setAltura(50);
        this.setLargura(50);
        URL url=criaURLCartola(cor);
        try {
            imgCartola = ImageIO.read(url);
        }catch (IOException ex) {
            System.out.println("Erro ao carregar imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private  URL criaURLCartola(Cor cor){
        URL url = null;
         try {
            if(cor==Cor.Azul)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Azul.png");
            else if(cor==Cor.Amarela)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Amarela.png");
            else if(cor==Cor.Verde)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Verde.png");
            else if(cor==Cor.Vermelha)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Vermelha.png");
        } catch (MalformedURLException ex) {
            System.out.println("Erro ao formar a url da imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        }
        return url;
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