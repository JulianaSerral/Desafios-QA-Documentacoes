 IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    
    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
      
   int valorSobra = M - S;

int percentualDesconto = (valorSobra * 100) / M;

System.out.println("O desconto foi de " + percentualDesconto + "%");

  
}
}