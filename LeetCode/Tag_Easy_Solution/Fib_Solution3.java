//iternative
//dp solution

class Solution{
  public int fib(int N){
    if(N<=1){
      return N;
    }

    int a=0,b=1;
    while(N-- >1){
      int temp=a+b;
      a=b;
      b=temp;
    }

    return b;
  }

}
