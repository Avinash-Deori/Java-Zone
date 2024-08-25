

// Here we will learn about compile time exception 

// In the below code we are telling java to catch the exception by itself

// import java.io.*;

// class ExceptionH4{
//     public static void main(String[] args) throws IOException,ClassNotFoundException
//     {
//         System.out.println("A");
       
//         throw new IOException();
//         //  System.out.println("B");
//     }
// }

// In the below code we are catching it by ourself

import java.io.*;

class ExceptionH4{
    public static void main(String[] args) 
    {
        System.out.println("A");
       try{
        throw new IOException("Printer Not Found");
       }
       catch(IOException e1){
        System.out.println(e1.getMessage());
       }
        //  System.out.println("B");
    }
}