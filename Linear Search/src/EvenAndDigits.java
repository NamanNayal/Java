public class EvenAndDigits {
    public static void main(String[] args) {

        int[] arr = {12,123,1223,31,64,23,1};
        System.out.print(findNumbers(arr));

    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num: arr){
            if(even(num)) {
                count++;
            }
        }return count;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static int digits2(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
    static int digits(int num){
        if(num == 0){
            return 1;
        }
        if(num < 0 ){
            num =  num*-1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
