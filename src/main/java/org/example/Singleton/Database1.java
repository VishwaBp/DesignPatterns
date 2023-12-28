package org.example.Singleton;

public class Database {
    private static Database instance = null;
    private Database(){
        // private constructor
    }
    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return new Database();
    }
}
