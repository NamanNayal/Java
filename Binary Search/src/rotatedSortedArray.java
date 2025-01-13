public class rotatedSortedArray {
    //this wont work in duplicate values
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,0,1,2,3};
        int target = 6;
        int piv = search(arr,target);
        System.out.println(piv);

    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot==-1){
            binarySearch(arr, target, 0, arr.length-1);
            //means the arr has not been rotated
        }
        if(arr[pivot] == target){
            return pivot;
        }

        if(target>=arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr,target, pivot+1, arr.length-1);

    }
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
            if(mid>start && arr[mid-1]>mid){
                //to check if mid is not smaller than index of start
                return mid;
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
    static int binarySearch(int arr[], int target, int start, int end){

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

