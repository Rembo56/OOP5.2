package Drivers;
import Trans.Bus;

public class DriverD extends Driver<Bus> {
    public String lisenseType;

    public String getLisenseType() {
        return lisenseType;
    }

    public DriverD(String name, boolean lisense, int period, String lisenseType) {
        super(name, lisense, period,lisenseType);
        this.setLisense(lisense);
        this.lisenseType=lisenseType;
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус остановился");
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }
    public void checkLisense() throws ErrorLisenseException {
        if (lisenseType == null || lisenseType.isEmpty() || lisenseType=="B"|| lisenseType=="C"){
            throw new ErrorLisenseException();
        }
        else{
            System.out.println("Водитель "+getName()+" имеет нормальные права");
        }
    }
}
