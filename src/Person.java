/* Date: February 2, 2026//
       / * This program reads a family data file, builds a database of people and their relationships,
       // *  and prints a selected person’s maternal line, paternal line, children, and sibling information.
        */


import java.util.ArrayList;


public class Person {
    // Data member
    String name;
    Person mother;
    Person father;
    ArrayList<Person> children;

    //constructor Primary
    public Person(String name, String mother, String father, String children) {
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

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        // Create people
        Person henryVII = new Person("Henry VII", null, null);
        Person elizabethYork = new Person("Elizabeth of York", null, null);
        Person henryVIII = new Person("Henry VIII", elizabethYork, henryVII);
        Person mary = new Person("Mary I", null, henryVIII);
        Person elizabeth = new Person("Elizabeth I", null, henryVIII);
        Person edward = new Person("Edward VI", null, henryVIII);

        // Add children
        henryVIII.addChild(mary);
        henryVIII.addChild(elizabeth);
        henryVIII.addChild(edward);

        // Add to list
        people.add(henryVII);
        people.add(elizabethYork);
        people.add(henryVIII);
        people.add(mary);
        people.add(elizabeth);
        people.add(edward);

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Person's name? ");
        String searchName = input.nextLine();

        Person target = null;

        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(searchName)) {
                target = person;
                break;
            }
        }

        if (target != null) {

            System.out.println("Maternal line:");
            target.printMaternal();

            System.out.println("Paternal line:");
            target.printPaternal();

            System.out.println("Children:");
            target.printChildren();

            System.out.println("Number of Maternal Records: " + target.maternalRecords());
            System.out.println("Number of Paternal Records: " + target.paternalRecords());
            System.out.println("Number of Children: " + target.countChildren());

            System.out.println("Number of Siblings: " + target.countSiblings(people));

            System.out.println("Siblings:");
            ArrayList<String> siblings = target.listOfSiblings(people);
            for (String s : siblings) {
                System.out.println(s);
            }

        } else {
            System.out.println("Person not found.");
        }

        input.close();
    }
}


//How to create an object
//Person person1 = new Person();

