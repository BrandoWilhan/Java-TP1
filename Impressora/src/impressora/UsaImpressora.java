
package impressora;

import java.util.Scanner;
//  @author mugen
 
public class UsaImpressora 
{

    
    public static void main(String[] args) 
    {
        Impressora impressora = new Impressora();
        
        impressora.bluetooth = true;
        impressora.colorida = true;
        impressora.copiadora = false;
        impressora.digitalizadora = true;
        impressora.ligada = false;
        impressora.papel = true;
        impressora.wifi = true;
        
        Scanner entrada = new Scanner(System.in);
        
        
        impressora.modelo = entrada.next();
        impressora.cor = entrada.next();
        impressora.tipoPapel = entrada.next();
        
        impressora.status();
        impressora.ligar();
        impressora.digitalizar();
        impressora.copiar();
        impressora.desligar();
        impressora.imprimir();
    }
    
}
