

package banco;

import java.util.ArrayList;


 // @author aluno
 
public class Gerente {
    private int codigoGerente;
    private long cpf;
    private String nomeGerente;
    private String funcao;
    
    private ArrayList<Cliente> clientes;

    public Gerente(int codigoGerente, long cpf, String nomeGerente, String funcao) {
        this.codigoGerente = codigoGerente;
        this.cpf = cpf;
        this.nomeGerente = nomeGerente;
        this.funcao = funcao;
        this.clientes = new ArrayList();
    }
    
    public Gerente() {
        this.clientes = new ArrayList();
    }

    public int getCodigoGerente() {
        return codigoGerente;
    }

    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
            
}
