// In this program i had learn how to access private  member using a fucntion member in the main function by creating object  in the main function for the 
// private member class


class Nokia{
    private int mic;
    private int cam;
    void setvalue(){
        mic=22;
        cam=44;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);
    }

}
class classandobject {
    public static void main(String []args){
        Nokia n1 =new Nokia();
        n1.setvalue();
        n1.display();
    }
}

