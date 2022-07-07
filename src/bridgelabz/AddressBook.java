package bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {

	
	Contact person = new Contact();
    List<Contact> contact = new ArrayList<>();

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to enter");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {

//            checking the duplicate contact by contact name.
            System.out.println("Enter the first name of person");
            String fName = scanner.next();
            if (fName.equals(person.getFirstName())) {
                System.out.println("The entered person is already exist. Enter new name");
            }
            else {
                System.out.println("Enter the contact details of person ");
                addNewContact();
                System.out.println("contact added Successfully");
            }
        }
    }
    
    public void addNewContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();
        person = new Contact(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contact.add(person);
    }
    
    public void searchByName(String name) {
        List<Contact> collect = contact.stream().filter(s -> s.getFirstName().equalsIgnoreCase(name)).collect(Collectors.toList());
        for (Contact contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }

    public void searchByCity(String city) {
        List<Contact> collect = contact.stream().filter(s-> s.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        for (Contact contact1 : collect) {
            System.out.println("Result: " + contact1);
        }
    }
    
    
    
}
