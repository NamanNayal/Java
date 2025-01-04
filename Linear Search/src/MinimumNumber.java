public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {222,332,1223,12,313,21, 321, 10, 12};
        System.out.println(MinNum(arr));
    }
    static int MinNum(int[] arr){

        if(arr.length == 0){
            return -1;
        }
        int target = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(arr[i]<target){
                target = arr[i];
            }
        }
        return target;
    }
}
