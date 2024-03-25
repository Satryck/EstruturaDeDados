import java.util.Scanner;
 
public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Insira o segundo número");
        double n2 = sc.nextDouble();
       
        System.out.println(n1 + " + "+ n2 + " = " + (n1+n2)
        + "\n" + n1 + " - "+ n2 + " = " + (n1-n2)
        + "\n" + n1 + " x "+ n2 + " = " + (n1*n2)
        + "\n" + n1 + " / "+ n2 + " = " + (n1/n2));
        sc.close();
    }
}