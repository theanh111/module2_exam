package service;

import model.PhoneBook;

import java.io.*;
import java.util.List;

public class WriteFileService {
    public void writeFile(String pathname, List<PhoneBook> list) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(pathname));
            for (int i = 0; i < list.size(); i++) {
                outputStream.writeObject(list.get(i));
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
