package Trans;

public class Bus extends Transport {private NumberType numberType;
    public enum NumberType{
        XS,
        S,
        M,
        L,
        XL
    }
    public Bus(String brand, String model, float engineVolume, NumberType numberType) {
        super(brand,model,engineVolume);
        this.numberType=numberType;
    }
    public void printType() {

        switch (numberType) {
            case XS:
                System.out.println("Вместимость автобуса особо малая (до 10 мест)");
                break;
            case S:
                System.out.println("Вместимость автобуса малая (до 25)");
                break;
            case M:
                System.out.println("Вместимость автобуса средняя (40–50)");
                break;
            case L:
                System.out.println("Вместимость автобуса большая (60–80)");
                break;
            case XL:
                System.out.println("Вместимость автобуса особо большая (100–120 мест)");
                break;
            default:
                System.out.println("Данных по транспортному средству недостаточно.");
        }
    }

    public NumberType getNumberType() {
        return numberType;
    }

    public void setNumberType(NumberType numberType) {
        this.numberType = numberType;
    }

    public String getModel() {
        return super.getModel();
    }

    @Override
    public void getDia(){
        System.out.println("Автобусы не могут проходить диагностику");
    }
}