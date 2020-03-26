package Java2_03;

import java.util.ArrayList;

public class ContactList{
    private ArrayList<Contact> contactList= new ArrayList<>();

    public static void main(String[] args) {
        ContactList list= new  ContactList();
        list.addContact();
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }
    public void updateContact(int index, Contact contact) {
        contactList.set(index, contact);
        System.out.println("Update: Contact "+(index+1)+": "+contact);
    }

    public void removeContact(int index) {
        Contact contact=contactList.get(index);
        contactList.remove(index);
        System.out.println("Remove : Contact "+(index+1));
    }

    public Contact searchContact(String search) {
        int position= contactList.indexOf(search);
        if(position>0){
            return contactList.get(position);
        }
        return null;
    }

    public void displayList() {
        System.out.println("The list of contact:");
        System.out.println(contactList);
    }
}
