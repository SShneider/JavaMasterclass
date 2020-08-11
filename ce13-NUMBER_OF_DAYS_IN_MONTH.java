public class NumberOfDaysInMonth {
  public static boolean isLeapYear(int year){
        if(year<1 || year>9999) return false;
        else if(year%4!=0) return false;
        else if(year%100!=0) return true;
        else if(year%400==0) return true;
        else return false;
    }
    public static int getDaysInMonth(int month, int year){
        if(year<1 || year>9999) return -1;
        if(month<1||month>12) return -1;
        int Feb = 28;
        if(isLeapYear(year)) Feb = 29;
        switch (month){
            case 1: case 3: case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 2:
                return Feb;
            default: 
                return 30;
        }
    }
}
