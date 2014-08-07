/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example.recicalc.test;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.example.recicalc.model.Ingredient;
import org.example.recicalc.model.Recipe;
import org.example.recicalc.utility.Discount;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Preet
 */
public class DiscountTest {
    
    public DiscountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCalculateWellnessDiscount(){
    Recipe recipe = new Recipe("Test Recipe");
    //Make a list and initialize it with sample ingredients 
    ArrayList<Ingredient> ingredientList = new ArrayList<>(); 
    Ingredient i1 = new Ingredient("Produce","Garlic","Clove",new BigDecimal("0.67"));
    i1.setOrganic(true);
    Ingredient i2 = new Ingredient("Produce","Lemon","Piece",new BigDecimal("2.03"));
    Ingredient i3 = new Ingredient("Pantry","Olive Oil","Cup",new BigDecimal("0.87"));
    i3.setOrganic(true);
    Ingredient i4 = new Ingredient("Pantry","Salt","Teaspoon",new BigDecimal(".12"));
    Ingredient i5 = new Ingredient("Pantry","Peeper","Teaspoon",new BigDecimal(".085"));
    //add items to arraylist
    ingredientList.add(i1);
    ingredientList.add(i2);
    ingredientList.add(i3);
    ingredientList.add(i4);
    ingredientList.add(i5);
    //initialze recipe ingredient list
    recipe.setIngredients(ingredientList);
    NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
    String wellnessDiscount = n.format(Discount.calculateWellnessDiscount(recipe, "5").doubleValue());
    String expectedDiscount = n.format(new BigDecimal("0.08").doubleValue());
    
        assertEquals(wellnessDiscount, expectedDiscount);
    }
    
}
