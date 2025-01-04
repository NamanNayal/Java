public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {20,40,50,60,70,80};
        int tar = 40;
        System.out.println(linearSrch(nums, tar));
        System.out.println(linearSrch2(nums, tar));
        System.out.println(linearSrch3(nums, tar));

    }

    static  int linearSrch(int[] arr,int target){

        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    static  int linearSrch2(int[] arr,int target){

        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element==target){
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    static  boolean linearSrch3(int[] arr,int target){

        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return true;
            }
        }

        return false;
    }
}
