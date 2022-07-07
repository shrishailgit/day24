package bridgelabz;

import java.util.Scanner;

public class Main {

	
	 public void choose() {  
	 AddressBook AddressBook = new AddressBook();
	 MultipleAddressBook  multipleAddressBook =new MultipleAddressBook()
	 
     while (true) {
         System.out.println("1. add AddressBook\n 2.AddressBook operations\n 3. To delete the AddressBook\n " +
                 "4. To Print the AddressBook\n 5. To Print the contacts in AddressBook\n 0. to exit");
         Scanner scanner = new Scanner(System.in);
         int choice = scanner.nextInt();
         switch (choice) {
             case 1:
            	 multipleAddressBook.addAddressBook();
                 break;
             case 2:
            	 multipleAddressBook.addressBookOperations();
                 break;
         
             default:
                 System.out.println("Enter the wrong input");
         }
     }
}
 public static void main(String[] args) {
    	
    	Main main=new Main();
    	main.choose();
    	
    	
		
    	
	}

    }



