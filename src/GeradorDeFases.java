
import java.io.IOException;

public class GeradorDeFases {

    public static void main(String[] args) throws IOException {
        Fase fase = new Fase();
        new TelaEdicao(fase).setVisible(true);
    }
    
}
