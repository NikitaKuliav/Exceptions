import Transport.*;

public class Main {
    public static void main(String[] args) {

        for (int i =1; i<=4;i++){
            DriverB driverB = new DriverB("категории B  № " + i,
                    true,
                    5 +i);
            Auto auto = new Auto (
                    "Auto brand #" + i,
                    "Auto model #" + i,
                    2.0,
                    driverB, BodyType.COUPE,
                    Type.CAR
            );
            DriverC driverC = new DriverC("категории С  № " + i,
                    true,
                    10 +i);
            Truck truck = new Truck (
                    "Truck brand #" + i,
                    "Truck model #" + i,
                    6.5,
                    driverC,
                    LoadCapacity.getValue(11.0),
                    Type.CAR
            );
            DriverD driverD = new DriverD("категории D  № " + i,
                    true,
                    7 +i);

            Bus bus = new Bus (
                    "Bus brand #" + i,
                    "bus model #" + i,
                    4.5,
                    driverD,
                    Size.getValue(26),
                    Type.BUS
                    );
//            printInfo(auto);
//            printInfo(bus);
//            printInfo(truck);
        }
//        Auto mercedes = new Auto("Mercedes", "cla 200", 2.0, new DriverB("Mihail", true, 6), BodyType.SEDAN, Type.CAR);
//        Auto audi = new Auto("audi", "a8", 2.0, new DriverB("Alex", true, 7), null, Type.CAR);


//        System.out.println(mercedes.getBodyType());
//        mercedes.printType();
//        System.out.println(audi.getBodyType());
//        audi.printType();
//
//          Truck scania = new Truck("Scania", "250", 4,new DriverC("Denis", true, 10), LoadCapacity.getValue(null), Type.TRUCK);
//          scania.printType();
//          Bus ikarus = new Bus("Ikarus", "202", 4.3, new DriverD("Max", true, 12), Size.getValue(null), Type.BUS);
//          ikarus.printType();






    }
    private static void printInfo(Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " с характеристикой "+  "и будет участвовать в заезде");
    }
}