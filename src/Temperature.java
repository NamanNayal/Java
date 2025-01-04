import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input temp in Cel to convert in Farh : ");
        float temp =  input.nextFloat();
        float toFar = ((temp * 9/5)+32);
        System.out.println("Temp in Farh : "+toFar);

    }
}
