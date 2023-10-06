public class Transaction {
    private String operation; // operation
    private double amount; // amount
    private double balance; // balance
    public static final String DEPOSIT = "deposit"; // DEPOSIT
    public static final String WITHDRAW = "withdraw"; // WITHDRAW

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Constructor Tracsaction.
     * @param operation : String.
     * @param amount : double.
     * @param balance : double.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }
}