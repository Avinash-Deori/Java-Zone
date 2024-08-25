class ExceptionH2{
    public static void main(String []args){
        String s1=null;
        System.out.println("A");
        try{
        System.out.println(s1.length());
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e1){
             System.out.println(e1.getMessage());
        }

        catch(Exception e1){
             System.out.println(e1.getMessage());
        }
        finally{
             System.out.println("B");
        }
        // or instead of writing type of exceptions in different catches we can directly write Exception e1 where e1 is a referencing varibale and exception is 
        // a key word  or a sub class of throwable class which will catch any type of exception
    }
}