import java.util.Scanner;
public class Exception_Handing {
     public static void main(String[] args){
        Scanner get=new Scanner(System.in);
        System.out.println("enter the num1:");
        int num1=get.nextInt();
        System.out.println("enter the num2:");
        int num2=get.nextInt();
        try{
            System.out.println("the division value of num is="+(num1/num2));
       
        }
        catch(ArithmeticException e){
        System.out.println("no num cannot divis by 0");
        System.out.println("enter the num1:");
        num1=get.nextInt();
        System.out.println("enter the num1:");
        num2=get.nextInt();
        System.out.println("the division value of num is="+(num1/num2));

        }
        finally{
            System.out.println("the program is be exected succesfull");
        }

    
}
    
}
