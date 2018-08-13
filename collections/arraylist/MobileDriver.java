package collections.arraylist;

import java.util.Scanner;

public class MobileDriver {
private static Scanner sc = new Scanner(System.in);
private static MobilePhone phone = new MobilePhone("10000");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		startPhone();
		printActions();
		
		while(!quit) {
			System.out.println("Which operation you want to execute: ");
			int action = sc.nextInt();
			sc.nextLine();
			switch(action) {
			case 0:
				System.out.println("System is shutting down");
				quit = true;
				break;
			case 1:
				phone.printContact();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				existingContact();
				break;
			case 6:
				phone.printContact();
				break;
			}
			
		}
		
		}
		public static void startPhone() {
			System.out.println("Starting Phone");
		}
		public static void printActions() {
			System.out.println("Enter your choice: ");
			System.out.println("0-Shutdown");
			System.out.println("1-PrintContact");
			System.out.println("2-Add new Contact");
			System.out.println("3-Update Contat");
			System.out.println("4-Remove Contact");
			System.out.println("5-query for existing contact");
			System.out.println("6-print a list of contacts");
			System.out.println("Choose your actions");
		}
		public static void addNewContact() {
			System.out.println("Enter Contact Name");
			String name= sc.nextLine();
			System.out.println("Enter Contact Number");
			String number = sc.nextLine();
			Contact newContact= Contact.createContact(name, number);
			if(phone.addNewContact(newContact)) {
				System.out.println("Contact added named as : "+newContact.getName());
			}
			else {
				System.out.println("Contact already present in list"+newContact.getName());
			}
		}
		public static void updateContact() {
			System.out.println("Enter old contact");
			String oldContactName = sc.nextLine();
			Contact existingRecord = phone.queryContact(oldContactName);
			if(existingRecord==null) {
				System.out.println("No contacts found in record");
				return;
			}
			System.out.println("Enter new contact ");
			String newName = sc.nextLine();
			System.out.println("Enter new Phone Number");
			String newNumber = sc.nextLine();
			Contact newContact = Contact.createContact(newName, newNumber);
			if(phone.updateContact(existingRecord, newContact)) {
				System.out.println("Contact added");
			}
			System.out.println("Error update recording");
			
		}
		public static void removeContact() {
			System.out.println("Enter contact to remove");
			String removeContactName = sc.nextLine();
			Contact existingRecord = phone.queryContact(removeContactName);
			if(existingRecord==null) {
				System.out.println("No contacts found in record");
				return;
			}
			if(phone.removeContact(existingRecord)) {
				System.out.println(existingRecord.getName()+" : Contact Removed");
				return;
			}
			System.out.println("Error while deleting record");
		}
		public static void existingContact() {
			System.out.println("Enter contact to Query");
			String queryContactName = sc.nextLine();
			Contact existingRecord = phone.queryContact(queryContactName);
			if(existingRecord==null) {
				System.out.println("No contacts found in record");
				return;
			}
			System.out.println("Found Contact Named as :"+existingRecord.getName()+"Phone number as: "+existingRecord.getPhoneNumber());
		}
}
