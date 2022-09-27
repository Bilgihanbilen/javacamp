package Ders34;

public class Ders34 {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop", "Asus",3,2,"Siyah");

        ProductManager productManager = new ProductManager();

        productManager.Add(product);

        System.out.println(product.getKod());



    }
}