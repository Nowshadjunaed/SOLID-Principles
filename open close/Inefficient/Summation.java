public class Summation implements Operation{
    private int a;
    private int b;
    private int res = 0;

    public Summation(int a,int b) {
        this.a = a;
        this.b = b;
    }
    int geta(){return a;}
    int getb(){return b;}
}
