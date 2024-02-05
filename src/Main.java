public class Main {

    public static void main(String[] args) {
        Beauty beauty1 = new Beauty("LED 마스크", 20000, 1);
        beauty1.getDeliveryCharge();
        beauty1.getProductInfo();

        Grocery grocery1 = new Grocery("쌀 8kg", 30000, 8);
        grocery1.getDeliveryCharge();
        grocery1.getProductInfo();

        LargeAppliance appliance1 = new LargeAppliance("미니 냉장고", 1500000, 17);
        appliance1.getDeliveryCharge();
        appliance1.getProductInfo();
    }
}
