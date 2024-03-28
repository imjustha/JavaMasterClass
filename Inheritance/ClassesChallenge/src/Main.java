public class Main {
    public static void Main(String[] args){
//        Account account = new Account();

//        account.setNumber("12345");
//        account.setBalance(1000.00);
//        account.setEmail("myemail@gamil.com");
//        account.setCustomerName("Ha Jeong");
//        account.setPhoneNumber("123-123-1213");
        // instead of using those, use just constructor like below

        Account account = new Account("12345", 1000.00, "myemail@gamil.com",
                "Ha Jeong", "123-123-1213");

        System.out.println(account.getNumber());
        System.out.println(account.getBalance());





        account.withdrawFunds(100.0);
        account.depositFunds(250);
        account.withdrawFunds(50);
    }


}
