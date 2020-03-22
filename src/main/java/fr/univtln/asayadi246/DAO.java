package fr.univtln.asayadi246;

import java.sql.*;
import java.util.*;

public class DAO {
    private String url = "jdbc:mysql://mysql-server2:3306/sakila";
    private String user = "test";
    private String pwd = "1234";
    public List<Actor> getAll() {
        List<Actor> actors = new ArrayList<>();
        try {
            Connection connection = DriverManager.getConnection(url, user, pwd);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from actor");
            while (rs.next()) {
                int actor_id = rs.getInt("actor_id");
                String first_name= rs.getString("first_name");
                String last_name  = rs.getString("last_name");
                actors.add(new Actor(actor_id , first_name, last_name));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actors;
    }

}
