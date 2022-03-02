package pkgabstract;

/**
 *
 * @author DELL
 */
public class TamGiac extends Hinhhoc{
    int a, b, c;
    public TamGiac(){
        
    }

    public TamGiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void nhap(){
    }
    @Override
    public void inKQ(){
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
}
