package Assignment18_Encapsulation;

class Person1 {
    private String name;
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("name cannot be null or empty ");
        }
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            System.out.println("age must be in positive. ");
        }
    }
}

public class Data_Validation_Setter {
    public static void main(String[] args) {
        // new object of the person class
        Person1 person = new Person1();

        // test 1 Set name to alice
        person.setName("");
        System.out.println("\nTest 1:");
        System.out.println("Name: " + person.getName());

        // test 2 set age to 25
        person.setAge(-5);
        System.out.println("\nTest 2:");
        System.out.println("Age: " + person.getAge());

        // set to age in negative number
        person.setAge(-5);

    }
}


