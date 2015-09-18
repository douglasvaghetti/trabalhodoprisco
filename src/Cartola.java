
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
    
    private Cor corcartola;
    
    public Cartola(int x, int y, Cor cor) {
        super(x, y,false);
        corcartola = cor;
        URL url=criaURLCartola();
        try {
            imgCartola = ImageIO.read(url);
        }catch (IOException ex) {
            System.out.println("Erro ao carregar imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setAltura(imgCartola.getHeight(null));
        this.setLargura(imgCartola.getWidth(null));
    }
    private  URL criaURLCartola(){
        URL url = null;
         try {
            if(corcartola==Cor.Azul)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Azul.png");
            else if(corcartola==Cor.Amarela)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Amarela.png");
            else if(corcartola==Cor.Verde)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Verde.png");
            else if(corcartola==Cor.Vermelha)
                url = new URL("file:///"+Ferramentas.getCodeBase()+"\\src\\imagens\\Cartola_Vermelha.png");
        } catch (MalformedURLException ex) {
            System.out.println("Erro ao formar a url da imagem.");
            Logger.getLogger(Cartola.class.getName()).log(Level.SEVERE, null, ex);
        }
        return url;
    }
    @Override
    public void desenha(Graphics g) {
        g.drawImage(imgCartola, this.getX(), this.getY(),getLargura(),getAltura(),null);
    }
    
    

    @Override
    public String getXML() {
    String xml ="";
        xml += "<Objeto tipo='cartola' cor='"+corcartola.name()+"'>";
        xml += "     <Posicao x='"+getX()+"' y="+getY()+" altura='"+getAltura()+"' largura='"+getLargura()+"'>";
        xml += "</Objeto>";                
        return xml;
    }
    
}