import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Branch> branchesArrayList;

    public Bank() {
        this.branchesArrayList = new ArrayList<Branch>();
    }
    public void addBranch(String name){
        Branch newBranch = new Branch(name);
        branchesArrayList.add(newBranch);
    }
    public void addCustomer(String branchName, String customerName, double custBalance){
        boolean found = false;
        for(int i = 0; i<branchesArrayList.size(); i++){
             Branch currentBranch = branchesArrayList.get(i);
             if(currentBranch.getName().equals(branchName)){
                 currentBranch.addCustomer(customerName, custBalance);
                 found = true;
                 break;
             }
        }
        if(!found){
            addBranch(branchName);
            branchesArrayList.get(branchesArrayList.size()-1).addCustomer(customerName, custBalance);
        }
    }
    public void addTransaction(String branchName, String customerName, double custBalance){
        boolean found = false;
        for(int i = 0; i<branchesArrayList.size(); i++){
            Branch currentBranch = branchesArrayList.get(i);
            if(currentBranch.getName().equals(branchName)){
                currentBranch.addTransaction(customerName, custBalance);
                found = true;
                break;
            }
        }
        if(!found){
            addBranch(branchName);
            branchesArrayList.get(branchesArrayList.size()-1).addCustomer(customerName, custBalance);
        }
    }
    private static Scanner scanner = new Scanner(System.in);
    public void menu(){
        boolean live = true;
        while(live) {
            System.out.println("Please make a selection\n" +
                    "1 -> add new branch\n" +
                    "2 -> add new customer\n" +
                    "3 -> add transaction\n" +
                    "4 -> get branch list\n"+
                    "0 -> quit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            String bName;
            String cName;
            String yesno;
            int idPick;
            int cBal;
            switch (choice) {
                case 1:
                    System.out.println("Please enter branch name:");
                    bName = scanner.nextLine();
                    addBranch(bName);
                    break;
                case 2:
                    System.out.println("Please enter customer name:");
                    cName = scanner.nextLine();
                    System.out.println("Please enter customer balance:");
                    cBal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter branch to add customer to:");
                    bName = scanner.nextLine();
                    addCustomer(bName, cName, cBal);
                    break;
                case 3:
                    System.out.println("Please enter customer name:");
                    cName = scanner.nextLine();
                    System.out.println("Please enter customer latest transaction:");
                    cBal = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter branch to add customer to:");
                    bName = scanner.nextLine();
                    addTransaction(bName, cName, cBal);
                    break;
                case 4:
                    if(branchesArrayList.size()==0){
                        System.out.println("No branches at this bank");
                    }
                    else {
                        System.out.println("Branches at this bank:\n");
                        for (int i = 0; i < branchesArrayList.size(); i++) {
                            System.out.println((i+1) + " " + branchesArrayList.get(i).getName());
                        }
                        System.out.println("Would you like to see detailed information about a branch? y/n\n");
                        yesno = scanner.nextLine();
                        if(yesno.equals("y")){
                            System.out.println("Which branch would you like to see(by num)");
                            idPick = scanner.nextInt();
                            scanner.nextLine();
                            branchesArrayList.get(idPick-1).printCustomers();
                        }
                    }
                    break;
                case 0:
                    live = false;
                    break;
            }
        }
    }
}
