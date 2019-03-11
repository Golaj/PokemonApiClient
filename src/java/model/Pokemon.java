/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;


public class Pokemon {
    
    private int id;
    private String name;
    private List<PokemonType> types;

    public Pokemon() {
    }

    public Pokemon(int id, String name, List<PokemonType> types) {
        this.id = id;
        this.name = name;
        this.types = types;
    }

//    public Pokemon(int id, String name, PokemonType[] types) {
//        this.id = id;
//        this.name = name;
//        this.types = types;
//    }
//
//    public Object[] getTypes() {
//        return types;
//    }
//
//    public void setTypes(Object[] types) {
//        this.types = types;
//    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(List<PokemonType> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        String allTypes = "";
        for (int i = 0; i < types.size()-1; i++) {
            allTypes += types.get(i).getType().getName() + ", ";
        }
        allTypes = allTypes.concat(types.get(types.size()-1).getType().getName());
        return "--------------------------------------\n" //  38 
                + " Pokemon: \n"
                + " PokeDex id : " + id + "\n"
                + " Race : " + name + "\n"
                + " Types : " + allTypes ;
    }


    
    
    
}
