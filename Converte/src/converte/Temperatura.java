
package converte;

//@author mugen
 
class Temperatura 
{
    private double temperatura;

    Temperatura(double temperatura)
    {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() 
    {
        return "" + temperatura;
    }
    
    public void toFahr()
    {
        temperatura = (temperatura * 9.0 / 5.0 + 32); 
    }

    public void toCelcius()
    {
        temperatura = ((temperatura - 32) * 5.0 / 9.0); 
    }
    
}