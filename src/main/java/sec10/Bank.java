package sec10;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>(500);
    }

    public boolean addBranch(String name) {
        if (this.findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branch_name, String customer_name, double initial) {
        Branch branch = this.findBranch(branch_name);
        if (branch != null) {
            if (branch.newCustomer(customer_name, initial)) {
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch_name, String customer_name, double transaction) {
        Branch branch = this.findBranch(branch_name);
        if (branch != null) {
            if (branch.addCustomerTransaction(customer_name, transaction)) {
                return true;
            }
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (name.equals(branch.getName())) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String name, boolean print_transactions) {
        Branch branch = this.findBranch(name);
        if (branch != null) {
            System.out.printf("Customer details for branch %s", name);
            ArrayList<Customer> customers = branch.getCustomers();
            if (customers.size() > 0) {
                for (int i = 0; i < customers.size(); i++) {
                    System.out.printf("%nCustomer: %s[%d]", customers.get(i).getName(), i + 1);
                    if (print_transactions) {
                        ArrayList<Double> transactions = customers.get(i).getTransactions();
                        if (transactions.size() > 0) {
                            System.out.printf("%nTransactions");
                            for (int j = 0; j < transactions.size(); j++) {
                                System.out.printf("%n[%d] Amount %s", j + 1, Double.toString(transactions.get(j)));
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
    }
}
