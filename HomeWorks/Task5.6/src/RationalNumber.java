public class RationalNumber {
    private int chisl;
    private int znam;

    public int getChisl(){
        return chisl;
    }

    public void setChisl(int x){
        this.chisl = x;
    }
    public int getZnam(){
       return znam;
    }
    public void setY(int y){
        this.znam = y;
    }

    public RationalNumber(){
        this.chisl = 0;
        this.znam = 1;
    }

    public RationalNumber(int x, int y){
        this.chisl = x;
        this.znam = y;
    }

    double toDouble(){
        return (double)chisl/(double)znam;

    }

    void show(){
        System.out.println(chisl + "/" + znam);
    }

    int nod(int x, int y) {
        while((x != 0) && (y != 0))
        {
            if (x > y) x = x % y;
            else y = y % x;
        }
        return x + y;
    }
    void optimize(){
        int nod = nod(chisl, znam);
        chisl = chisl / nod;
        znam = znam / nod;
        System.out.println(toDouble());

    }
}
