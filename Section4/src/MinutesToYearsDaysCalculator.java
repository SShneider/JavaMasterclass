public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        String output;
        long years;
        long days;
        if(minutes<0)  output = "Invalid Value";
        else{
            years = (long)Math.floor(minutes/525600);
            days = (long)Math.floor(minutes%525600/1440);
            output = minutes+" min = "+years+" y and "+days+" d";
        }

        System.out.println(output);
    }
}
