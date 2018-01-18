package assignment;

public class FindKth {
	
	public static void main(String[] args) {
		int arr[]= {3,6,7,11,2,5,8};
		int k=1;
		int num=0;
		System.out.println("k="+k);
		
		if(k>arr.length-1) {
			System.out.println("Out of range!");
		}
		else {
			num=FindKth1(arr,k);
		}
		System.out.println("The "+k+"th greatest number in this array is:"+num);
	}

	private static int FindKth1(int[] arr, int k) {
		// TODO Auto-generated method stub
		if(k<1) return -1;
		else {
			return getKth(arr,arr.length-k +1, 0, arr.length - 1);
		}
	}

	static int getKth(int[] arr,int k, int low, int high) {
		// TODO Auto-generated method stub
		int pivot=arr[high];	
        int wall = low - 1;
        for(int i = low; i < high ; i ++){

            if(arr[i] <= pivot){
                wall ++;
                swap(arr, i, wall);
            }
        }
        swap(arr, high, wall+1);
        
        if (k == wall+1+1) {
			return pivot;
		} else if (k < wall+1+1) {
			return getKth(arr,k,low,high- 1);
		} else {
			return getKth(arr,k, low + 1, high);		
			}	
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
