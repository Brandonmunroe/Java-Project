/* Project: Lab 1
 * Class: Person.java
 * Author: Brandon Munroe
 * Date: February 2, 2026
 * This program reads a family data file, builds a database of people and their relationships,
 *  and prints a selected person’s maternal line, paternal line, children, and sibling information.
 */


import java.util.ArrayList;

public class Person {
    // Data member
    String name;
    Person mother;
    Person father;
    ArrayList<Person> children;

    //constructor Primary
    public Person(String name) {
        this.name = name;
        this.mother = null;
        this.father = null;
        this.children = new ArrayList<>();


    }

    //Overloading constructor
    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();

    }

    // Accessor methods (getters) You get something in programming. If you return something, its getters
    public String getName() {
        return name;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    // Mutator methods (setters) require parameter
    public void setName(String name) {
        this.name = name;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

    // Count number of maternal records (self + maternal ancestors)
    public int maternalRecords() {
        if (mother == null) {
            //only self
            return 1;
        }

        return 1 + mother.maternalRecords();
    }
//Pt B
    // Count number of paternal records (self + paternal ancestors)
    public int paternalRecords() {
        if (father == null) {
            //only self
            return 1;
        }
        return 1 + father.paternalRecords();
    }

    // Count number of children
    public int countChildren() {
        return children.size();
    }
    //counting the number of siblings
    public int countSiblings(ArrayList<Person> allPersons) {
        int counter = 0; //make the counter 0. Looping through to grab each person in the array and checking if it is equal to a person. This will represent a person. Continue means to keep going. Break means exit the loop
        for (int i = 0; i < allPersons.size(); i++) {
            if (allPersons.get(i) == this) continue;
            if (allPersons.get(i).getMother() == this.mother && allPersons.get(i).getFather() == this.father){
                counter++;
            }

        }

        return counter;

    }
    //listing the siblings
    public ArrayList<String> listOfSiblings(ArrayList<Person> allPersons){
        ArrayList<String> siblingsNames = new ArrayList<>();
        for(int i = 0; i < allPersons.size(); i++){
            if (allPersons.get(i) == this) continue;
            if (allPersons.get(i).getMother() == this.mother && allPersons.get(i).getFather() == this.father){
                siblingsNames.add(allPersons.get(i).getName());
            }
        }
        return siblingsNames;

    }
    public void printMaternal() {
        System.out.println(name);
        if (mother != null){
            mother.printMaternal();
        }
    }
    public void printPaternal(){
        System.out.println(name);
        if (father != null){
            father.printPaternal();
        }
    }
    public void printChildren(){
        for (int i = 0; i < children.size(); i++){
            System.out.println(children.get(i).getName());

        }
    }


}


//How to create an object
//Person person1 = new Person();
