public class NumberPalindrome {
    public static boolean isPalindrome(int numIn){
        numIn = Math.abs(numIn);
        int revNum = 0;
        int newNum = numIn;
        while(newNum>0){
            revNum+=newNum%10;
            revNum*=10;
            newNum/=10;
        }
        //System.out.println(revNum);

        if(numIn==revNum/10) return true;
        return false;
    }
}
