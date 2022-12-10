package converte;

import java.util.Scanner;

public class Converte 
{

    
    public static void main(String[] args) 
    {
        double temp;
        
        Scanner entrada = new Scanner(System.in);
        temp = entrada.nextDouble();
        
        Temperatura temperatura = new Temperatura(temp);
        temperatura.toFahr();
        
        System.out.println("temperatura: " + temperatura.toString() + " graus fahrenheit");
        
        temperatura.toCelcius();
        
        System.out.println("temperatura: " + temperatura.toString() + " graus celsius");
     
    
    
    }
    
}