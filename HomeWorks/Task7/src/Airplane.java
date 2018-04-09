public class Airplane extends Transport {
    int flyweight; //взлетный вес
    int downweight; //посадочный вес
    int rangeflight; //дальность полета

    public void go (int t) {
        this.distanse = this.rangeflight * t;
    }
}
