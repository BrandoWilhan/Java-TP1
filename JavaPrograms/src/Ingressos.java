
import java.util.Scanner;


public class Ingressos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int homens = 0;
        int mulheres = 0;
        float totalH = 0;
        float totalM = 0;
        float total;
        float ingressoH = 12.5f;
        float ingressoM = 7.4f;
        char in = 's';
        
        Scanner entrada = new Scanner(System.in);
        
        
        while(in != 'q')
        {
            in = entrada.next().charAt(0);
            
            if(in == 'h')
            {
                homens++;
                totalH += ingressoH;
                
            }
            if(in == 'm')
            {
                mulheres++;
                totalM += ingressoM;
            }
        }
        total = totalH + totalM;
        System.out.printf("%.2f %.2f %.2f", totalH, totalM, total);
    }
    
}
