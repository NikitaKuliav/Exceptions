package Transport;

public class Auto extends Transport<DriverB> {
    private BodyType bodyType;
    private Type type;
    public Auto(String brand,
                String model,
                double engineVolume,
                DriverB driver,
                BodyType bodyType,
                Type type) {
        super(brand, model, engineVolume, driver);
        setBodyType(bodyType);
    }

    @Override
    public void printType() { if (getBodyType() != null) {
        System.out.println(Type.CAR);
    } else System.out.println("Данных по транспортному средству недостаточно");
    }
    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал двигаться ");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил двигаться ");
    }
    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void theBestCircleTime() {
        int minBound = 70;
        int maxBound = 120;
        int theBestTimeInMins = (int) (minBound + (maxBound - minBound) + Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах " + theBestTimeInMins);

    }

    @Override
    public void maxSpeed() {
        int minBound = 100;
        int maxBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound) + Math.random());
        System.out.println("Максимальная скорость для автомобиля " + maxSpeed);

    }
    public BodyType getBodyType(){
        return bodyType;
    }
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public Type getType() {
        return type;
    }
}
