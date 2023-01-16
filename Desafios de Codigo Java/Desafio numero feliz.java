// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
             int n = scan.nextInt();
            //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
            System.out.println(feliz(n));
    	}
    	
    	public static boolean feliz(int n) {
    String text = String.valueOf(n);
    if(text.length() == 1) {
        return Integer.parseInt(text) == 1;
    } do {
        String[] vet = text.split("");
        int soma = 0;
        for (int x = 0; x < vet.length; x++) {
            int value = Integer.parseInt(vet[x]);
            soma += (value * value);
        }
        String somaText = String.valueOf(soma);
        if(somaText.length() == 1) {
            return Integer.parseInt(somaText) == 1;
        }
        text = somaText;
    } while (text.length() != 1);
    return false;
}
    	
}