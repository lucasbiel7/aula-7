package com.aula7.core7.core;

public class Test{

    public static void main(String... args) {
        printNames("Lucas");
        printNames("Flávio", "André");
        printNames("Antony", "Larissa", "Leticia");
        printNames(new String[]{"Antony", "Larissa", "Leticia"});
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printNames(String name1, String name2){
        printName(name1);
        printName(name2);
    }

    public static void printNames(String name1, String name2, String name3){
        printNames(name1,name2);
        printName(name3);
    }

    @SafeVarargs
    public static void printNames(String... names){
        for (String name: names){
            System.out.println(name);
        }
    }
}