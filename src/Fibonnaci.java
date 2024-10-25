import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, c=a+b;
        for (int i=0;i<=10;i++){
            int soma = a+i;
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }

    }
}