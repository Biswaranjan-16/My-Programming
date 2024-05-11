package JavaIO;

import java.io.*;

public class filedirectory {
     public static void main(String a[])
     {
        File file = new File("D:\\Otz full stack\\otz fsd pdf");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}