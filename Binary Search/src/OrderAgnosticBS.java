public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {-11219,-3,-1,0,1,999,10010};
        int[] arr1 ={10010,999,1,0,-1,-919,-101120};
        int target = 999;
        int ans = orderOfAgnostic(arr,target);
        int ans1 = orderOfAgnostic(arr1,target);
        System.out.println(ans);
        System.out.println(ans1);

    }

    static int orderOfAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        Boolean isAsc = arr[start]<arr[end];

        while(start<= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid + 1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;

    }
}
