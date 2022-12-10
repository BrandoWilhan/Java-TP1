

package taxis;

/**
 *
 * @author mugen
 */
public class Cliente 
{
    private int idCliente;
    private String nome;
    private String RG;
    private String CPF;
    private String telefone;
    
    public Cliente(int idCliente,String nome, String RG, String CPF, String telefone)
    {
        this.idCliente = idCliente;
        this.RG = RG;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public int getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente) 
    {
        this.idCliente = idCliente;
    }

    public String getRG() 
    {
        return RG;
    }

    public void setRG(String RG) 
    {
        this.RG = RG;
    }

    public String getCPF() 
    {
        return CPF;
    }

    public void setCPF(String CPF) 
    {
        this.CPF = CPF;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }
    
}

