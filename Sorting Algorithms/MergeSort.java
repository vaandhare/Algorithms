class MergeSort {
	
	static void sort(int[] arr, int l, int r) {
		if(l < r) {
			int m = (l + r)/2;

			sort(arr, l, m);
			sort(arr, m+1, r);

			merge(arr, l, m, r);
		}
	}

	static void merge(int[] arr, int l, int m, int r) {
		int i = 0, j = 0, k = l;

		int n1 = m - l + 1;
		int n2 = r - m;

		int[] LeftArr = new int[n1];
		int[] RightArr = new int[n2];
		
		for (int a = 0; a < n1; ++a) 
			LeftArr[a] = arr[l + a]; 

		for (int b = 0; b < n2; ++b) 
			RightArr[b] = arr[m + 1 + b]; 

		while(i < n1 && j < n2) {
			if(LeftArr[i] <= RightArr[j])
				arr[k++] = LeftArr[i++];
			else
				arr[k++] = RightArr[j++];
		}

		while(i < n1)
			arr[k++] = LeftArr[i++];

		while( j < n2)
			arr[k++] = RightArr[j++];

	}
	
	public static void main(String args[]) {
		int arr[] = {38, 27, 43, 3, 9, 82, 12};

		sort(arr, 0, arr.length - 1);

		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
