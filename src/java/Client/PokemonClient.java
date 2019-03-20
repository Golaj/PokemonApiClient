package Client;

import java.util.Scanner;
import model.Pokemon;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import menus.mainMenu;

public class PokemonClient {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu m = new mainMenu();
        PokeDex pd = new PokeDex();
        
        
       m.firstMenu();
        
        
        
      // System.out.println(pd.getOnePokemon("58"));
     //  System.out.println(pd.getAllPokisOnFirstPage());
    // System.out.println(pd.getAllPokemonsOnOneSpecificPage("4"));
        
    }
    
}
