public class Rectangle extends  Shapes {
    double a;
    double b;


    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    double area(){
        return this.a * this.b;
    }
}
