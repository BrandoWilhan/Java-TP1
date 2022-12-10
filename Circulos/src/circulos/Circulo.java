package circulos;

//@author mugen;

public class Circulo 
{
    private int x;
    private int y;
    private int raio;
    public static final double PI = 3.14159;

    public Circulo(int x, int y, int raio) 
    {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }

    public void setRaio(int raio) 
    {
        this.raio = raio;
    }

    public int getRaio() 
    {
        return raio;
    }
    
    public double circunferencia()
    {
        return 2*PI*raio;
    }

}