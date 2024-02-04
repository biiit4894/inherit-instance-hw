public class Product {
    private String name;
    int price;
    int weight;

    int deliveryPrice;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    static void getProductInfo(Product product) {
        System.out.println(product.name + "의 가격은 " + product.price + "원, 무게는 " + product.weight + "kg입니다.");
        System.out.println("총 배송비: " + product.deliveryPrice + "\n");
    }

    public static void main(String[] args) {
        Beauty beauty1 = new Beauty("LED 마스크", 20000, 1);
        beauty1.getDeliveryCharge();
        getProductInfo(beauty1);

        Beauty beauty2 = new Beauty("LED 마스크2", 50000, 3);
        beauty2.getDeliveryCharge();
        getProductInfo(beauty2);

        Grocery grocery1 = new Grocery("쌀 8kg", 30000, 8);
        grocery1.getDeliveryCharge();
        getProductInfo(grocery1);

        Grocery grocery2 = new Grocery("쌀 15kg", 30000, 15);
        grocery2.getDeliveryCharge();
        getProductInfo(grocery2);

        LargeAppliance appliance1 = new LargeAppliance("미니 냉장고", 1500000, 17);
        appliance1.getDeliveryCharge();
        getProductInfo(appliance1);

        LargeAppliance appliance2 = new LargeAppliance("미니 냉장고2", 300000, 30);
        appliance2.getDeliveryCharge();
        getProductInfo(appliance2);
    }
}
