package Assignment18_Encapsulation;

final class ImmutablePerson {
    private final String name;
    private final int age;

    // Constructor to initialize name and age
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Immutable_Encapsulation {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Jane", 45);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // modifying name and age is not possible without setter
//         person.setName("John");
//         person.age = 50;
    }
}

