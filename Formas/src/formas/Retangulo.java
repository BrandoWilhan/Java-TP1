package formas; 

// @author mugen
 

public class Retangulo 
{
    private int comprimento = 1;
    private int largura = 1;
    
    
    public int perimetro()
    {
        return (2*(comprimento + largura));
    }
    
    public int area()
    {
        return (comprimento*largura);
    }

    public int getComprimento() 
    {
        return comprimento;
    }

    public void setComprimento(int comprimento) 
    {
        if((comprimento > 0) && (comprimento < 20))
            this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) 
    {
        if((largura > 0) && (largura < 20))
            this.largura = largura;
    }
    
}
