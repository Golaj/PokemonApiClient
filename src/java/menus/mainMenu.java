package menus;

import Client.PokeDex;
import java.util.Scanner;
import model.Pokemon;

public class mainMenu {

    Scanner sc = new Scanner(System.in);
    Pokemon pokemon = new Pokemon();
    boolean run = true;
    PokeDex pd = new PokeDex();
    boolean exists;
    String userInput;

    public void firstMenu() {
        while (run) {
            System.out.println("Hi and welcome to the pokeDex!\n"
                    + "what would you like to do? \n"
                    + "[1] Search for a specific pokémon by name or ID.\n"
                    + "[2] List all pokémon by page they appear in the pokéDex.\n"
                    + "[0] To exit.");
                            
            switch (userInput = sc.nextLine()) {

                case "1":
                    exists = false;
                    while (!exists) {
                        System.out.println("Please write the name or ID of the pokémon you are looking for : ");
                        try {
                            System.out.println(pd.getOnePokemon(sc.nextLine()));
                            exists = true;
                        } catch (Exception e) {
                            exists = false;
                            System.out.println("Sorry, something went wrong, perhaps that ID does not exist.\n"
                                    + "Please try again.");
                        }
                    }
                    break;

                case "2":
                    exists = false;
                    while (!exists) {
                        System.out.println("Please list the page number you want.");
                        userInput = sc.nextLine();
                        try {
                            Integer.parseInt(userInput);
                            System.out.println(pd.getAllPokemonsOnOneSpecificPage(userInput));
                            exists = true;
                        } catch (Exception e) {
                            System.out.println("Sorry, there was no page with " + userInput + " as index.");
                            exists = !true;
                        }
                    }
                    break;
                case "0":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Sorry, wrong choice. Please try again.");

            }
        }
    }

}
