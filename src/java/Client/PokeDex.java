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
    public List<Pokis> getAllPokemons() {
        PokemonList allPs = target.request().get(PokemonList.class);
        String pageURL = "https://pokeapi.co/api/v2/pokemon?offset=0&limit=" + allPs.getCount();
        allPs = client.target(pageURL).request().get(PokemonList.class);
        return allPs.getResults();
    }
    
    public List<Pokis> getAllPokemonsOnOneSpecificPage(String number){
        String pageURL = "https://pokeapi.co/api/v2/pokemon?offset=" + number + "0&limit=20";
        PokemonList pokemons = client.target(pageURL).request().get(PokemonList.class);
        return pokemons.getResults();
    }
    
        public List<Pokemon> getAllPokemonOfSpecificType(String type) {
        List<Pokis> allPokis = getAllPokemons();
        List<Pokemon> allPokemon = new ArrayList<>();
        Pokemon p;
        for (Pokis poki : allPokis) {
            String type1;
            String type2 = "";
            p = client.target(poki.getUrl()).request().get(Pokemon.class);
            if (p.getTypes().size() > 1) {
                type1 = p.getTypes().get(0).getType().getName();
                type2 = p.getTypes().get(1).getType().getName();
            } else {
                type1 = p.getTypes().get(0).getType().getName();
            }
            if (type1.equalsIgnoreCase(type) || type2.equalsIgnoreCase(type)) {
                allPokemon.add(p);
            }
        }
        return allPokemon;
    }

}
