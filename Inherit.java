class Nokia1{
   private int x,y;
 
//  consatruct  to acces the private class using "super()""
//    Nokia1(int p,int q){
//     x=p;
//     y=q;
//     System.out.println("Parent Constructor Executed");
//    }


    void f1(){
         System.out.println("Parent function 1 executed,");
    }
    void f2(){
      System.out.println("Parent function 2 executed,");
    }
}

class Nokia2 extends Nokia1{
    int z;
    // super(6,7); to pass as a argumants to the prvate varibles
    // will learn more in the next class about super
    void f3(){
        System.out.println("Child function 1 executed,");
    }
}

class Inherit{
    public static void main(String []args){
        Nokia1 n2=new Nokia1();
        Nokia2 n1=new Nokia2();
        n1.f1();
        n1.f2();
        n1.f3();

    }
}