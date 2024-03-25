import java.util.Scanner;
 
public class Ex03 {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome");
        String nome = sc.nextLine();
        System.out.println("Insira o seu salário");
        double salario = sc.nextDouble();
        if(salario <= 4664.68){
            System.out.println("Desconto do IRPF:" + (salario*27.5)/100);
        }
        else if(salario <= 4664.68 && salario >= 3751.06 ){
            System.out.println("Desconto do IRPF:" + (salario*22.55)/100);
        }else if(salario <= 3751.05 && salario >= 2826.66){
            System.out.println("Desconto do IRPF:" + (salario*15)/100);
        } else if(salario <= 2259.21 && salario >= 2826.65){
            System.out.println("Desconto do IRPF:" + (salario*7.5)/100);
        }
        else if(salario <= 2259.21){
            System.out.println("Isento de desconto");
        }
        sc.close();        
    }
}