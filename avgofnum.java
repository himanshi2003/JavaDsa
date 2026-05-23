import java.util.Scanner;

public class avgofnum {

    public  static double avgofnum(int a, int b, int c){
        return(a+b+c)/3.0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num");
        int num1= sc.nextInt();

        System.out.println("enter second num");
        int num2= sc.nextInt();

        System.out.println("enter third num");
        int num3= sc.nextInt();

        double avg=avgofnum(num1,num2,num3);
        System.out.println(avg);


    }
}
