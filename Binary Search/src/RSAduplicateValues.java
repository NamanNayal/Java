public class RSAduplicateValues {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,9,0,1,2,3};
        int target = 2;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target){
        int pivot = findPivotWithDuplicate(arr);
        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(arr[0]>=target){
            return binarySearch(arr,target,pivot+1, arr.length-1);
        }else {
            return binarySearch(arr,target,0,pivot-1);
        }

    }


    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid;
            }
            //if elements at middle,start and end ae euqal then just skip the duplicates
            //NOTE: what if any element in start and end is pivot
            if (arr[start] > arr[start + 1]) {
                return start;
            }
            if (arr[end - 1] > arr[end]) {
                return end - 1;
            }
            //left side is sorted, so pivot should be in right
            else if (arr[mid] > arr[start] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }return -1;
         
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(end>=start){
            int  mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }return -1;
    }

}
