/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/

import java.util.Scanner;
public class Ex03 {    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Equação de segundo gral, vamos precisar que informe a,b e c");
    System.out.println("Digite o valor do a: ");
    double a = sc.nextDouble();
    System.out.println("Digite o valor do b: ");
    double b = sc.nextDouble();
    System.out.println("Digite o valor do c: ");
    double c = sc.nextDouble();
    if (a == 0 && b == 0 && c != 0) { //Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de zero, apresentar a mensagem
        System.out.println("Numersos informados incorretamente.");
    } else if (a == 0 && b != 0) { //Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero
        System.out.println("Essa é uma equação de primeiro grau");
        double x1 = (-c / b); // raiz da equação de 1°grau
        System.out.println("A raiz real da equação é: " + x1);
    } else {
        double d = (b * b) - 4 * ( a * c); //delta
        if (d < 0) { //Caso o discriminante seja negativo,
            System.out.println("Não tem raiz real.");
        } else if (d == 0) { //Caso o discriminante seja zero
            System.out.println("Não possui raízes iguais.");
            double res = (-b / (2 * a));
            System.out.printf("A raiz é: %.5f",res );
        } else {//Caso o discriminante seja maior que zero
            double r1 = (-b + Math.sqrt(d)) / (2 * a); // tira a raiz quadrada
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Possui duas raízes diferentes.");
            System.out.printf("As raízes da equação são: %.5f e  %.5f" ,r1,r2);
        }
    }
    sc.close();
    }
}
/*Anotações
Variaveis utilizadas: 
double a,b,c,x1,r1,r2,res
*/ 