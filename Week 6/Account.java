import java.lang.Math;
import java.util.ArrayList;

public class Account {
    private double balance; // balance
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>(); // transitionList

    /**
     * Deposit method.
     * @param amount : double.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
        }
    }

    /**
     * withdraw method.
     * @param amount : double.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
        }
    }

    /** addTransaction method.
     * @param amount : double.
     * @param operation : String.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            Transaction newTransaction = new Transaction(operation, amount, balance);
            transitionList.add(newTransaction);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            Transaction newTransaction = new Transaction(operation, amount, balance);
            transitionList.add(newTransaction);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * printTransaction method.
     */
    public void printTransaction() {
        if (transitionList.size() == 0) {
            return;
        } else {
            int indexTransaction = 1;
            for (Transaction tr : transitionList) {
                System.out.print("Giao dich ");
                System.out.print(indexTransaction + ": ");
                if (tr.getOperation().equals(Transaction.DEPOSIT)) {
                    System.out.print("Nap tien $");
                } else if (tr.getOperation().equals(Transaction.WITHDRAW)) {
                    System.out.print("Rut tien $");
                }
                System.out.print((double) Math.round(tr.getAmount() * 100) / 100);
                // Nhung so chia cho 10 phai them so 0 vao sau
                if (Math.round(tr.getAmount() * 100) % 10 == 0) {
                    System.out.print(0);
                }
                System.out.print(". So du luc nay: $");
                System.out.print((double) Math.round(tr.getBalance() * 100) / 100);
                // Nhung so chia cho 10 phai them so 0 vao sau
                if (Math.round(tr.getBalance() * 100) % 10 == 0) {
                    System.out.print(0);
                }
                System.out.println(".");
                indexTransaction++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
