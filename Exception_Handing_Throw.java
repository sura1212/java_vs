import java.util.Scanner;
import java.io.*;

public class Exception_Handing_Throw {
    public static void readFile() throws IOException{
        FileReader text=new FileReader("Pattern.java");
        System.out.println("file open");
    }
     public static void main(String[] args) {
        try{
            readFile();
        }
        catch(IOException e){
            System.out.println("something goes wromg");

        }
       /* Scanner get=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=get.nextInt();
        if(age<18){
            throw new ArithmeticException("not can vote");

        }
        System.out.println("the person can vote");*/
    }
    
}
