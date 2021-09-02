public class Multiplication implements Operation {
    private int a;
    private int b;
    public Multiplication(int a,int b) {
        this.a = a;
        this.b = b;
    }
    int geta(){return a;}
    int getb(){return b;}
    @Override
    int performOperation(){
        return a*b;
    }
}
