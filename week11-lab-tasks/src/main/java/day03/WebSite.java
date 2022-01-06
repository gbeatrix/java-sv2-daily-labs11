package day03;

import java.util.ArrayList;
import java.util.List;

public class WebSite {

    private List<Item> items = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void buyItem(String userName, String itemName) {
        User user = getUser(userName);
        Item item = getItem(itemName);
    }

    private User getUser(String userName) {
        for (User actual : users) {
            if (actual.getUserName().equals(userName)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("User not found!");
    }

    private Item getItem(String itemName) {
        for (Item actual : items) {
            if (actual.getName().equals(itemName)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Item not found!");
    }

    private void sellItem(User user, Item item) {
        user.addItem(item);
    }
}
