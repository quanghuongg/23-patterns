import conbuilder.ConBuilder;
import product.Product;

public class BuilderMain {
    public static void main(String[] args) {
        ConBuilder builder = new ConBuilder();
        Product product = builder.a("Only field a")
                .build();
        System.out.println( product.toString()
        );
    }
}
