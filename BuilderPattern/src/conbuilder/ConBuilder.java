package conbuilder;

import builder.ProductBuilder;
import product.Product;

public class ConBuilder implements ProductBuilder {
    private String a;
    private String b;
    private String c;
    private String d;

    @Override
    public ProductBuilder a(String a) {
        this.a = a;
        return this;
    }

    @Override
    public ProductBuilder b(String b) {
        this.b = b;
        return this;
    }

    @Override
    public ProductBuilder c(String c) {
        this.c = c;
        return this;
    }

    @Override
    public ProductBuilder d(String d) {
        this.d = d;
        return this;
    }

    @Override
    public Product build() {
        return new Product(a, b, c, d);
    }
}
