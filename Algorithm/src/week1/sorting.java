package week1;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		int arr[]= {0,2,3,1,4,5,7,6,8,9};
		System.out.println("the original array is:");
		printArray(arr);
		//using different sorting
		System.out.println();
		System.out.println("array after sort:");
		
		
		/*//bubble sort:
		BubbleSort(arr);
		*/
		
		/*//selection sort
		SelectionSort(arr);
		*/
		
		/*//Merge sort
		System.out.println("This is Merge Sort!");
		MergeSort(arr,0,arr.length-1);
		*/
		
		/*//Quick sort
		System.out.println("This is Quick Sort!");
		QuickSort(arr,0,arr.length-1);
		*/
		
		/*//CountSort
		System.out.println("This is CountSort!");
		CountSort(arr);
		*/
		
		//RadixSort
		System.out.println("This is RadixSort!");
		RadixSort(arr,arr.length);
		
		
		
		/*//pancake sort
		System.out.println("This is Pancake Sort!");
		PancakeSort(arr);
		*/
	     printArray(arr);		
}

	
	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void BubbleSort(int arr[]) {
		int n=arr.length;
		System.out.println("This is BubbleSort!");
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {               
				if(arr[j+1]<arr[j]) swap(arr, arr[j+1],arr[j]); 
			}
		}
	}
			
	public static void swap(int arr[],int i, int j) {
		// TODO Auto-generated method stub
		int t=0;
		t=arr[j];
		arr[j]=arr[i];
		arr[i]=t;
	}

	public static void SelectionSort(int arr[]) { 
		int n=arr.length;
		int MinIndex=0;
		System.out.println("This is SelectionSort!");
		for(int i=0;i<n-1;i++) {
			MinIndex=i;
			for(int j=i+1;j<n-i;j++) {
				if(arr[j]<arr[MinIndex]) MinIndex=j;
			}
			if(MinIndex!=i) swap(arr,i,MinIndex);
		}
	}

	
	public static void MergeSort(int arr[],int low,int high) {
		if (low==high) return;
		else {
			int mid=(low+high)/2;
			MergeSort(arr,low,mid);
			MergeSort(arr,mid+1,high);
			Merge(arr,low,high);
		}		
	}
	
	public static void Merge(int arr[],int low,int high) {
	     int mid = (low + high)/2;
         int[] temp = new int[high -low +1];

         int i = low;
         int j = mid +1;
         int curr = 0;

         while(i <= mid && j <=high){
             if(arr[i] < arr[j]){
                 temp[curr] = arr[i];
                 i++;
             }else{
                 temp[curr] = arr[j];
                 j++;
             }
             curr ++;
         }
         // Copy over remaining
         while(i<=mid){
             temp[curr++] = arr[i++];
         }

         while(j<=high){
             temp[curr++] = arr[j++];
         }
         
         // Copy temp arr into original
         i = low;
         for(int k = 0; k < temp.length; k ++){
             arr[i] = temp[k];
             i++;
         } 
	}

	
    public static void QuickSort(int[] arr, int low, int high){

        if(low < high){

            int wall = Partition(arr, low, high);
            QuickSort(arr, low, wall-1);
            QuickSort(arr, wall+1, high);
        }
    }

    public static int Partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int wall = low - 1;

        for(int i = low; i < high ; i ++){

            if(arr[i] <= pivot){
                wall ++;
                swap(arr, i, wall);
            }
        }

        swap(arr, high, wall+1);
        return wall +1;
    }


    static int RANGE=10;
	public static void CountSort(int[] arr) {
		
        int[] count = new int[RANGE];

        for(int i = 0 ; i < arr.length ; i ++) count[arr[i]] ++;
        int index = 0;
        for(int i = 0 ; i < RANGE ; i ++){
            while(count[i] >0){

                arr[index]= i;
                index ++;
                count[i]--;
            }
        }
	}
	
	  static int getMax(int arr[], int n)
	    {
	        int mx = arr[0];
	        for (int i = 1; i < n; i++)
	            if (arr[i] > mx)
	                mx = arr[i];
	        return mx;
	    }
	 
	    // A function to do counting sort of arr[] according to
	    // the digit represented by exp.
	    static void countsort(int arr[], int n, int exp)
	    {
	        int output[] = new int[n]; // output array
	        int i;
	        int count[] = new int[10];
	        Arrays.fill(count,0);
	 
	        // Store count of occurrences in count[]
	        for (i = 0; i < n; i++)
	            count[ (arr[i]/exp)%10 ]++;
	 
	        // Change count[i] so that count[i] now contains
	        // actual position of this digit in output[]
	        for (i = 1; i < 10; i++)
	            count[i] += count[i - 1];
	 
	        // Build the output array
	        for (i = n - 1; i >= 0; i--)
	        {
	            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
	            count[ (arr[i]/exp)%10 ]--;
	        }
	 
	        // Copy the output array to arr[], so that arr[] now
	        // contains sorted numbers according to curent digit
	        for (i = 0; i < n; i++)
	            arr[i] = output[i];
	    }
	 
	    // The main function to that sorts arr[] of size n using
	    // Radix Sort
	    static void RadixSort(int arr[], int n)
	    {
	        // Find the maximum number to know number of digits
	        int m = getMax(arr, n);
	 
	        // Do counting sort for every digit. Note that instead
	        // of passing digit number, exp is passed. exp is 10^i
	        // where i is current digit number
	        for (int exp = 1; m/exp > 0; exp *= 10)
	            countsort(arr, n, exp);
	    }
	
	
	    
	  static void PancakeSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i ++){
            int min = FindMin(arr,i,arr.length-1);
            Flip(arr, i, min);
        }

    }

	static int FindMin(int[] arr,int p,int n) {
	// TODO Auto-generated method stub
		int min=p;
		for(int i=p;i<arr.length;i++) {
			if(arr[min]>=arr[i]) {
				min=i;
			}
		}
		return min;
	}
	
	static void Flip(int[] arr,int i,int min) {
		for(int j=i;j<min;j++) {
			swap(arr,min,j);
			min--;
		}
	}
}
