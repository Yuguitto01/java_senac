
package mediaaluno;

import java.util.Scanner;

public class MEDIAaluno {

    
   
    public static void main(String[] args) {
   
       double nota1, nota2, nota3;
       double media;
       String aluno;
       
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Olá ");
        
        System.out.println("Digite seu nome ");
        aluno = entrada.nextLine();
        
        System.out.println("Digite sua primeira nota ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Digite sua segunda nota ");
        nota2 = entrada.nextDouble();
        
        System.out.println("Digite sua terceira nota ");
        nota3 = entrada.nextDouble();
        
        media = ( nota1 + nota2 + nota3 ) /3;
        
        System.out.println("Certo, " + aluno + " sua média é " + media);
        
        
    
        
        
    }
    
}
