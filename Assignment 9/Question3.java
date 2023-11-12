import java.util.Scanner;
public class Question3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the vehicle manufacturer:");
        String manufacturer = input.nextLine();
        System.out.println("Enter the name of the vehicle owner:");
        String name = input.nextLine();
        System.out.println("Enter the owner's gender:");
        String gender = input.nextLine();
        System.out.println("Enter the owner's programme of study:");
        String programme = input.nextLine();
        System.out.println("Enter the owner's Institution name:");
        String institution = input.nextLine();
        System.out.println("Enter the owner's hobbies:");
        String hobbies = input.nextLine();
        System.out.println("Enter the owner's age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter the number of cylinders in the engine:");
        int cylinders = input.nextInt();
        input.nextLine();
        System.out.println("Enter the car seating capacity:");
        int seats = input.nextInt();
        input.nextLine();
        System.out.println("Enter the weight of the car:");
        double weight = (double) input.nextInt();
        input.nextLine();

        Car c = new Car(cylinders, manufacturer, new Student(name, age, gender, institution, programme, 3, hobbies), seats, weight);
        System.out.println(c.toString());
        

    
    }
}