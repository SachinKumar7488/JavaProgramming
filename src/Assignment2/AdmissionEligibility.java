import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the marks obtained in Physics, Chemistry, and Mathematics
        System.out.print("Marks obtained in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Marks obtained in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Marks obtained in Mathematics: ");
        int math = scanner.nextInt();

        // Calculate total marks
        int totalMarks = physics + chemistry + math;
        int totalMathPhysics = math + physics;

        // Determine eligibility
        if (math >= 65) {
            if (physics >= 55) {
                if (chemistry >= 50) {
                    if (totalMarks >= 190 || totalMathPhysics >= 140) {
                        System.out.println("The candidate is eligible for admission.");
                    } else {
                        System.out.println("The candidate is not eligible for admission.");
                    }
                } else {
                    System.out.println("The candidate is not eligible for admission.");
                }
            } else {
                System.out.println("The candidate is not eligible for admission.");
            }
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }

        scanner.close();
    }
}

