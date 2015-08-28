
import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallan
 */
public class Ferramentas {
    public static URL getCodeBase() throws MalformedURLException{
        return new URL(System.getProperty("user.dir"));
    }
}


