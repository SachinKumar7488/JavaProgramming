package Assignment18_Encapsulation;

class Person {
    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class Basic_Encapsulation {
    public static void main(String[] args) {
        // new object of the person class
        Person person = new Person();

        // test 1 Set name to alice
        person.setName("Alice");
        System.out.println("\nTest 1:");
        System.out.println("Name: " + person.getName());

        // test 2 set age to 25
        person.setAge(25);
        System.out.println("\nTest 2:");
        System.out.println("Age: " + person.getAge());

    }
}

