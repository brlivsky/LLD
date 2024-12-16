package Observer;

public class Main {
    public static void main(String[] args) {

        Observable DroolsFocus = new ProductListingPuppyFood(0);
        DroolsFocus.setProductName("Drools Focus");
        
        Observer Rohan = new OnlineCustomer(DroolsFocus, 7);
        DroolsFocus.add(Rohan, 7);
        
        DroolsFocus.setData(10);

        Observer Arohan = new OfflineCustomer(13);
        Arohan.setNotification(DroolsFocus);

        DroolsFocus.add(Arohan, 13);

        DroolsFocus.setData(1);

    }
}
