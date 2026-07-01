class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev=0;
        boolean b=false;
        
        while (temp!=0 && temp>0){
            int i = temp%10;
            rev = rev*10 +i;
            temp= temp/10;
        }
        if(x==rev){
            b=true;
        }
        return b;
    }
}