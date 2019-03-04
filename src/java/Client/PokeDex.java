package Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class PokeDex {

    private Client client = ClientBuilder.newClient();
    private WebTarget target = client.target("https://pokeapi.co/api/v2/pokemon/");

    public Pokemon getOnePokemon(String id) {
        return target.path(id).request().get(Pokemon.class);
    }
//    
//    public Pokemon getOnePokemonByName(String name){
//        return target.path(name).request().get(Pokemon.class);
//    }

    public List<Pokemon> getAllPokis() {

        List<Pokemon> allPs = Arrays.asList(target.request().get(Pokemon.class));
        return allPs;

    }

}
