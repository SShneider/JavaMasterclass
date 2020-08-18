public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int numOne, int numTwo){
        if(numOne<10 || numTwo<10 || numOne>99 || numTwo>99) return false;
        int x = numOne/10;
        int y = numOne%10;
        int z = numTwo/10;
        int u = numTwo%10;
        if(x==z || x==u || u ==y || y==z) return true;
        return false;
    }
}
