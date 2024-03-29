public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constructor could be used efficiently
    public Account() {
        // this is calling another constructor within a constructor
        // it should be before sout
        this("56789", 2.50, "Default name", "Default address", "Default phone")
        System.out.println("Empty constructor called");
    }
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        email = customerEmail;
        phoneNumber = customerPhone;
    }
    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account");
        }else{
            balance -= withdrawalAmount;
            System.out.println("Withdrwal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
