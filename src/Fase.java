
import java.util.ArrayList;

public class Fase {
    
    private Macaco macaco;
    private Estrela estrelas [] = new Estrela[3];
    private ArrayList<Objeto> atuadores = new ArrayList<>();

    public Fase() {
        this.macaco = new Macaco(50, 50);
        for (int i = 0; i < estrelas.length; i++) {
            this.estrelas[i] = new Estrela(80 + (i*30), 30);
        }
    }
    
    public void adicionaObjeto(Objeto obj){
        this.atuadores.add(obj);
    }
    
    public void RemoveObjeto(Objeto obj){
        this.atuadores.remove(obj);
    }
    
}
