package service;

import java.io.*;

public class ReadFileService {
    public void readFile(String pathname) {
        String line = "";
        try {
            File file = new File(pathname);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                System.out.println("Phone Book [ Number phone = " + str[0] + " , Type = " + str[1] + ", Name = " + str[2] + " , Gender = " + str[3] + " , Address = " + str[4] +  ", Email = " + str[5] + " ]");
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFBinaryFile(String pathname) {
        try {
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(pathname));
            System.out.println(readFile.readObject());
            readFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}