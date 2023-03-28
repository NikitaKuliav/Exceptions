package Transport;

public class Truck extends Transport<DriverC> {
    private LoadCapacity loadCapacity;
    private Type type;
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverC driver,
                 LoadCapacity loadCapacity,
                 Type type) {
        super(brand, model, engineVolume, driver);
        setLoadCapacity(loadCapacity);
    }


    @Override
    public void printType() { if (getloadCapacity() != null) {
        System.out.println(Type.TRUCK);
    } else System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал двигаться ");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил двигаться ");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 90;
        int maxBound = 140;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) + Math.random());
        System.out.println("Лучшее время круга для грузовика " + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 130;
        int maxSpeed = (int) (minBound + (maxBound - minBound) + Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);

    }
    public LoadCapacity getloadCapacity(){
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public Type getType() {
        return Type.TRUCK;
    }
}

