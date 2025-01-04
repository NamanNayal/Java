import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {20,30,21,2123,44,123,443,21};
        int target = 44;
        int start = 3;
        int end = 6;
        System.out.println(SearchRange(arr,target,start,end));
        System.out.println(SearchRange2(arr,target,start,end));

    }

    static boolean SearchRange(int[] arr, int target, int start, int end ){
        if(arr.length==0){
            return false;

        }
        for(int i = start ; i<end; i++ ){
            if(arr[i] == target) {
                return true;
            }
        }
        return  false;
    }
    static boolean SearchRange2(int[] arr, int target, int start, int end ){

        for(int val : arr){
            if(val == target) {
                return true;
            }
        }
        return  false;
    }
}
