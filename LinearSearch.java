class LinearSearch {

    public static int linearSearch1(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k )
                return i;
        }
        return -1;

    }
     
    public static int linearSearch2(int[] arr, int k) {
        int l = 0;
        int r = arr.length -1;
        while(l <= r){
            if(arr[l] == k)
                return l;
            if(arr[r] == k)
                return r;
            l++; r--;
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {0, 20, 30, 3, 6, 2, 8, 4};
        System.out.println(linearSearch1(arr, 4));
        System.out.println(linearSearch2(arr, 9));
    }
}