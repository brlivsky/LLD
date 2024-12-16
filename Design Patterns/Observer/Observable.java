package Observer;

import java.util.*;

public interface Observable {
    String productName = new String();
    HashMap<String, Observer> listOfObservers= new HashMap<>(); ;
    Integer quantity;

    void setProductName(String s);
    void add(Observer obj, Integer customerId);
    void remove(Integer customerId);
    void notifyObservers();
    void setData(Integer data);
    void getData();
}
