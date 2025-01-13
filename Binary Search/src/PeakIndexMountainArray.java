public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12,212,31,30,22,13,4,0};
        System.out.println(peakIndexMountain(arr));

    }
    static int peakIndexMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                //u are in decreasing part of the array
                //this may be the ans but look at left now
                end = mid;
            }else{
                //u are in increasing part of the array
                //mid+1 can be the ans but look for right now
                start = mid+1;
            }
            //in the end, start== end and are pointing to the largest number because of two check
            //start and end always looking for the max element in the above two checks
            //hence when they are pointing to just one element that is the max one
            //at every point of time for the start and end, they have the best possible ans till that time
            // and if we are saying only one item remaining hence that will be our max element


        }
        return start; //or return end as both are equal
    }
}
