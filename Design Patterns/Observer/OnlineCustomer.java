package Observer;

public class OnlineCustomer implements Observer {
    
    Observable shoppingProduct;
    Integer customerId;

    OnlineCustomer(Observable obs, Integer customerId) {
        this.shoppingProduct = obs;
        this.customerId = customerId;
    }

    @Override
    public void setNotification(Observable obs) {
        this.shoppingProduct = obs;
    }
    
    @Override
    public void update() {
        shoppingProduct.getData();
    }
}
