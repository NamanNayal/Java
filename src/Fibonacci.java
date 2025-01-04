import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while(count<=n){
            int temp = p;
            p = p+i;
            i = temp;
            count++;
        }

            System.out.println("nth fibonacci : " + p);

    }
}
