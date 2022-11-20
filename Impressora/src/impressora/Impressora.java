

package impressora;


public class Impressora {
    public String modelo;
    public String cor;
    public String tipoPapel;
    public boolean bluetooth;
    public boolean wifi;
    public boolean colorida;
    public boolean ligada;
    public boolean papel;
    public boolean digitalizadora;
    public boolean copiadora;
    
    public void ligar()
    {
        if(ligada == false)
        {
            System.out.println("ligando...");
            ligada = true;
        }
    }
    
    
    public void desligar()
    {
        if(ligada == true)
        {
            System.out.println("desligando...");
            ligada = false;
        }
    }
    
    
    public void imprimir()
    {
        if((ligada == true) && (papel == true))
            System.out.println("imprimindo...");
                
        else if((ligada == true) && (papel == false))
            System.out.println("sem papel...");
        else
            System.out.println("impressora desligada...");
                
    }
    
    
    public void digitalizar()
    {
        if((ligada == true) && (digitalizadora == true))
            System.out.println("digitalização sendo realizada...");
        else if((ligada == true) && (digitalizadora == false))
            System.out.println("não é possível digitalizar...");
        else
            System.out.println("impressora desligada...");
    }
    
    
    public void copiar()
    {
        if((ligada == true) && (copiadora == true))
            System.out.println("cópia sendo realizada...");
        else if((ligada == true) && (copiadora == false))
            System.out.println("não é possível copiar...");
        else
            System.out.println("impressora desligada...");
    }
    
    
    public void status()
    {
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(tipoPapel);
    
        if(bluetooth)
            System.out.println("bluetooth on");
        else
            System.out.println("bluetooth off");
        
        if(wifi)
            System.out.println("wifi on");
        else
            System.out.println("wifi off");
        
        if(colorida)
            System.out.println("impressão colorida");
        else
            System.out.println("impressão preto e branco");
        
        if(ligada)
            System.out.println("impressora on");
        else
            System.out.println("impressora off");
    
        if(papel)
            System.out.println("tem papel");
        else
            System.out.println("não tem papel");
    
        if(digitalizadora)
            System.out.println("digitalizadora on");
        else
            System.out.println("digitalizadora off");
        
        if(copiadora)
            System.out.println("copiadora on");
        else
            System.out.println("copiadora off");
    
    }
}


