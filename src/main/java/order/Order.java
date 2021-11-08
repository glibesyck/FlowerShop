package order;

import flowers.Flower;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public Flower flower;
    Order() {};
    Order(Flower flower) {
        this.flower = flower;
    }
    public static int userID = 0;
    public List<User> users = new ArrayList<>();
    public void addUser(User newUser) {
        users.add(newUser);
    }
    public void removeUser(User oldUser) {
        users.remove(oldUser);
    }
    public void notifyUsers() {
        for (User user : users) {
            user.update("There is update for you!");
        }
    }
    public void order() {
        notifyUsers();
    }
}
