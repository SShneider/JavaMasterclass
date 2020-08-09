public class OperatorC {
    public static void main (String[] args){
        double x = 20.00;
        double y = 80.00;
        double z = (x+y)*100.0;
        double remainder = z%40;
        boolean testif;
        System.out.println("z"+z);
        System.out.println("rem"+remainder);
        if(remainder == 0d){
            testif = true;
        }else{
            testif = false;
        }
        System.out.println(testif);
        if(!testif){
            System.out.println("Got remainder");
        }
    }
}
