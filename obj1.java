class Mahesh{
    int x;    //instance(object) member variable
    int y;       //instance(object) member variable
    void fun1(){         //instance(object) member function
        System.out.println("Batman");
    }

void fun2(){           //instance(object) member function
    System.out.println("Superman");
}
}

class obj1 {
    public static void main(String []args)
    {
        Mahesh m1=new Mahesh();
        Mahesh m2=new Mahesh();
        m1.x=5;
        m2.x=5;

        System.out.println(m1.x);
        System.out.println(m2.x);
        System.out.println("hello");
        System.out.println(m1.y);
    }
}
