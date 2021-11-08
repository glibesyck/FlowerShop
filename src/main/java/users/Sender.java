package users;

import order.Order;

public class Sender implements User{
    public int userID;
    public Sender() {
        setID(Order.userID);
        Order.userID ++;
    }
    @Override
    public void setID(int ID) {
        this.userID = ID;
    }
    @Override
    public int getID() {
        return userID;
    }
    @Override
    public void update(String status) {
        System.out.println("Status: " + status);
    }
}
