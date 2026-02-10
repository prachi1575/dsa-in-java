import java.util.Scanner;
public class try_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try{
        int a =scanner.nextInt(); ;
        int b = scanner.nextInt(); ;
        int c = a / b; // This will throw an ArithmeticException
        System.out.println("Result: " + c);
    } catch (ArithmeticException e) {
        System.out.println("Caught an exception: " + e.getMessage());
    }
    }
    
}
