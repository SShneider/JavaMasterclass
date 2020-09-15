import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions ;
    private String name;

    public Customer(String name) {
        this.transactions = new ArrayList<Double>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addTransaction(double transIn){
        transactions.add(transIn);
    }
}
