package ContactService;

public class Contact {
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        // Validate the contactId
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID must not be null and cannot be longer than 10 characters");
        }

        // Validate the firstName
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First Name must not be null and cannot be longer than 10 characters");
        }

        // Validate the lastName
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last Name must not be null and cannot be longer than 10 characters");
        }

        // Validate the phone
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Phone must not be null and must be exactly 10 digits");
        }

        // Validate the address
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and cannot be longer than 30 characters");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
