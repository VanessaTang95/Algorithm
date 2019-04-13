// recursive
//DP solution
class Solution {
    public int fib(int N) {
        if(N<=1){
            return N;
        }

        int []fib_1=new int[N+1];

        fib_1[0]=0;
        fib_1[1]=1;

        for(int i=2;i<=N;i++){
            fib_1[i]=fib_1[i-1]+fib_1[i-2];
        }
        return fib_1[N];

    }
}
