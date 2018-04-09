public class Transport {
    protected int width; // ширина
    protected int height; // высота
    protected int length; // длина
    protected int speed; // скорость
    protected int weight; // вес
    protected String marka;
    protected String model;
    protected int distanse; //расстояние

    public void go (int t) {
      this.distanse = this.speed * t;

    }

}
