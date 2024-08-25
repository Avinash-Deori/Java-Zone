// Here we are learning File handling and creating a txt file in the code 

import java.io.*;
class FileH1{
    public static void main(String[] args) throws IOException
    {
        File f1 =new File("a.txt");


        // System.out.println(f1.exists());    no need of these codes because the file is already created
        // System.out.println(f1.canWrite());
        // System.out.println(f1.length());
        // f1.createNewFile();

        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());
    }
}