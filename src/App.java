import java.util.Scanner;

public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double  raio;
        double area;
        double PI = 3.14;

        // Solicitação de Dados
        Scanner input = new Scanner (System.in);
        System.out.println ("Digite o valor do raio de um círculo:" );
        raio = input.nextDouble();
        

        // Calcular o Raio
        area = PI * raio * raio;

        // Exibir a Resposta Para o Usuário
        System.out.printf ("A área do círculo é : " + area);
        
    }
}
