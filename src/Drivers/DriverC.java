package Drivers;
import Trans.Truck;

public class DriverC extends Driver<Truck> {
   public String lisenseType;

    public DriverC(String name, boolean lisense, int period, String lisenseType) {
        super(name, lisense, period, lisenseType);
        this.setLisense(lisense);
        this.lisenseType=lisenseType;
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    public String getLisenseType() {
        return lisenseType;
    }
    public void checkLisense() throws ErrorLisenseException {
        if (lisenseType == null || lisenseType.isEmpty() || lisenseType=="B"|| lisenseType=="D"){
            throw new ErrorLisenseException();
        }
        else{
            System.out.println("Водитель "+getName()+" имеет нормальные права");
        }
    }
}
