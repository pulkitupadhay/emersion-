class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int y=x;
        while(x!=0){
            int rem=x%10;
             if((sum>2147483647/10||sum<-2147483648/10)){
                return false;
            }
        sum=(sum*10)+rem;
            x/=10;
        }
        if(sum==y && sum>=0){
            return true;
        }else{
            return false;
        }
    }
}
