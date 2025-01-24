package Assignment18_Encapsulation;

class Person2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    // method to calculate retirement year
    public int calculateRetirementYear(int currentYear) {
        int retirementAge = 65;
        int yearsLeft = retirementAge - age;
        return currentYear + yearsLeft;
    }
}
public class Retirement_Calculation {
    public static void main(String[] args) {
        Person2 person = new Person2();

        person.setAge(30);

        int currentYear = 2023;

        //display retirement year
        int retirementYear = person.calculateRetirementYear(currentYear);
        System.out.println("current age: " + person.getAge());
        System.out.println("current year: " + currentYear);
        System.out.println("retirement year: " + retirementYear);
    }
}

