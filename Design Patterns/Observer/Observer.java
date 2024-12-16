package Observer;

public interface Observer {
    
    Observable shoppingProduct;
    Integer customerId;

    void update();
    void setNotification(Observable obs);
}
