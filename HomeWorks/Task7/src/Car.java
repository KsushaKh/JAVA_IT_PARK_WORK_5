public class Car extends  Transport {
    int trunkvolime; //объем багажника
    String bodytype; //тип кузова
    String gearboxtye; // тип коробки передач
    int volumetank; // объем бака

    public void go (int t) {
        this.distanse = (this.trunkvolime + this.volumetank) * t;

    }

}
