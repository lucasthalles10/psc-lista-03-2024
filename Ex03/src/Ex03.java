/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/

import java.util.Scanner;
public class Ex03 {    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ecuação de segundo gral, vamos precisar dos coeficientes a,b e c");
    System.out.println("Digite o valor do a: ");
    double a = sc.nextDouble();
    System.out.println("Digite o valor do b: ");
    double b = sc.nextDouble();
    System.out.println("Digite o valor do c: ");
    double c = sc.nextDouble();

    if (a == 0 && b == 0 && c != 0) {
        System.out.println("Coeficientes informados incorretamente.");
    } else if (a == 0 && b != 0) {
        System.out.println("Essa é uma equação de primeiro grau");
        System.out.println("A raiz real da equação é: " + (-c / b));
    } else {
        double delta = (b * b) - 4 * ( a * c);
        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
            double res = (-b / (2 * a));
            System.out.printf("A raiz real da equação é: %.5f",res );
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            System.out.printf("As raízes da equação são: %.5f e  %.5f" ,r1,r1);
        }
    }
    sc.close();
    }
}