// 2nd Important code on Multithreading every thing that i have learned about Multithreading

import java.util.Scanner;
class Account{
    int bal;
    int wb;
Account(int b){
bal=b;

}
public boolean isSufficientBal(int b){
    if(bal>wb)
    return true;
    else
    return false;
    
}

public void withdraw(int wb){
bal=bal-wb;
System.out.println("Withdrawal Successful");
System.out.println("Current Bal is : "+bal);
}

}


class Customer implements Runnable{
Account h1;
String name;
Customer(Account g1,String j1){
h1=g1;
name=j1;
}
 public void run(){
   
    Scanner s1 =new Scanner(System.in);
   synchronized(h1){
    System.out.println(name+ "Enter Amount");
    int amt=s1.nextInt();
    if(h1.isSufficientBal(amt)){
        h1.withdraw(amt);
    }else{
        System.out.println(name+ " Insufficient Balance");
    }
    }
 }


}


class MultiT3{
    public static void main(String []args){
        Account a1=new Account(1000);
        Customer c1=new Customer(a1,"Batman");  //same account is being accessed by the two customers
        Customer c2=new Customer(a1,"Superman");

        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}