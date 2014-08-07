/*
 * To change this license header
 */

package org.example.recicalc.model;

import java.util.ArrayList;

/**
 * Represents recipe and it's ingredients 
 * @author Preet
 */
public class Recipe {
    private String recipeName;
    private ArrayList ingredients;
    /**
     * Default Constructor
     */
    public Recipe(){
    
    }
    
    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public ArrayList getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList ingredients) {
        this.ingredients = ingredients;
    }

}
