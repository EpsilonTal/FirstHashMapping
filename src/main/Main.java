package main;

import main.Person.Person;

import java.util.HashMap;

class Main {
    public static void main (String args[]) {
        HashMap<String, Person> firstHashMap = new HashMap<String, Person>();
        Person Tal = new Person(0,"Tal", "Male");
        Person Shay = new Person(1,"Shay", "Female");
        firstHashMap.put("Tal", Tal);
        firstHashMap.put("Shay", Shay);
        firstHashMap.get("Tal").print();
        firstHashMap.get("Shay").print();

        System.out.println(firstHashMap.containsValue(Tal));
        System.out.println(firstHashMap.containsKey("Tal"));

        firstHashMap.remove("Tal");

        System.out.println(firstHashMap.containsValue(Tal));
        System.out.println(firstHashMap.containsKey("Tal"));

        firstHashMap.put("Tal", Tal);

        for(String i : firstHashMap.keySet()) {
            System.out.println(i);
        }
    }
}
