
import java.util.ArrayList;

public class Fase {
    
    private Macaco macaco;
    private Estrela estrelas [] = new Estrela[3];
    private ArrayList<Objeto> atuadores = new ArrayList<>();

    public Fase() {
       
    }

    public Macaco getMacaco() {
        return macaco;
    }

    public Estrela[] getEstrelas() {
        return estrelas;
    }

    public ArrayList<Objeto> getAtuadores() {
        return atuadores;
    }
    
    public void adicionaObjeto(Objeto obj){
        this.atuadores.add(obj);
    }
    
    public void RemoveObjeto(Objeto obj){
        this.atuadores.remove(obj);
    }
    
}
