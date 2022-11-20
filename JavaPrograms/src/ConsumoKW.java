import java.util.Scanner;
        
public class ConsumoKW 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        float kilowatts;
        float consumoTotal;
        float consumo;
        float taxa = 5.00f;
        
        Scanner entrada = new Scanner(System.in);
        kilowatts = entrada.nextFloat();
        
        if(kilowatts > 1000)
            consumo = 350 + (kilowatts - 1000)*0.1f;
        else if(kilowatts > 500)
            consumo = 50 + (kilowatts - 500)*0.05f;
        else
            consumo = 0.02f*kilowatts;
        
        consumoTotal = consumo + taxa;
        
        System.out.printf("%.2f %.2f %.2f\n", consumo, taxa, consumoTotal);
                     
    }
    
}