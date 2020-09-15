import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerArrayList;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
    public void printCustomers(){
        for(int i = 0; i<customerArrayList.size(); i++){
            System.out.println(customerArrayList.get(i).getName());
        }
    }
    public void addCustomer(String name, double balance){
        Customer newCustomer = new Customer(name);
        newCustomer.addTransaction(balance);
        customerArrayList.add(newCustomer);
    }
    public void addTransaction(String name, double transaction){
        boolean found = false;
        for(int i = 0; i<customerArrayList.size(); i++){
            Customer thisCustomer = customerArrayList.get(i);
            if(thisCustomer.getName().equals(name)){
                thisCustomer.addTransaction(transaction);
                found = true;
                break;
            }
        }
        if(!found){
            addCustomer(name, transaction);
        }
    }

}
