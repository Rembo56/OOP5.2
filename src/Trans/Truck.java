package Trans;

public class Truck extends Transport {
    private VolumeType volumeType;
    public enum VolumeType{
        N1,
        N2,
        N3
    }
    public Truck (String brand, String model, float engineVolume, VolumeType volumeType) {
        super(brand,model,engineVolume);
        this.volumeType=volumeType;
    }

    public void printType() {
        switch (volumeType) {
            case N1:
                System.out.println("Грузовик с полной массой до 3,5 тонн");
                break;
            case N2:
                System.out.println("Грузовик с полной массой свыше 3,5 до 12 тон");
                break;
            case N3:
                System.out.println("Грузовик с полной массой свыше 12 тонн");
                break;
            default:
                System.out.println("Данных по транспортному средству недостаточно.");
        }
    }

    public VolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public void getDia(){
        System.out.println("Грузовик проходит диагностику");
    }
}