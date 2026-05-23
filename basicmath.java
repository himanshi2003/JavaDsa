public class basicmath {
    static void printdigit(int num){
        while(num!=0){
            int digit =num%10;
            System.out.println(digit);
            num=num/10;

        }
    }
    public static void main(){
        int num=9988652;
        printdigit(num);

    }
}
