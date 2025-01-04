import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
        for(int i=1; i<=1000; i++)
        {
            if(isArmstrong(i)){
                System.out.print(i+", ");
            }
        }


    }

    static boolean isArmstrong(int n){
        int sum = 0;
        int org = n;
        while(n>0) {
            int rem = n % 10;
            int temp = rem * rem * rem;
            sum = sum + temp;
            n = n / 10;
        }
        return sum == org;
    }


}
