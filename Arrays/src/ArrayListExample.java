import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<5; i++){
            list.add(in.nextInt());
        }

        for(int i =0; i<5; i++){
            System.out.println(list.get(i));
        }

        //we cant pass primitive but wrapper classes

    }
}
