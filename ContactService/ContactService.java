package ContactService;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contacts.containsKey(contactId)) {
            Contact existingContact = contacts.get(contactId);

            // Update fields
            existingContact = new Contact(contactId, firstName, lastName, phone, address);

            // Update in the map
            contacts.put(contactId, existingContact);
        }
    }
    public Map<String, Contact> getContacts() {
        return contacts;
    }
    

}

