package Trans;
public class PassCar extends Transport { private BodyType bodyType;


    public enum BodyType{
        SEDAN,
        HATCHBACK,
        COUPE,
        UNIVERSAL,
        JEEP,
        CROSSOVER,
        PICKUP,
        VANCAR,
        MINIVAN
    }

    public PassCar(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType=bodyType;
    }

    public void printType() {

        switch (bodyType) {
            case SEDAN:
                System.out.println("Тип кузова Седан");
                break;
            case COUPE:
                System.out.println("Тип кузова Купе");
                break;
            case UNIVERSAL:
                System.out.println("Тип кузова Универсал");
                break;
            case JEEP:
                System.out.println("Тип кузова Внедорожник");
                break;
            case CROSSOVER:
                System.out.println("Тип кузова Кроссовер");
                break;
            case PICKUP:
                System.out.println("Тип кузова Пикап");
                break;
            case VANCAR:
                System.out.println("Тип кузова Фургон");
                break;
            case MINIVAN:
                System.out.println("Тип кузова Минивэн");
                break;
            default:
                System.out.println("Данных по транспортному средству недостаточно.");
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void getDia(){
        System.out.println("Автомобиль проходит диагностику");
    }
}