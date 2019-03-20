package menus;

import Client.PokeDex;
import java.util.List;
import java.util.Scanner;
import model.Pokemon;

public class mainMenu {

    Scanner sc = new Scanner(System.in);
    Pokemon pokemon = new Pokemon();
    boolean run = true;
    PokeDex pd = new PokeDex();
    boolean loop;
    String userInput;

    public void firstMenu() {
        while (run) {
            System.out.println("Hi and welcome to the pokeDex!\n"
                    + "what would you like to do? \n"
                    + "[1] Search for a specific pokémon by name or ID.\n"
                    + "[2] List all pokémon by page they appear in the pokéDex (20 pokemons per page).\n"
                    + "[3] List all pokémon of specific type in a requested generation.\n"
                    + "[0] To exit.");

            switch (userInput = sc.nextLine()) {

                case "1":
                    loop = false;
                    while (!loop) {
                        System.out.println("Please write the name or ID of the pokémon you are looking for : ");
                        try {
                            System.out.println(pd.getOnePokemon(sc.nextLine()));
                            loop = true;
                        } catch (Exception e) {
                            loop = false;
                            System.out.println("Sorry, something went wrong, perhaps that ID does not exist.\n"
                                    + "Please try again.");
                        }
                    }
                    break;

                case "2":
                    loop = false;
                    while (!loop) {
                        System.out.println("Please list the page number you want.");
                        userInput = sc.nextLine();
                        try {
                            int num = validateNumberInString(userInput);
                            System.out.println(pd.getAllPokemonsOnOneSpecificPage(userInput));
                            loop = true;
                            if (num < 0) {
                                loop = false;
                            }
                        } catch (Exception e) {
                            System.out.println("Sorry, there was no page with " + userInput + " as index.");
                            loop = !true;
                        }
                    }
                    break;

                case "3":
                    String generationInput = "";
                    loop = false;
                    while (!loop) {
                        try {
                            System.out.println("Please enter the generation you want to search in (1-7)");
                            generationInput = sc.nextLine();
                            int num = validateNumberInString(generationInput);
                            if (num < 0 || num > 7) {
                                loop = false;
                            }
                            loop = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Sorry, invalid generation. Try again.");
                            loop = false;
                        }
                    }
                    loop = false;
                    while (!loop) {
                        try {
                            System.out.println("Please enter what type you want to list, for example fire or grass");
                            userInput = sc.nextLine();
                            List<Pokemon> allPokemonOfSpecificTypeInGenerationOne = pd.getAllPokemonOfSpecificTypeInSpecificGeneration(generationInput, userInput);
                            if(allPokemonOfSpecificTypeInGenerationOne.isEmpty()) {
                                throw new Exception();
                            }
                            System.out.println(allPokemonOfSpecificTypeInGenerationOne);
                        } catch (Exception e) {
                            System.out.println("Sorry, invalid input, try again.");
                            loop = false;
                        }
                        break;
                    }
                case "0":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Sorry, wrong choice. Please try again.");

            }
        }
    }

    private int validateNumberInString(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }

}
