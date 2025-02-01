import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double weight;
        boolean answer;
        System.out.println("Enter your name: ");
        name = scanner.next();
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();
        System.out.print("Do you smoke? (YES/NO): ");
        answer = scanner.nextBoolean();
        System.out.println("The patient's information is as follows: " + name + age + weight + answer);
    }
}
