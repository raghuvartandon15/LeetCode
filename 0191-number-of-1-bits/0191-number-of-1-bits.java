class Solution {
    public int hammingWeight(int n) {
        if(n==0){
        return 0;
    }
    int rem,count=1;
    while(n/2!=0){
        rem = n%2;
        if(rem==1){
            count++;
        }
        n=n/2;
    }
    return count;
    }
}