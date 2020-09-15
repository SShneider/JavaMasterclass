import java.util.Scanner;

public class Menus {
    public Menus() {
    }
    public static int selectPlaylist(int size){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to view playlist details? y/n");
        String choice = scanner.nextLine();
        if(choice.equals("n")) return 0;
        else{
            System.out.println("Please enter index of the playlist you would like to view:");
            int count = 0;
            int idxChoice = scanner.nextInt();
            while(idxChoice<=0 || idxChoice>size){
                System.out.println("Please enter index of the playlist you would like to view:");
                idxChoice = scanner.nextInt();
                scanner.nextLine();
                count++;
                if(count>4){
                    System.out.println("Error");
                    return -1;
                }
            }
            scanner.close();
            return idxChoice-1;
        }
    }
}
