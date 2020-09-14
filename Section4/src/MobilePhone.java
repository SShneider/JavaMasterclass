import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactList;
    private static Scanner scanner = new Scanner(System.in);
    public MobilePhone(String myNumber) {
        this.contactList = new ArrayList<Contact>();
        this.myNumber = myNumber;
    }
    public void menu(){
        System.out.println("Menu:\n" +
                "1 -> Quit\n" +
                "2 -> Print Contacts\n" +
                "3 -> Add New Contact\n" +
                "4 -> Update Contact\n" +
                "5 -> Remove Contact\n" +
                "6 -> Search Contact\n" +
                "Enter your choice:\n"
        );
        int selected = scanner.nextInt();
        scanner.nextLine();
        switch(selected) {
            case (1):
                menu();
                break;
            case (2):
                printContacts();
                break;
            case (3):
                addContacts();
                break;
            case(4):
                updateContacts();
                break;
            case(5):
                removeContacts();
                break;
            case(6):
                searchContacts();
                break;
        }
    }
    private void removeContacts(){
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        int index = searchContacts(name);
        if(index==-1){
            System.out.println("No such user found");
        }else {
            contactList.remove(index);
            System.out.println("Deleted successfully");
            menu();
        }
    }
    private void updateContacts(){
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        int index = searchContacts(name);
        if(index==-1){
            System.out.println("No such user found");
        }else {
            System.out.println("Update menu:\n" +
                    "1 -> Name\n" +
                    "2 -> Number\n" +
                    "3 -> Name+Number\n" +
                    "4 -> Cancel");
            int selected = scanner.nextInt();
            scanner.nextLine();
            String nameIn;
            String phoneNum ;
            switch (selected) {
                case (1):
                    System.out.println("Please enter the new name:");
                    nameIn = scanner.nextLine();
                    this.contactList.get(index).setName(nameIn);
                    menu();
                    break;
                case(2):
                    System.out.println("Please enter the new phone number:");
                    phoneNum = scanner.nextLine();
                    this.contactList.get(index).setPhoneNumber(phoneNum);
                    menu();
                    break;
                case(3):
                    System.out.println("Please enter the new name:");
                    nameIn = scanner.nextLine();
                    System.out.println("Please enter the new phone number:");
                    phoneNum = scanner.nextLine();
                    this.contactList.get(index).setName(nameIn);
                    this.contactList.get(index).setPhoneNumber(phoneNum);
                    menu();
                    break;
                default:
                    menu();
            }
        }
    }
    private void addContacts(){
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Please enter phone number:");
        String phoneNum = scanner.nextLine();
        if(searchContacts(name)>=0){
            System.out.println("Contact already on file");
            menu();
        }else{
            Contact newContact = new Contact(name, phoneNum);
            contactList.add(newContact);
            menu();
        }
    }
    private void printContacts(){
        for(int i = 0; i<this.contactList.size(); i++){
            String name = this.contactList.get(i).getName();
            String phoneNum = this.contactList.get(i).getPhoneNumber();
            System.out.println(name+"\t"+phoneNum);
        }
        menu();
    }
    private int searchContacts(String name){
        for(int i = 0; i<this.contactList.size(); i++) {
            String nameCompare = this.contactList.get(i).getName();
            if (nameCompare.equals(name)) return i;
        }
        return -1;
    }
    private void searchContacts(){
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        int indexContact = searchContacts(name);
        if(indexContact == -1){
            System.out.println("Contact not found");
            menu();
        }else {
            String nameOut = this.contactList.get(indexContact).getName();
            String phoneNum = this.contactList.get(indexContact).getPhoneNumber();
            System.out.println(nameOut + "\t" + phoneNum);
            menu();
        }
    }
}
