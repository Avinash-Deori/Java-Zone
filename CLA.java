// COMMAND LINE ARUGUMENTSS

// here we are learning aboubt the command line arguments in java i.e string []args
// we can print the data after the compilation when we ran the code at that time we have to give the input
// class CLA{
// public static void main(String []args){

// System.out.println(args[0]);
// System.out.println(args[1]);
// System.out.println(args[2]);
// System.out.println(args[3]);
// System.out.println(args[4]);

// }
// }

// when we run it java CLA 11 12 13 14  just like this we have to print it

// or 

// class CLA{
// public static void main(String []args){
//     int i;
// for(i=0;i<length;i++){
// System.out.println(Integer.parseInt(args[i]));
// }


// }
// }


// to find the average

class CLA{
public static void main(String []args){
int i,s=0;
for(i=0;i<args.length;i++){
s=s+Integer.parseInt(args[i]);
}
System.out.println("Average is :"+s/args.length);

}
}
