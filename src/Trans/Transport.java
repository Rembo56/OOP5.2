package Trans;
public abstract class Transport implements Competitive{
    private String brand;
    private String model;
    private float engineVolume;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getDriver() {
        System.out.println();
        return null;
    }
    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public Transport(String brand, String model, float engineVolume) {

        if (brand==null || brand.isEmpty()) {
            this.brand = "BMW";
        } else {
            this.brand = brand;
        }
        if (model==null || model.isEmpty()) {
            this.model = "z3";
        } else {
            this.model = model;
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.6F;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
    @Override
    public int bestLoop(int time) {
        System.out.println("Лучшее время круга "+time+" сек");
        return 0;
    }

    @Override
    public int maxSpeed(int speed) {
        System.out.println("Максимальная скорость "+speed+" км/ч");
        return 0;
    }

    @Override
    public void PitStop() {
        System.out.println("Машина едет на пит-стоп");
    }

     abstract public void getDia();

}