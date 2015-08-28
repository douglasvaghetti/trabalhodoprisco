
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallan
 */
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
    
    
    
}
