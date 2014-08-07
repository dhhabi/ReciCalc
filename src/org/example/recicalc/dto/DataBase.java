/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example.recicalc.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.example.recicalc.model.Ingredient;

/**
 *  Database Represents a dto class which interact with database and perform required queries 
 * @author Preet
 */
public class DataBase {
    
    public ArrayList<Ingredient> getAvailableIngredients(){
        
        /*Dto classes intract with the database
        For Simplicity I am just hard coding the values and returning an arraylist
        */
       ArrayList<Ingredient> ingredientsDataBase = new ArrayList<>();
    //Produce
    ingredientsDataBase.add(new Ingredient("Produce","Garlic","Clove",new BigDecimal("0.67")));
    ingredientsDataBase.add(new Ingredient("Produce","Lemon","Piece",new BigDecimal("2.03")));
    ingredientsDataBase.add(new Ingredient("Produce","Corn","Cup",new BigDecimal("0.87")));
    //MeatPoultry
    ingredientsDataBase.add(new Ingredient("MeatPoultry","Chicken Breast","Piece",new BigDecimal("2.19")));
    ingredientsDataBase.add(new Ingredient("MeatPoultry","Bacon","Slice",new BigDecimal("0.24")));
    //Pantry
    ingredientsDataBase.add(new Ingredient("Pantry","Pasta","Ounce",new BigDecimal("0.31")));
    ingredientsDataBase.add(new Ingredient("Pantry","Olive Oil","Cup",new BigDecimal("1.92")));
    ingredientsDataBase.add(new Ingredient("Pantry","Vinegar","Cup",new BigDecimal("1.26")));
    ingredientsDataBase.add(new Ingredient("Pantry","Salt","Teaspoon",new BigDecimal("0.16")));
    ingredientsDataBase.add(new Ingredient("Pantry","Pepper","Teaspoon",new BigDecimal("0.17")));
    
        return ingredientsDataBase;
    }
    
}
