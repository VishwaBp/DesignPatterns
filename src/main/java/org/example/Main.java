package org.example;

import org.example.Builder.Database;

public class Main {
    public static void main(String[] args) {

        Database database = new Database.DatabaseBuilder()
                .host("localhost")
                .port("3306")
                .username("root")
                .password("root")
                .databaseName("test")
                .databaseType("mysql")
                .databaseVersion("8.0.23")
                .build();
        System.out.println(database.toString());
        System.out.println("Hello world!");
    }
}