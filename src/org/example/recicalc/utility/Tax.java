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
 * Utility Class to calculate tax applied to ingredients 
 * @author Preet
 */
public class Tax {
    /**
     * Take recipe and discount percent as arguments and calculate sales tax on total price excluding produce
     * @param recipe
     * @param discountPercent
     * @return 
     */
    public static BigDecimal calculateSalesTax(Recipe recipe,String discountPercent){
        //Hold total price of ingredients whoes type is not Produce 
        BigDecimal totalPriceWithoutProduce = BigDecimal.ZERO;
        ArrayList<Ingredient> recipeIngredients = recipe.getIngredients();
        for(Ingredient ingredient: recipeIngredients){
            if(!ingredient.getType().equals("Produce")){
              totalPriceWithoutProduce = totalPriceWithoutProduce.add(ingredient.getPrice());
            }
        }
        
        BigDecimal salesTax = totalPriceWithoutProduce.multiply(new BigDecimal(discountPercent).divide(new BigDecimal(100)));
        //Round up the result to nearest 7 cents and return
        return RoundBigDecimal.roundUpToNearestCents(salesTax, new BigDecimal("0.07"));
    }
}
