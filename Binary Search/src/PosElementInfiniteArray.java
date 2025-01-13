public class PosElementInfiniteArray {
    public static void main(String[] args) {

        int[] arr ={ 3,5,12,34,123,234,455,556,765};
        int target = 123;
        System.out.println(ans(arr, target));

    }
    static int ans ( int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int temp = end+1;
            end = end + (end -start +1)*2;
            start =  temp;
        }
        return binarySrch(arr, target, start, end);
    }
    static int binarySrch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
