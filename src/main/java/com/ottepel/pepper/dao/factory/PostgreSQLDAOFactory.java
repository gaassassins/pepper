package com.ottepel.pepper.dao.factory;

import com.ottepel.pepper.dao.DAOFactory;
import com.ottepel.pepper.dao.contract.*;

/**
 * Created by Alexandr on 17.03.2017.
 */
public class PostgreSQLDAOFactory extends DAOFactory{

    @Override
    public CategoryDAO getCategoryDAO() {
        return null;
    }

    @Override
    public IngredientDAO getIngredientDAO() {
        return null;
    }

    @Override
    public RecipeDAO getRecipeDAO() {
        return null;
    }

    @Override
    public StepDAO getStepDAO() {
        return null;
    }

    @Override
    public UserDAO getUserDAO() {
        return null;
    }
}
