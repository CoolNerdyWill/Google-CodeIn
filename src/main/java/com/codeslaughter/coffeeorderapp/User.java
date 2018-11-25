package com.codeslaughter.coffeeorderapp;

public class User {
    public String Name;
    public static coffee[] coffees = new coffee[] {new coffee("americano",2),new coffee("expresso",1),new coffee("latte",3),new coffee("tea",2),new coffee("hot chocolate",2)};

    public User(String name){
        Name = name;
    }
}
