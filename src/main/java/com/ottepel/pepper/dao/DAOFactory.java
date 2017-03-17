package com.ottepel.pepper.dao;

import com.ottepel.pepper.dao.contract.*;
import com.ottepel.pepper.dao.factory.PostgreSQLDAOFactory;
import com.ottepel.pepper.model.Ingredient;
import com.ottepel.pepper.util.Database;

/**
 * Created by Alexandr on 17.03.2017.
 */
public abstract class DAOFactory {
    public abstract CategoryDAO getCategoryDAO();
    public abstract IngredientDAO getIngredientDAO();
    public abstract RecipeDAO getRecipeDAO();
    public abstract StepDAO getStepDAO();
    public abstract UserDAO getUserDAO();

    public static DAOFactory getFactory(Database type) {
        switch (type) {
            case POSTGRESQL:
                return new PostgreSQLDAOFactory();
            default:
                return null;
        }
    }
}
