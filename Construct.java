// class Demo{
//     int x,y;
//     Demo(){
//         System.out.println("Constructor 1 executed");
//     }
//     void f1(){
//          System.out.println("Constructor 1 executed");
//     }
// }

// class Construct{
//     public static void main(String []args){
//         Demo d1=new Demo();
//         Demo d2=new Demo();
//         Demo d3=new Demo();
//     }
// }


// Contructor overloading

class Demo{
    int x,y;
    Demo(int p,int q){
        x=p;
        y=q;
    }
    Demo(int f){
         
    }
    Demo(){
         
    }
}

class Construct{
    public static void main(String []args){
        Demo d1=new Demo(9,8);
        Demo d2=new Demo();
        Demo d3=new Demo();
    }
}