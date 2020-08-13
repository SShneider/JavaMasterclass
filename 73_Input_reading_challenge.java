import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    int count  = 1;
    int[] numIns = new int[10];
    boolean trigger = true;
    while (trigger){
      System.out.println("Enter number # "+count+" :");
      boolean isInt = myScan.hasNextInt();
      if(isInt){
        numIns[count-1] = myScan.nextInt();
        
        
        count++;
      }
      else{
        System.out.println("Wrong data.");
      }
      if(count == numIns.length) break;
    }
    
    myScan.close();
  }
}
