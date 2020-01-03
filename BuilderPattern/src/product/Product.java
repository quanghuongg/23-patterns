package product;

public class Product {
    private String a;
    private String b;
    private String c;
    private String d;



    public Product(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Product [a=" + a + ", b=" + b + ", c=" + c
                + ", d=" + d + "]";
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }
}
