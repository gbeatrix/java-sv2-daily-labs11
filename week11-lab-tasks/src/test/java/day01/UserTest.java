package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void testNormalUser() {
        User normalUser = new NormalUser("normaluser@email.hu", "Ez1SzuperTitkosJelszó!");
        assertEquals("normaluser@email.hu", normalUser.getUserEmail());
        assertEquals("Ez1SzuperTitkosJelszó!", normalUser.getPassword());
    }

    @Test
    void testAdminUser() {
        User adminUser = new AdminUser("adminuser@email.hu", "70pS3cr37!");
        assertEquals("adminuser@email.hu", adminUser.getUserEmail());
        assertEquals("**********", adminUser.getPassword());
    }
}