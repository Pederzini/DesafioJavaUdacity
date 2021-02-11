package Classes;

public class Main {

    public static void main(String[] args) {
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        // Create a new Contact object for Mimzy
        Contact friendMimzy = new Contact();
        // Set the fields
        friendMimzy.name = "Mimzy";
        friendMimzy.phoneNumber = "98171-8148";
        // Add Mimzy Contact to the ContactsManager
        myContactsManager.addContact(friendMimzy);

        // Create a new Contact object for Lilica
        Contact friendLilica = new Contact();
        // Set the fields
        friendLilica.name = "Lilica";
        friendLilica.phoneNumber = "99117-8823";
        // Add Lilica Contact to the ContactsManager
        myContactsManager.addContact(friendLilica);

        // Create a new Contact object for Zequinho
        Contact friendZequinho = new Contact();
        // Set the fields
        friendZequinho.name = "Zequinho";
        friendZequinho.phoneNumber = "98669-5090";
        // Add Zequinho Contact to the ContactsManager
        myContactsManager.addContact(friendZequinho);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Mimzy");
        System.out.println(result.phoneNumber);
    }
}
