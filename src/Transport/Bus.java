package Transport;

public class Bus extends Transport<DriverD> {
    private Size size;
    private Type type;
    public Bus(String brand,
               String model,
               double engineVolume,
               DriverD driver,
               Size size,
               Type type) {
        super(brand, model, engineVolume, driver);
        setSize(size);
    }

    @Override
    public void printType() { if (getSize() != null) {
        System.out.println(Type.BUS);
    } else System.out.println("Данных по транспортному средству недостаточно");

    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал двигаться ");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил двигаться ");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) + Math.random());
        System.out.println("Лучшее время круга для автобуса " + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) + Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);

    }
    public Size getSize(){
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }
}