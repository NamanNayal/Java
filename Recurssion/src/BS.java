public class BS {
    public static void main(String[] args) {
        int[] arr = {2,45,46,65,432};
        System.out.println(search(arr,65,0, arr.length-1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return search(arr,target,s,m-1);
        }return  search(arr, target, m+1, e);
    }
}
