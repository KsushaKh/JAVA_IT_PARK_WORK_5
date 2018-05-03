public class Circle extends Shapes {
    double r;
    public Circle(int r){
        this.r = r;
    }
    double area (){
        return this.r * this.r * Math.PI;
    }
}
