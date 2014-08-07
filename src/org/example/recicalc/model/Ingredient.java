/*
 * To change this license header
 */

package org.example.recicalc.model;

import java.math.BigDecimal;


/**
 * Represents a single Ingredient of a Recipe 
 * @author Preet
 */

public class Ingredient {
    private static final Double DEFAULTDQUANTITY = 1.0;
    private String ingredientName;
    private Double quantity;
    private String type;
    private BigDecimal price;
    private boolean organic;
    private String measuringUnit;
    
    /**
     * Default constructor 
     * set default quantity and price to 1
     */
    public Ingredient(){
        this.quantity = DEFAULTDQUANTITY;
        this.price = new BigDecimal(1.0);
    }
    /*
        I have used this constructor for simplicity and to add ingredients to temporary database used 
        for selection of ingredients. In real applicaitons a model should represents a sekelton of real time entity 
    */
    public Ingredient(String type,String ingredientName,String measuringUnit, BigDecimal price){
        this.type = type;
        this.ingredientName = ingredientName;
        this.measuringUnit = measuringUnit;
        this.price = price;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public Double getQuantity() {
        return quantity;
    }

    /**
     * Set specified quantity
     * @param quantity 
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(String measuringUnit) {
        this.measuringUnit = measuringUnit;
    }
    
    
}
