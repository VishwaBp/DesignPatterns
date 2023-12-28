package org.example.Singleton;
// Singleton class  implementation using lazy initialization
public class Database1 {
    private static Database1 instance = null; // static variable
    private Database1(){
        // private constructor
    }
    public static Database1 getInstance(){
        if(instance == null){                  // lazy initialization
            instance = new Database1();
        }
        return new Database1();
    }
}
