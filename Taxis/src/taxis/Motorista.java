
package taxis;

/**
 *
 * @author mugen
 */
public class Motorista 
{
    private int idMotorista;
    private String nome;
    private String telefone;
    private String CNH;

    public Motorista(int idMotorista, String nome, String telefone, String CNH) 
    {
        this.idMotorista = idMotorista;
        this.nome = nome;
        this.telefone = telefone;
        this.CNH = CNH;
    }

    public int getIdMotorista() 
    {
        return idMotorista;
    }

    public void setIdMotorista(int idMotorista) 
    {
        this.idMotorista = idMotorista;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public String getCNH() 
    {
        return CNH;
    }

    public void setCNH(String CNH) 
    {
        this.CNH = CNH;
    }
        
}
