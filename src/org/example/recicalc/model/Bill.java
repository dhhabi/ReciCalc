
package org.example.recicalc.model;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * This class Represents Complete customer bill
 * @author Preet
 */
public class Bill {
    private ArrayList recipeList;
    private BigDecimal totalPrice;

    public ArrayList getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(ArrayList recipeList) {
        this.recipeList = recipeList;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
