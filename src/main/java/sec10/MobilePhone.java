package sec10;

import java.util.ArrayList;

public class MobilePhone {

    public static void main(String[] args) {
        MobilePhone p = new MobilePhone("john");

        p.addNewContact(new Contact("a", "1"));
        p.printContacts();
        p.addNewContact(new Contact("a", "1"));
        p.printContacts();
    }

    private String myNumber;
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact old_contact, Contact new_contact) {
        int index = findContact(old_contact);
        if (index != -1) {
            this.myContacts.set(index, new_contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index != -1) {
            this.myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
//        System.out.printf("findContact.contact - %s - %s%n", contact.getName(), contact.getPhoneNumber());
        return findContact(contact.getName());
    }

    private int findContact(String name) {
//        System.out.printf("findContact.name - %s%n", name);
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (name.equals(this.myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index != -1) {
            return this.myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact list:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s%n",
                    i+1, this.myContacts.get(i).getName(), this.myContacts.get(i).getPhoneNumber());
        }
    }
}
