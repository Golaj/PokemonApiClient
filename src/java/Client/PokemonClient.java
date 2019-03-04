package Client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class PokemonClient {

    public static void main(String[] args) {
 
    PokeDex pd = new PokeDex();

    Pokemon p = pd.getOnePokemon("1");

//    System.out.println (p.toString());
        System.out.println(pd.getAllPokis());

        
    }
    
}
