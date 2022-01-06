package day03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user = new User("John", 120_000);

    @Test
    void addItemTest() {
        Item item = new Product("milk", 100);

        user.addItem(item);

        assertEquals(119_890, user.getMoney());
        assertEquals(LocalDate.of(2025, 1, 6), user.getItems().get(0).expiryDate);
        assertEquals("milk", user.getItems().get(0).getName());
        assertEquals("John", user.getUserName());
    }

    @Test
    void addItemNotEnoughMoney() {
        Item item = new Product("tv", 120_001);

        IllegalArgumentException expected = assertThrows(IllegalArgumentException.class,
                () -> user.addItem(item));

        assertEquals("Not enough money.", expected.getMessage());
    }

    @Test
}