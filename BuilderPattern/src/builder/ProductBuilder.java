package builder;

import product.Product;

public interface ProductBuilder {
    ProductBuilder a(String a);

    ProductBuilder b(String b);

    ProductBuilder c(String c);

    ProductBuilder d(String d);

    Product build();

}
