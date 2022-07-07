package bridgelabz;

import java.util.Scanner;

public class MultipleAddressBook {

	
	public void addAddressBook() {
        System.out.println("Enter Name of new Address Book: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address book with this name exists, Enter new name.");
            addAddressBook();
        }
        else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(bookName, addressBook);
            System.out.println("added addressbook");
            System.out.println("still want to add another book press 1 for yes and 2 for no");
            int ch = scanner.nextInt();
            if (ch == 1) {
                addAddressBook();
            }
            else
                System.exit(0);
            }
        }
}
