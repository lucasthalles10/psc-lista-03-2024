/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/
import java.util.Scanner;
public class Ex05 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    double n1 = sc.nextDouble();
    System.out.print("Digite o segundo número: ");
    double n2 = sc.nextDouble();
    System.out.print("Digite o símbolo que deseja usar: (+) (-) (*) (/) (^): ");
    char op = sc.next().charAt(0); // leitor de string e conversor de caracter, pega o primeiro caractere  
    double resultado = 0;// inicializei a variavel para nao dar erro 
    switch (op) {
        case '-':
        resultado = n1 - n2; //Subtrai
            break;
        case '+':
            resultado = n1 + n2; //soma
            break;
        case '/':
            resultado = n1 / n2; //divide 
            break;
        case '*':
            resultado = n1 * n2; //multiplica
            break;
        case '^':
            resultado = Math.pow(n1, n2); //realiza a potencia de um numero especificado
            break;
        default:
            System.out.println("simbolo incorreto.");
            System.exit(0); // Encerra o programa caso o símbolo seja inválido
    }
        System.out.println("Resultado: " + resultado);
        sc.close();
}
}
/*Anotações  
  Variaveis utilizadas: 
 double n1,n2,
 char  op
*/
