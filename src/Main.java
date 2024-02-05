public class Main {

    public static void main(String[] args) {
        Product beauty = new Beauty("beauty", 50000, 2);
        Product grocery = new Grocery("grocery", 20000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 100000, 5);

        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();
        System.out.println(totalDeliveryCharge);
    }
}
