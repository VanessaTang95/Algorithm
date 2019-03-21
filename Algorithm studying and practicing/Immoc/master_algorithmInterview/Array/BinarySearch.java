public class BinarySearch{
//iterative solution
public int binarySearch(int arr[], int n, int target){
  //n=arr.length;
  int left=0, right=n-1;
  while(left<=right){
    int mid=left+(right-left)/2;
    if(arr[mid]==target){
      return mid;
    }else if(arr[mid]<target){
      left=mid+1;
    }else if(arr[mid]>target){
      right=mid-1;
    }
  }
  return -1;//this can be different according to the requirement
}
}
