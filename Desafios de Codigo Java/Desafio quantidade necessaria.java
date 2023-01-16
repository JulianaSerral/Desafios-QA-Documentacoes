// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();

        // TODO: Retorne o número de pizzas necessárias para atender o pedido. 
        for(int i = 1; i <= T; i++) {
    double amigos = (scanner.nextInt() * scanner.nextInt());
    double quantPizzasN = Math.ceil(amigos / SLICE);
    System.out.println((int)quantPizzasN);
}
        
    }
}