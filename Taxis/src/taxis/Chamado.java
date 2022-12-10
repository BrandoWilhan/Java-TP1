
package taxis;

/**
 *
 * @author mugen
 */
public class Chamado 
{
    private int idChamado;
    private String data;
    private String tipoChamada;
    private String origem;
    private String destino;
    private float horaPartida;
    private float horaRetorno;
    private double initKm;
    private double finalKm;
    private double valorTotalChamado;
    private Veiculo veiculo;
    private Cliente cliente;
    private Motorista motorista;

    public Chamado(int idChamado, String data, String tipoChamada, String origem, String destino, float horaPartida, float horaRetorno, double initKm, double finalKm, double valorTotalChamado, Veiculo veiculo, Cliente cliente, Motorista motorista) 
    {
        this.idChamado = idChamado;
        this.data = data;
        this.tipoChamada = tipoChamada;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
        this.initKm = initKm;
        this.finalKm = finalKm;
        this.valorTotalChamado = valorTotalChamado;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.motorista = motorista;
    }

  
    public int getIdChamado() 
    {
        return idChamado;
    }

    public void setIdChamado(int idChamado) 
    {
        this.idChamado = idChamado;
    }

    public String getData() 
    {
        return data;
    }

    public void setData(String data) 
    {
        this.data = data;
    }

    public String getTipoChamada() 
    {
        return tipoChamada;
    }

    public void setTipoChamada(String tipoChamada) 
    {
        this.tipoChamada = tipoChamada;
    }

    public String getOrigem() 
    {
        return origem;
    }

    public void setOrigem(String origem) 
    {
        this.origem = origem;
    }

    public String getDestino() 
    {
        return destino;
    }

    public void setDestino(String destino) 
    {
        this.destino = destino;
    }

    public float getHoraPartida() 
    {
        return horaPartida;
    }

    public void setHoraPartida(float horaPartida) 
    {
        this.horaPartida = horaPartida;
    }

    public float getHoraRetorno() 
    {
        return horaRetorno;
    }

    public void setHoraRetorno(float horaRetorno) 
    {
        this.horaRetorno = horaRetorno;
    }

    public double getInitKm() 
    {
        return initKm;
    }

    public void setInitKm(double initKm) 
    {
        this.initKm = initKm;
    }

    public double getFinalKm() 
    {
        return finalKm;
    }

    public void setFinalKm(double finalKm) 
    {
        this.finalKm = finalKm;
    }

    public double getValorTotalChamado() {
        return valorTotalChamado;
    }

    public void setValorTotalChamado(double valorTotalChamado) 
    {
        this.valorTotalChamado = valorTotalChamado;
    }

    public Veiculo getVeiculo() 
    {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) 
    {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() 
    {
        return cliente;
    }

    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }

    public Motorista getMotorista() 
    {
        return motorista;
    }

    public void setMotorista(Motorista motorista) 
    {
        this.motorista = motorista;
    }
    
    
    
}
