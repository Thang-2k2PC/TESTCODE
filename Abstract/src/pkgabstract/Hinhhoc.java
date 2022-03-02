package pkgabstract;

/**
 *
 * @author DELL
 */
public abstract class Hinhhoc {
    String tenHinh;
    int socanh;
    public abstract void nhap();
    public abstract void inKQ();

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public int getSocanh() {
        return socanh;
    }

    public void setSocanh(int socanh) {
        this.socanh = socanh;
    }
}
