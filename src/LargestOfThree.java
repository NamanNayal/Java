import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Three Numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println("Greatest : "+ a);
        }else if(b>c){
            System.out.println("Greatest : "+ b);
        }else{
            System.out.println("Greatest : "+ c);
        }
    }
}
