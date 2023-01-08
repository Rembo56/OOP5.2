package Drivers;
import Trans.Bus;
import Trans.PassCar;
import Trans.Transport;
import Trans.Truck;

public abstract class Driver <T extends Transport> {

    private String name;
    private boolean lisense;
    private int period;
    private T transport;
    public String lisenseType;


    public String getName() {
        return name;
    }

    public boolean isLisense() {
        return lisense;
    }

    public int getPeriod() {
        return period;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLisense(boolean lisense) {
        this.lisense = lisense;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Driver(String name, boolean lisense, int period, String lisenseType) {
        this.name = name;
        this.lisense = lisense;
        this.period = period;
        this.lisenseType = lisenseType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", lisense=" + lisense +
                ", period=" + period +
                '}';
    }

    public void addOil() {
        System.out.println("Необходимо заправить авто");
    }

    public void checkLisense() throws ErrorLisenseException {
        System.out.println("Водитель "+name+" имеет нормальные права");
    }

    public void drive(T transport)
    {
        if ((lisense == true && transport instanceof Truck && lisenseType == "C") || (lisense == true && transport instanceof PassCar && lisenseType == "B") || (lisense == true && transport instanceof Bus && lisenseType == "D"))
        {
            System.out.println("Водитель " + name + " управляет автомобилем " + transport + " и будет участвавать в заезде");
        }
        else if ((lisense == false && transport instanceof Truck && lisenseType == "C") || (lisense == false && transport instanceof PassCar && lisenseType == "B") || (lisense == false && transport instanceof Bus && lisenseType == "D"))
        {
            System.out.println("Водитель "  + name + " имеет просроченные права и не будет участвовать в заезде");
        }
        else if ((transport instanceof Truck && lisenseType != "C") || (transport instanceof PassCar && lisenseType != "B") || (transport instanceof Bus && lisenseType != "D"))
        {
            System.out.println("Водитель " + name + " не имеет прав нужной категории");
        }
    }

    public static void chekD(Driver driver) {
        try {
            driver.checkLisense();
        }
        catch (ErrorLisenseException e){
            System.out.println("Необходимо указать тип прав для водителя "+driver);
        }
    }

    public abstract void stopMoving();

    public abstract void startMoving();
}


