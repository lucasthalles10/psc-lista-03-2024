/* UC: PSC     Data: 12/03/2024
Nome: Lucas Thalles Santos Lelis      Versão 1°/2024
Programa: Java                    RA:42413970*/
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("Vamos ler 3 numeros e apresentar o maior o menos e a media");
        System.out.println("Digite um numero inteiro:");
        int nun1 = sc.nextInt();
        System.out.println("Digite um numero inteiro:");
        int nun2 = sc.nextInt();
        System.out.println("Digite um numero inteiro:");
        int nun3 = sc.nextInt();
        int me = nun1;
        int ma = nun1;
        //Calcula o menor 
        if (nun2 < me){
            me = nun2;
        }
        if (nun3 < me){
            me = nun3;
        }
        //Calcula o maior
        if (nun2 > ma) {
            ma = nun2;
        }
        if (nun3 > ma) {
            ma = nun3;
        }
        int med = (nun1 + nun2 + nun3) /3;
        System.out.println("O maior numero é: " + ma);
        System.out.println("O menor numero é: " + me);
        System.out.println("A média dos três numeros é: " + med);

        sc.close();
    }
    
}
/*Anotações:
Variaveis utilizadas:
int nun1,nun2,nun3,me,ma,med.

Foi usado if para fazer a condição do maior e menor numero 
 */