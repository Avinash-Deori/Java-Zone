// Using runnable interface

class P1 extends Thread{
public void run(){
int i;
for (i=1;i<=10;i++){
    System.out.println("Process1:"+i);
}
}
}

class P2 extends Thread {
public void run(){
int i;
for (i=1;i<=10;i++){
    System.out.println("Process2:"+i);
}
}


}

class MultiT2{
    public static void main(String[] args){
        P1 p1 =new P1();
        P2 p2=new P2();
    
        p1.start();
        p2.start();
    }
}