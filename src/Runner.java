import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner input = new Scanner(System.in);
        String choice = "yes";
        input.nextLine();

        if (choice.equals("yes"))
            System.out.println("It works");

    }
}