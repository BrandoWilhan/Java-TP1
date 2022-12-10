package manipulafrase;

import java.text.Normalizer;


public class Frase 
{
    private String frase;

    public Frase(String frase) 
    {
        this.frase = frase;
    }

    public String getFrase() 
    {
        return frase;
    }

    public void setFrase(String frase) 
    {
        this.frase = frase;
    }
    
    public int contarVogais()
    {
        int count = 0;
        char[] vogais = {'a','e','i','o','u'};
        frase = Normalizer.normalize(frase, Normalizer.Form.NFKD).replaceAll("\\p{M}", "").toLowerCase();
        
        for(int i = 0; i < frase.length(); i++)
        {
            for(int j = 0; j < vogais.length; j++)
            {
                if(frase.charAt(i) == vogais[j])
                    count++;
            }
        }
        
        
        return count;
       
    }
    
    public int contarPalavras()
    {
        int count = 0;
        String[] palavras;
        palavras = frase.split(" ");
        count = palavras.length;
        return count;
    }
    
}