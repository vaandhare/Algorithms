/*
 * sorted array by repeatedly dividing the search interval in half.
 * Time complexity is O(log n)
 * 
 * Array must be sorted as we check the middle element and ignore the half of the array 
 * 
 * STEPS:
 * 1. Begin with the mid element of the whole array as a search key.
 * 2. If the value of the search key is equal to the item then return an index of the search key.
 * 3. if the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 * 4. Otherwise, narrow it to the upper half.
 * 5. Repeatedly check from the second point until the value is found or the interval is empty.
 */




public class BinarySearch {

    public static int binarySearchIterative(int[] arr, int k){
        int l =0, r = arr.length-1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(arr[m] == k) return m;
            if(arr[m] < k ) l=m+1;
            else r=m-1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int l, int r, int k){
        while(l <= r ){
            int m = l+(r - l)/2;
            if(arr[m] == k) return m;
            if(arr[m] > k) return binarySearchRecursive(arr, l, m-1, k);
            return binarySearchRecursive(arr, m+1, r, k);
        }
        return -1;
    }


    public static void main(String args[]) {
         int[] arr = {5, 7, 9, 12, 18, 29, 43, 49};
        System.out.println(binarySearchRecursive(arr, 0, arr.length -1,  49));
        System.out.println(binarySearchIterative(arr, 29));
    }  
}
