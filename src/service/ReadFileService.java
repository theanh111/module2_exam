package service;

import java.io.*;

public class ReadFileService {
    public void readFile(String pathname) {
        String line = "";
        try {
            File file = new File(pathname);
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                String[] str = line.split(",");
                System.out.println("Phone Book [ Number phone = " + str[0] + " , Type = " + str[1] + ", Name = " + str[2] + " , Gender = " + str[3] + " , Address = " + str[4] +  ", Email = " + str[5] + " ]");
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}