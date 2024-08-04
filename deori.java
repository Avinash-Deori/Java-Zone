// in this file we will only create the class and obj with main func  in another file
// we will create the main function in another file

package package1;
public class deori{
    private int x;
    private int y;
    public void setData(int p,int q)
    {
        x=p;
        y=q;

    }
    public void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
}

// to create package we have to compile it like this --> javac -d . deori.java
// and it will create a folder
// and to run it we have to commad it like this : java package1.deori