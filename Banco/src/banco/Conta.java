package banco;

//author @mugen;

public class Conta 
{
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    int senha;
    

    public Conta(int numeroConta, String nomeCliente, double saldo, int senha) 
    {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta() 
    {
        return numeroConta;
    }

    public String getNomeCliente() 
    {
        return nomeCliente;
    }

    public double getSaldo(int senha) 
    {
        if(this.senha == senha)
            return saldo;
        return 0;
    }
 
    public boolean sacar(double valor, int senha)
    {
        if((valor < saldo) && (valor > 0) && (this.senha == senha))
        {
            this.saldo -= valor;
            
            return true;
        }
        return false;
    }
    
    public boolean depositar(double valor, int senha)
    {
        if((valor > 0) && (this.senha == senha))
        {
            this.saldo += valor;
            
            return true;
        }
        return false;
    }
    
    public boolean transferir(double valor, int senha, Conta contaDestino)
    {
        if(this.sacar(valor, senha))
        {
            contaDestino.depositar(valor, contaDestino.senha);
            return true;
        }    
        return false;
    }

}