// In this program i had learn how to access private  member using a fucntion member in the main function by creating object  in the main function for the 
// private member class

class A{
    int x;
    private static int y;
    void fun1(){
        y=22;
    }
    void fun2(){
        System.err.println(y);
    }
    void fun3(){
        y=45;
    }
}

public class Static {
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        a1.fun1();;
        a2.fun3();
        a1.fun2();
    }
}
