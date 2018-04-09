public class Tank extends Transport {
    int caliber; //калибр
    String typeweapon; // тип оружия

    public void go (int km) {
        this.distanse = km * caliber;

    }
}
