// THIS keyword

// class Example{
//     private int x,y;
//     void f1(int x,int y){
//         this.x=x;
//         this.y=y;
//     }
//     void display(){
//         System.out.println(x);
//         System.out.println(y);
//     }
// }


// class thisk{
//     public static void main(String []args){
//         Example e1=new Example();
//         e1.f1(5,9);
//         e1.display();
//     }
// }




// Super key word


class Example{
     int x,y;
    void f1(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
 class Example1 extends Example{
    int x,y;
    void f3(int x, int y){
        super.x=x;
        super.y=y;
    }
    void f4(){
        System.out.println(super.x);    //here we have use the super keyword so that it place the arguments to the parents class varibale
        System.out.println(this.y);
    }
 }

class thisk{
    public static void main(String []args){
        Example1 e1=new Example1();
        e1.f1(5,9);
        e1.f4();
    }
}