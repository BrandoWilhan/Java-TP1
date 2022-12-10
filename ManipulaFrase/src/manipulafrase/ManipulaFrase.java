package manipulafrase;

import java.util.Scanner;

//@author mugen

public class ManipulaFrase
{

    
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        Frase frase1 = new Frase(entrada.nextLine()); 
        
        System.out.println(frase1.contarPalavras());
       
        Frase frase2 = new Frase(entrada.nextLine()); 
        
        System.out.println(frase2.contarVogais());
    
    }
}