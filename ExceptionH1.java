class ExceptionH1{
    public static void main(String [] args){
        String s1=null;
        System.out.println("A");
        try{
        System.out.println(s1.length());
        }
        catch(NullPointerException n1){
            System.out.println(n1.getMessage());
        }

        try{
        System.out.println(6/0);
        }
        // we can have multiple catch with a try
        catch( ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        System.out.println("B");

    }
}