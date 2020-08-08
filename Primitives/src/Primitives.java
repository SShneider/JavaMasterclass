public class Primitives {
        public static void main(String[] args){
            byte myByte = 12;
            short myShort = 15;
            int myInt = 515;
            long myLong = 50000L+(10L*(myShort+myInt+myByte));
            System.out.println(myLong);
            short shortTwo = (short)(100+10);
            System.out.println(shortTwo);
        }
}
