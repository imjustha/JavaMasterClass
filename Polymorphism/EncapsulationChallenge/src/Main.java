public class Main {
    public static void main(String[] args){

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

//        Printer printer1 = new Printer(50, false);
//        System.out.println("initial page count = " + printer.getPagesPrinted());
//
//        int pagesPrinted1 = printer.printPages(5);
//        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
//                pagesPrinted1, printer1.getPagesPrinted());
//
//        pagesPrinted1 = printer.printPages(10);
//        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
//                pagesPrinted1, printer1.getPagesPrinted());
    }



}
