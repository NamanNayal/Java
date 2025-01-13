public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,8,10};
        int m = 2;
        System.out.println(splitArray(arr,m) );

    }
    static int  splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for(int i = 0 ; i<arr.length; i++){
            start = Math.max(start, arr[i]);
            //in the end it will return the max element from the array/
            end = arr[i] +end;
        }
        //binary search
        while(start<end){
            //try for the middle as the potential ans
            int mid = start+(end-start)/2;
            //calculate how many pieces u can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum + num > mid){
                    //u cannot add this in this subarray, make new one
                    //say u add this num in new subarray, then sum = num

                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }if (pieces>m){
                start = mid+1;
            }else{
                end =  mid;
            }

        }
        return end; // here start ==  end
    }
}
