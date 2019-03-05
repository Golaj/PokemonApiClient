package Client;

import model.Pokemon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import model.PokemonList;
import model.Pokis;

public class PokeDex {

    private String baseURL = "https://pokeapi.co/api/v2/pokemon/";
    
    private Client client = ClientBuilder.newClient();
    private WebTarget target = client.target(baseURL);

    public Pokemon getOnePokemon(String id) {
        return target.path(id).request().get(Pokemon.class);
    }
    public List<Pokis> getAllPokisOnFirstPage() {
        PokemonList allPs = target.request().get(PokemonList.class);
        return allPs.getResults();
    }
    
    public List<Pokis> getAllPokemonsOnOneSpecificPage(String number){
        String pageURL = "https://pokeapi.co/api/v2/pokemon?offset=" + number + "0&limit=20";
        PokemonList pokemons = client.target(pageURL).request().get(PokemonList.class);
        return pokemons.getResults();
    }

}
