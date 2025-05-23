import java.util.Scanner;

public class InputExample {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("your name is "+ name);
        scanner.close();
    }
}