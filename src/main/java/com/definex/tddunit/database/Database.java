package com.definex.tddunit.database;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String,String> registredUsers = new HashMap<>();

    public boolean login(Credentials credentials){
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        return registredUsers.keySet().contains(username) && registredUsers.get(username).equals(password);
    }
}
