public class Main {
    public static void main(String[] args) {
    RationalNumber rationalNumber = new RationalNumber(15,5);
    rationalNumber.show();
    System.out.println(rationalNumber.toDouble());
    System.out.println(rationalNumber.nod(rationalNumber.getChisl(), rationalNumber.getZnam()));
    rationalNumber.optimize();



    }
}
