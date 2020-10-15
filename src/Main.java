import model.PhoneBook;
import service.PhoneBookManagement;
import service.ReadFileService;
import service.WriteFileService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<PhoneBook> phoneBookList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        PhoneBookManagement phoneBookManagement = new PhoneBookManagement();
        int choice = -1;
        while (choice != 0) {
            displayMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("---- The list ----");
                    phoneBookList = phoneBookManagement.viewAll();
                    viewList(phoneBookList);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("--- Adding a new phonebook ---");
                    System.out.println("Phone number");
                    int phoneNumber = input.nextInt();
                    System.out.println("Type of phonebook: ");
                    String typePhoneBook = input.nextLine();
                    System.out.println("Name: ");
                    String name = input.nextLine();
                    System.out.println("Gender (Male/Female): ");
                    String gender = input.nextLine();
                    System.out.println("Address: ");
                    String address = input.nextLine();
                    System.out.println("Date of birth (DD-MM-YYYY): ");
                    String date = input.nextLine();
                    System.out.println("Email: ");
                    String email = input.nextLine();

                    PhoneBook phoneBook = new PhoneBook(phoneNumber, typePhoneBook, name, gender, address, date, email);

                    phoneBookManagement.add(phoneBook);
                    phoneBookList = phoneBookManagement.viewAll();
                    viewList(phoneBookList);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("--- Updating a phonebook ---");
                    System.out.println("Input a numberphone in phone book to update: ");
                    int numberPhoneToUpdate = input.nextInt();
                    System.out.println("= Updating = ");
                    System.out.println("Numberphone: ");
                    int numberPhoneUpdate = input.nextInt();
                    System.out.println("Type of phonebook: ");
                    input.nextLine();
                    String typePhoneBookToUpdate = input.nextLine();
                    System.out.println("Name: ");
                    String nameUpdate = input.nextLine();
                    System.out.println("Gender (Male/Female): ");
                    String genderToUpdate = input.nextLine();
                    System.out.println("Address: ");
                    String addressToUpdate = input.nextLine();
                    System.out.println("Date of birth (DD-MM-YYYY): ");
                    String dateToUpdate = input.nextLine();
                    System.out.println("Email: ");
                    String emailToUpdate = input.nextLine();
                    phoneBookManagement.update(numberPhoneToUpdate, new PhoneBook(numberPhoneUpdate, typePhoneBookToUpdate, nameUpdate, genderToUpdate, addressToUpdate, dateToUpdate, emailToUpdate));
                    phoneBookList = phoneBookManagement.viewAll();
                    viewList(phoneBookList);
                    break;

                case 4:
                    System.out.println();
                    System.out.println("--- Deleting a phonebook ---");
                    System.out.println("Input a number phone in phone book to delete: ");
                    input.nextLine();
                    int numberPhoneToUpate = input.nextInt();
                    phoneBookManagement.delete(numberPhoneToUpate);
                    phoneBookList = phoneBookManagement.viewAll();
                    viewList(phoneBookList);
                    break;

                case 5:
                    System.out.println();
                    System.out.println("--- Finding a phonebook by name ---");
                    System.out.println("Input a name in phone book to find: ");
                    input.nextLine();
                    String nameToFind = input.nextLine();
                    viewList(phoneBookManagement.findByName(nameToFind));
                    break;

                case 6:
// // Đọc file với pathname ngẫu nhiên:
//                    System.out.println();
//                    System.out.println("--- Read a file ---");
//                    System.out.println("Input a pathname to read: ");
//                    input.nextLine();
//                    String pathNameToRead = input.nextLine();
//                    ReadFileService readFileService = new ReadFileService();
//                    readFileService.readFile(pathNameToRead);
//                    break;

                    // // Đọc file từ file csv bài thi Module 2:
                    System.out.println();
                    System.out.println("--- Read a file ---");
                    ReadFileService readFileService = new ReadFileService();
                    readFileService.readFile("D:\\CodeGym\\Module_02\\untitled3\\src\\contacts.csv");
                    break;

                case 7:
                    System.out.println();
                    System.out.println("--- Write a file ---");
                    System.out.println("Input a pathname to write: ");
                    input.nextLine();
                    String pathNameToWrite = input.nextLine();
                    WriteFileService writeFileService = new WriteFileService();
                    writeFileService.writeFile(pathNameToWrite, phoneBookList);

                case 8:
                    System.out.println("--- Exiting... ---");
                    System.exit(0);
            }
        }
    }

    public static void viewList(List<PhoneBook> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("---- PHONEBOOK MANAGEMENT APPLICATION ----");
        System.out.println("Choose a choice to continue: ");
        System.out.println("1. View List");
        System.out.println("2. Add ");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Find by name");
        System.out.println("6. Read from file");
        System.out.println("7. Write to file");
        System.out.println("8. Exit");
        System.out.println("Input a choice: ");
    }
}
