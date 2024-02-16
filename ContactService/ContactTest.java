package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    @Test
    void testValidContact() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");

        assertEquals("1", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testInvalidContactId() {
        // Contact ID longer than 10 characters should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    void testInvalidFirstName() {
        // First name longer than 10 characters should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "JohnJohnJohn", "Doe", "1234567890", "123 Main St");
        });
    }

    @Test
    void testInvalidLastName() {
        // Last name longer than 10 characters should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "DoeDoeDoeDoe", "1234567890", "123 Main St");
        });
    }

    @Test
    void testInvalidPhone() {
        // Phone number not exactly 10 digits should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Doe", "123456789", "123 Main St");
        });
    }

    @Test
    void testInvalidAddress() {
        // Address longer than 30 characters should throw an exception
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Doe", "1234567890", "123 Main St, Apartment 456, Very Long Street Name");
        });
    }
}

