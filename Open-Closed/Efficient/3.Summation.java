public class Summation implements Operation{
    private int a;
    private int b;
    public Summation(int a,int b) {
        this.a = a;
        this.b = b;
    }
    int geta(){return a;}
    int getb(){return b;}
    @Override
    int performOperation(){
        return a+b;
    }
}
