public class Main {

    public static void main(String[] args) {

        Car car = new Car();
//        car.make = "Porsche";
//        car.model = "Carrera";
//        car.color = "Red";

        car.setMake("Porsche"); // once setter is initiated we can use it without using private field
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche"); // once setter is initiated we can use it without using private field
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(true);
        targa.setColor("White");

        targa.describeCar();

    }
}
