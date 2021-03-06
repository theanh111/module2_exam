package service;

import model.PhoneBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneBookManagement implements IService<PhoneBook> {
    static List<PhoneBook> phoneBookList;

    static {
        phoneBookList = new ArrayList<>();
//        phoneBookList.add(new PhoneBook(585200, "Family", "John", "Male", "USA", "12-05-1999", "john@gmail.com"));
//        phoneBookList.add(new PhoneBook(681589, "Company", "Ken", "Male", "Ha Noi", "2-5-1992", "ken@gmail.com"));
    }

    @Override
    public List<PhoneBook> viewAll() {
        List<PhoneBook> phoneBooks = new ArrayList<>();
        Iterator<PhoneBook> iterator = phoneBookList.iterator();
        while (iterator.hasNext()) {
            phoneBooks.add(iterator.next());
        }
        return phoneBooks;
    }

    @Override
    public void add(PhoneBook phoneBook) {
        boolean flag = true;
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (phoneBook.getNumberPhone() == phoneBookList.get(i).getNumberPhone()) {
                flag = false;
                break;
            }
        }
        if (flag) {
            phoneBookList.add(phoneBook);
        }
    }

    @Override
    public void update(int numberPhone, PhoneBook phoneBook) {
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (numberPhone == phoneBookList.get(i).getNumberPhone()) {
                phoneBookList.set(i, phoneBook);
            }
        }
    }

    @Override
    public void delete(int numberPhone) {
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (numberPhone == phoneBookList.get(i).getNumberPhone()) {
                phoneBookList.remove(i);
            }
        }
    }

    @Override
    public List<PhoneBook> findByName(String name) {
        List<PhoneBook> newPhoneBook = new ArrayList<>();
        for (int i = 0; i < phoneBookList.size(); i++) {
            if (name.equals(phoneBookList.get(i).getName())) {
                newPhoneBook.add(phoneBookList.get(i));
            }
        }
        return newPhoneBook;
    }
}
