package org.example.Singleton;

//Thread safe implementation of Singleton class Double checked locking principle
public class Database2 {
    private static Database2 instance = null; // static variable
    private Database2(){
        // private constructor
    }
    public static Database2 getInstance(){
        if(instance == null) {                  // lazy initialization
            synchronized (Database2.class) {// thread safe
                if (instance == null) {                  // lazy initialization
                    instance = new Database2();
                }
            }
        }
        return new Database2();
    }
}
