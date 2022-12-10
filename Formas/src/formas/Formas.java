package formas;

import java.util.Scanner;




public class Formas 
{

    
    public static void main(String[] args) 
    {
        int compr;
        int larg;
        int perimetro;
        int area;
        
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo();
        
        Scanner entrada = new Scanner(System.in);
        
        compr = entrada.nextInt();
        larg = entrada.nextInt();
        
        retangulo1.setComprimento(compr);
        retangulo1.setLargura(larg);
        
        entrada.nextLine();
        
        compr = entrada.nextInt();
        larg = entrada.nextInt();
        
        retangulo2.setComprimento(compr);
        retangulo2.setLargura(larg);
        
         
        
        System.out.printf("%d %d %d %d\n", retangulo1.getComprimento(),
   retangulo1.getLargura(), retangulo1.perimetro(), retangulo1.area());
        
        System.out.printf("%d %d %d %d\n", retangulo2.getComprimento(),
   retangulo2.getLargura(), retangulo2.perimetro(), retangulo2.area());
        
    }
    
}
