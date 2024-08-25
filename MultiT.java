// Using runnable interface

class P1 implements Runnable{
public void run(){
int i;
for (i=1;i<=10;i++){
    System.out.println("Process1:"+i);
}
}
}

class P2 implements Runnable {
public void run(){
int i;
for (i=1;i<=10;i++){
    System.out.println("Process2:"+i);
}
}


}

class MultiT{
    public static void main(String[] args){
        P1 p1 =new P1();
        P2 p2=new P2();
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        t1.start();
        t2.start();
    }
}