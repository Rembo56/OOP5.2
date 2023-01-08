package Drivers;
import Trans.PassCar;

public class DriverB extends Driver<PassCar> {
   public String lisenseType;

    public String getLisenseType() {
        return lisenseType;
    }

    public DriverB(String name, boolean lisense, int period, String lisenseType) {
        super(name, lisense, period,lisenseType);
        this.setLisense(lisense);
        this.lisenseType=lisenseType;
    }

    @Override
    public void stopMoving() {
        System.out.println("Машина остановилась");
    }

    @Override
    public void startMoving() {
        System.out.println("Машина начала движение");
    }

    public void checkLisense() throws ErrorLisenseException {
        if (lisenseType == null || lisenseType.isEmpty() || lisenseType=="C"|| lisenseType=="D"){
            throw new ErrorLisenseException();
        }
        else{
            System.out.println("Водитель "+getName()+" имеет нормальные права");
        }
    }
}
