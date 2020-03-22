package fr.univtln.asayadi246;

import java.util.ArrayList;
import java.util.List;

public class Model {
    DAO acteurDAO;

    public Model() {
        acteurDAO = new DAO();
    }
    public List<Actor> getAllActors(){
        return acteurDAO.getAll();
    }

}
