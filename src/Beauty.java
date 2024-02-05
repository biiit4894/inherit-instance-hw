public class Beauty extends Product implements DeliveryChargeCalculator {

    Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge() {
        int weight = this.weight;
        int price = this.price;

        if(weight >= 10) {
            this.deliveryPrice += 10000;

        } else if (weight >= 3) {
            this.deliveryPrice += 5000;

        } else {
            this.deliveryPrice += 1000;
        }

        if(30000 <= price && price < 100000) {
            this.deliveryPrice -= 1000;
        } else if(price >= 100000) {
            this.deliveryPrice = 0;
        }

        return this.deliveryPrice;
    }

    void getProductInfo() {
        System.out.println(name + "의 가격은 " + price + "원, 무게는 " + weight + "kg입니다.");
        System.out.println("총 배송비: " + deliveryPrice + "\n");
    }

}
