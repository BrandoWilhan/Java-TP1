package circulos;

import java.util.Scanner;

public class TestaCirculo 
{

    
    public static void main(String[] args) 
    {
        int x;
        int y;
        int raio;
        
        Scanner entrada = new Scanner(System.in);
                
        Circulo[] circulos = new Circulo[3];
        Circulo[] circulos2;        // instrucao 2
        Circulo[] circulos3 = new Circulo[3]; // instrucao 4
  
        circulos2 = circulos;       // instrucao 3
        
        for(int i = 0; i < 3; i++)       // instrucao 1
        {
            x = entrada.nextInt();
            y = entrada.nextInt();
            raio = entrada.nextInt();
            entrada.nextLine();

            circulos[i] = new Circulo(x, y, raio);
        }
            
        for(int i = 0; i < 3; i++) // instrucao 5
        {   
            circulos3[i] = new Circulo(circulos[i].getX(), circulos[i].getY(), circulos[i].getRaio());
        }
        
        for(int i = 0; i < 3; i++)       // instrucao 6
        {    
            circulos[i].setRaio(entrada.nextInt());
            entrada.nextLine();
        }
        
        System.out.println("vetor1:");
        for(int i = 0; i < 3; i++)
            System.out.printf("%d %d %d\n", circulos[i].getX(),
            circulos[i].getY(), circulos[i].getRaio());
       
        
        System.out.println("vetor2:");
        for(int i = 0; i < 3; i++)
            System.out.printf("%d %d %d\n", circulos2[i].getX(),
            circulos2[i].getY(), circulos2[i].getRaio());
 
        
        System.out.println("vetor3:");
        for(int i = 0; i < 3; i++)
            System.out.printf("%d %d %d\n", circulos3[i].getX(),
            circulos3[i].getY(), circulos3[i].getRaio());
       
    }
    
}
