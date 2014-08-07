/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example.recicalc.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import org.example.recicalc.model.Ingredient;
import org.example.recicalc.model.Recipe;

/**
 * Utility Class to calculate discounts on given recipe 
 * @author Preet
 */
public class Discount {
    /**
     * Calculate wellness discount for a given recipe and return a BigDecimal
     * @param recipe
     * @param discountPercent
     * @return 
     */
    public static BigDecimal calculateWellnessDiscount(Recipe recipe,String discountPercent){
        //Total price for organic ingredients present in recipe
        BigDecimal totalOrganicIngredientPrice = BigDecimal.ZERO;
        ArrayList<Ingredient> recipeIngredients = recipe.getIngredients();
        for(Ingredient ingredient: recipeIngredients){
            if(ingredient.isOrganic()){
               totalOrganicIngredientPrice = totalOrganicIngredientPrice.add(ingredient.getPrice());
            }
        }
        BigDecimal wellnessDiscount = totalOrganicIngredientPrice.multiply(new BigDecimal(discountPercent).divide(new BigDecimal(100)));
       //Roundup the result to nearest cent and return
        return RoundBigDecimal.roundUpToNearestCents(wellnessDiscount, new BigDecimal("0.01"));
    }
    
}
