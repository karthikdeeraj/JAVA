public class Product {
    int ID = 1;
    String name = "Pen";
    int price = 100;
    int quantity = 10;

    void addStock(int x) {
        quantity = quantity + x;
        System.out.println("Stock after adding:"+quantity);
    }
void deductStock(int y){
        quantity = quantity - y;
        System.out.println("Stock after deduction:"+quantity);
}
void pDetails(){
        System.out.println(ID);
    System.out.println(name);
    System.out.println(price);
    System.out.println(quantity);
}
    public static void main(String[] args) {
        Product product = new Product();
        product.addStock(10);
        product.deductStock(5);
        product.pDetails();
    }
}