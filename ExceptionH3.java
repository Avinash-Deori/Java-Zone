class ExceptionH3{
    public static void main(String []args){
    int cb = 10000;
    int wb=11111;
 try{
    if(cb<wb){
        throw new ArithmeticException("Insufficient Balance");
        we can also write it as this
        // throw new Exception("Insufficient Balance");
    }
    cb=cb-wb;
    System.out.println("Transaction Successful");

    System.out.println("Current Balance is : "+cb);
 }
 catch(ArithmeticException e1){
    // we can also write is as this
//    catch(Exception e1){
    System.out.println(e1.getMessage());
    System.out.println("Current Balance is :"+cb);
 }
   
   
    }
}