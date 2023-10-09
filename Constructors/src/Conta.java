
import java.util.Date;

public class Conta {

    private int accountNumber;
    private String nameAccount;
    private double amount;

    public Conta(int accountNumber, String nameAccount) {
        this.accountNumber = accountNumber;
        this.nameAccount = nameAccount;
        this.amount = 0;
    }
    public Conta(int accountNumber, String nameAccount, double inicialDeposit) {
        this.accountNumber = accountNumber;
        this.nameAccount = nameAccount;
        balance(inicialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void balance(double amount) {
        this.amount += amount;
    }
    public double withdraw(double amount) {
        return this.amount -=  amount + 5;
    }
}
