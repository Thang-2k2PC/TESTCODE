package sinhvien1;

/**
 *
 * @author DELL
 */
class Customer {

    private int id;
    private String name;
    private int discount;

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public Customer() {
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}

class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }
}

public class CodeLear50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer s = new Customer(1000, "Tuan", 20);
        Invoice sc = new Invoice(1000, s, 100000);
        System.out.println("Customer name: " + sc.getCustomerName());
        System.out.println("Invoice after discount: " + sc.getAmountAfterDiscount());
    }

}
