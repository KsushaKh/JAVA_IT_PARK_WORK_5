public class Motobike extends Transport {
    String typebike; //тип перевода
    String typedrive; //тип привода
    int maxSpeed;

    public void go (int km) {
        this.distanse = km / maxSpeed;

    }
}
