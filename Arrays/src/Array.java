import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];


        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

//        for(int row=0; row<arr.length; row++){
////            for(int col = 0; col<arr[row].length; col++){
////                System.out.print(arr[row][col]);
////            }
////            System.out.println();
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
