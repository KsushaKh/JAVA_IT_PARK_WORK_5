public class Triangle extends  Shapes{
    double a; //сторона a;
    double h; //высота h, опущенная к стороне a;

    public  Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }
    double area(){
        return 0.5 * a * h;
    }
}
