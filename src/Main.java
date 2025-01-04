import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // public: can be accessed from anywhere, static, void is function type which does not return anything,

        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.next());
        System.out.println(input.nextLine());
    }
}
