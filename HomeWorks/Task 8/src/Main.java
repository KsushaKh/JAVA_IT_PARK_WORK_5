public class Main {
    public static void main(String[] args) {
        Shapes[] shapes = new Shapes[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Oval(4,5);
        shapes[2] = new Rectangle(4, 5);
        shapes[3] = new Square(3);
        shapes[4] = new Triangle(5,6);
        for (int i = 0; i<shapes.length; i++){
            System.out.println("Площадь равна " + shapes[i].area());
        }
    }
}
