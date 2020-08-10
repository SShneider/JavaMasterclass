public class EqualityPrinter {
    public static void printEqual(int inOne, int inTwo, int inThree){
        String output;
        if(inOne<0 || inTwo<0 || inThree<0) output ="Invalid Value";
        else if(inOne==inTwo && inTwo==inThree) output = "All numbers are equal";
        else if(inOne==inTwo || inTwo==inThree || inThree==inOne) output = "Neither all are equal or different";
        else output = "All numbers are different";
        System.out.println(output);
    }
}
