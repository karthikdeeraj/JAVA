interface Transaction {
    void execute();
    void rollback();
    void getStatus();
}


class Transfer implements Transaction {
    private String sourceAccount;
    private String destinationAccount;
    private double amount;
    private boolean isExecuted;


    public Transfer(String sourceAccount, String destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.isExecuted = false;
    }

    @Override
    public void execute() {
        System.out.println("Transfer executed: $" + amount + " from " + sourceAccount + " to " + destinationAccount);
        isExecuted = true;
    }

    @Override
    public void rollback() {
        if (isExecuted) {
            System.out.println("Transfer rolled back: $" + amount + " from " + destinationAccount + " to " + sourceAccount);
            isExecuted = false;
        } else {
            System.out.println("No transfer to rollback");
        }
    }

    @Override
    public void getStatus() {
        System.out.println("Transfer status: " + (isExecuted ? "Executed" : "Not executed"));
    }
}


class Deposit implements Transaction {
    private String account;
    private double amount;
    private boolean isExecuted;


    public Deposit(String account, double amount) {
        this.account = account;
        this.amount = amount;
        this.isExecuted = false;
    }

    @Override
    public void execute() {
        System.out.println("Deposit executed: $" + amount + " to account " + account);
        isExecuted = true;
    }

    @Override
    public void rollback() {
        if (isExecuted) {
            System.out.println("Deposit rolled back: $" + amount + " from account " + account);
            isExecuted = false;
        } else {
            System.out.println("No deposit to rollback");
        }
    }

    @Override
    public void getStatus() {
        System.out.println("Deposit status: " + (isExecuted ? "Executed" : "Not executed"));
    }
}

class Withdrawal implements Transaction {
    private String account;
    private double amount;
    private boolean isExecuted;

    // Constructor
    public Withdrawal(String account, double amount) {
        this.account = account;
        this.amount = amount;
        this.isExecuted = false;
    }

    @Override
    public void execute() {
        System.out.println("Withdrawal executed: $" + amount + " from account " + account);
        isExecuted = true;
    }

    @Override
    public void rollback() {
        if (isExecuted) {
            System.out.println("Withdrawal rolled back: $" + amount + " to account " + account);
            isExecuted = false;
        } else {
            System.out.println("No withdrawal to rollback");
        }
    }

    @Override
    public void getStatus() {
        System.out.println("Withdrawal status: " + (isExecuted ? "Executed" : "Not executed"));
    }
}


class Main {
    public static void main(String[] args) {
        // Creating instances of different transactions
        Transaction transfer = new Transfer("Account1", "Account2", 100.0);
        Transaction deposit = new Deposit("Account3", 50.0);
        Transaction withdrawal = new Withdrawal("Account4", 30.0);
        transfer.execute();
        transfer.rollback();
        transfer.getStatus();
        deposit.execute();
        deposit.rollback();
        deposit.getStatus();
        withdrawal.execute();
        withdrawal.rollback();
        withdrawal.getStatus();

    }
}
