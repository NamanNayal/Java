public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0,1,2,3,4};
        int[] arr1 = {8,8,8,9,10,0,1,2,3,4};
        System.out.println(findPivot(arr));
        System.out.println(findPivotWithDuplicate(arr1));

    }

    static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int countRotationsDuplicate(int[] arr){
        int pivot = findPivotWithDuplicate(arr);
        return pivot + 1;
    }



    //use for non duplicates
    static int findPivot(int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                // to avoid array out of bound we check if end index is bigger than mid index
                return mid;
                //3,4,5,6,7,1,2,3
                //we know array is in ascending order,
                //array will go in descending order only for p=7 and p+1=1;
                //when land p = 7 as mid this condition will hold true
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                //to check if mid is not smaller than index of start
                return mid-1;
                //if we land on p+1= 1 as mid then this condition will hold true
            }
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    //use this for duplicates
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
            //if elements at middle,start and end ae equal then just skip the duplicates
            //NOTE: what if any element in start and end is pivot
            if(arr[mid]== arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end - 1] > arr[end]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[mid] > arr[start] || arr[mid] == arr[start] && arr[mid] > arr[end]) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }

        }return -1;

    }
}
