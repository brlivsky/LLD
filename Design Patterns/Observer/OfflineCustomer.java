package Observer;

public class OfflineCustomer implements Observer {
    
    Observable shoppingProduct;
    Integer customerId;
    
    OfflineCustomer(Integer customerId) {
        this.customerId = customerId;
    }

    OfflineCustomer(Observable obs, Integer customerId) {
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
