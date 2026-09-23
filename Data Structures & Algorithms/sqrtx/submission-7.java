class Solution {
    public int mySqrt(int x) {
        


        long i=0;

        while((i+1) * (i+1) <= x){
            i++;
        }
        return (int)i;


        // long n=x;

        // while(n * n > x){
        //     n = (n + x/n)/n;

        // }
        // return (int)x;
    }
}