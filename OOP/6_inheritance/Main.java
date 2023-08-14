import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        Product shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);
        shirt.fold();
        productStore(shirt);
        shirt.wear();
        System.out.println(shirt);
        
        System.out.println("------------------------------------------------");

        Product pants = new Pants(49.99, "Black", "Adidas", 32, 32);
        pants.fold();
        productStore(pants);
        pants.wear();
        

    }

    public static void productStore(Product product){
        System.out.println(
            "Thank you for purchasing the" + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice()
        );
    }
}
