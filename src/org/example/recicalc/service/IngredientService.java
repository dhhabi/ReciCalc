/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example.recicalc.service;

import java.util.ArrayList;
import org.example.recicalc.dto.DataBase;
import org.example.recicalc.model.Ingredient;

/*
    Service classes can use several dto objectss and perform business logic in real life applications 
    This application service class simply use DataBase dto object and performe a service to return available 
    ingredients in database
*/

/**
 * Service class to serve the ingredients related service
 * 
 * @author Preet
 */
public class IngredientService {
    /*dto object to perform database queries 
    In Spring usually its injected by Spring dependency Injection */
    private DataBase dataBase = new DataBase();
    
    /**
     * fetch available ingredients from database using dto object and return a list of them
     * @return 
     */
    public ArrayList<Ingredient> getAvailableIngredient(){
        return dataBase.getAvailableIngredients();
    }
    
    public DataBase getDataBase() {
        return dataBase;
    }

   
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    
}
