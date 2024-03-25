import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua idade em dias?");
        int idadeD = sc.nextInt();
        sc.nextLine();
        System.out.println("Sua idade é: " + (idadeD/365) +" Anos " + (idadeD/365)*12+ " meses " + idadeD + " dias ");
    }
}
