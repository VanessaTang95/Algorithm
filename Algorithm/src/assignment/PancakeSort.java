package assignment;

public class PancakeSort {
	
	public static void main(String[] args) {
		int arr[]= {33,57,2,5,8,9,0};
		System.out.println("Original array is:");
		printArray(arr);
		System.out.println();
		System.out.println("After Pancake sorting:");
		PancakeSort1(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	static void PancakeSort1(int[] arr){
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

	static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}