
package mini;


public abstract class Animal {
    String ten;
    int cannang;
public abstract void drink();

public Animal(String ten, int cannang){
    this.ten = ten;
    this.cannang = cannang;
}

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public int getCannang() {
        return cannang;
    }

    public void setCannang(int cannang) {
        this.cannang = cannang;
    }

} 

