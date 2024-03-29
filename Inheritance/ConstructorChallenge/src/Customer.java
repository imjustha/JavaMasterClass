public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public Customer(){
        this("Nobody", "nobody@anywhere.com");
    }

    public Customer(String name, String emailAddress){
//        this.name = name;
//        this.emailAddress = emailAddress;
        this(name, 1000, emailAddress);
    }
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
