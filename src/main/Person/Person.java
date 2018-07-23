package main.Person;

import java.util.Date;

public class Person {
    int id;
    String name;
    String gender;
    Date birthDate;
    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public void print(){
        System.out.println(this.id + ", " + this.name + ", " + this.gender);
    }
}
