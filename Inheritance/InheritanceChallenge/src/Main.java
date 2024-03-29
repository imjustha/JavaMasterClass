public class Main {
    public static void main(String[] args){
        Employee hajeong = new Employee("Ha Jeong", "01/31/1998","03/29/2024");
        System.out.println(hajeong);
        System.out.println("Age = " + hajeong.getAge());
        System.out.println("Pay = " + hajeong.collectPay());

        Employee joe = new Employee("Joe", "11/11/1990", "03/20/2024");
        System.out.println(joe);

        SalariedEmployee haley = new SalariedEmployee("Haley", "11/11/1990", "03/20/2024", 350000);
        System.out.println(haley);
        System.out.println("Haley's Paycheck = $" + haley.collectPay());

        haley.retire();
        System.out.println("Haley's Pension check = $" + haley.collectPay());

    }
}