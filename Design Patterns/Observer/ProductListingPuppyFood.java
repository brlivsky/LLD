package Observer;

import java.util.HashMap;

public class ProductListingPuppyFood implements Observable {
    String productName = new String();
    Integer quantity;

    HashMap<Integer, Observer> listOfObservers= new HashMap<>(); ;

    ProductListingPuppyFood(Integer quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public void setProductName(String s) {
        this.productName = s;
    }
    
    @Override
    public void add(Observer customer, Integer customerId) {
        listOfObservers.put(customerId, customer);
    }

    @Override
    public void remove(Integer customerId) {
        listOfObservers.remove(customerId);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs: listOfObservers.values()) {
            obs.update();
        }
    }

    @Override
    public void setData(Integer data) {
        if (quantity == null) {
            quantity = data;
        } else {
            quantity += data;
        }

        if (quantity > 0) {
            notifyObservers();
        }
    }

    @Override
    public void getData() {
        System.out.println("Number of " + productName + " : " + quantity);
    }
}
