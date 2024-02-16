package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        assertTrue(contactService.getContacts().containsKey("1"));
    }

    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.deleteContact("1");

        assertFalse(contactService.getContacts().containsKey("1"));
    }

    @Test
    public void testUpdateContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);

        contactService.updateContact("1", "Jane", "Smith", "9876543210", "456 Oak St");

        Contact updatedContact = contactService.getContacts().get("1");
        assertEquals("Jane", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("9876543210", updatedContact.getPhone());
        assertEquals("456 Oak St", updatedContact.getAddress());
    }
}
