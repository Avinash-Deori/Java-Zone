abstract class Demo1{
    int x,y;
    void f1(){
        x=5;
        y=9;
    }

    abstract void f2();
    Demo1(){
        System.out.println("Abstract class contructor executed");
    }
}

class Demo2 extends Demo1{
    int z;
    void f3(){
        z=8;

    }
    void f2(){
        
    }
    Demo2(){
        System.out.println("Child class contructor executed");
    }
}

class abs{
    public static void main(String []args){
     Demo2 d1=new Demo2();  // with the help of super keyword we the constructor of the parent class will be executed
        
    }
}