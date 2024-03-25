import java.util.Scanner;
 
public class Ex02 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome");
        String nome = sc.nextLine();
        System.out.println("Insira o seu salário");
        double salario = sc.nextDouble();
        if(salario <= 7786.02 && salario >= 4000.04){
            System.out.println("Desconto do INSS:" + (salario*14)/100);
        }
        else if(salario <= 4000.03 && salario >= 2666.69){
            System.out.println("Desconto do INSS:" + (salario*12)/100);
        }else if(salario <= 2666.68 && salario >= 1412.01){
            System.out.println("Desconto do INSS:" + (salario*9)/100);
        }
        else if(salario <= 1412.00){
            System.out.println("Desconto do INSS:" + (salario*7.5)/100);
        }
        sc.close();        
    }
}