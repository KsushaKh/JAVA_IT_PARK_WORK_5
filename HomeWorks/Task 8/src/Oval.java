public class Oval extends Shapes{
    double a; //длина большой полуоси

    double b; // длина малой полуоси

    public Oval (double a, double b){
        this.a = a;
        this.b = b;
    }

    double area (){
        return this.a*this.b*Math.PI;
    }

}
