package taxis;

import java.util.Scanner;

/**
 *
 * @author mugen
 */
public class Taxis 
{

    public static void main(String[] args) 
    {
        //veiculo
        String placa;
        String marca;
        String modelo;
        String cor;
        int ano;
        
        //motorista
        int idMotorista;
        String nomeMotorista;
        String telefoneMotorista;
        String CNH;
        
        //cliente
        int idCliente;
        String nomeCliente;
        String telefoneCliente;
        String RG;
        String CPF;
        
        //chamado
        int idChamado;
        String data;
        String tipo;
        String origem;
        String destino;
        float horarioPartida;
        float horarioRetorno;
        double initKm;
        double finalKm;
        double valorTotal;
        
        Scanner input = new Scanner(System.in);
        
        //linha 1
        placa = input.next();
        marca = input.next();
        modelo = input.next();
        cor = input.next();
        ano = input.nextInt();
        input.nextLine();
        
        //linha 2
        idMotorista = input.nextInt();
        nomeMotorista = input.next();
        telefoneMotorista = input.next();
        CNH = input.next();
        input.nextLine();
        
        //linha3
        idCliente = input.nextInt();
        nomeCliente = input.next();
        telefoneCliente = input.next();
        RG = input.next();
        CPF = input.next();
        input.nextLine();
        
        //linha4
        idChamado = input.nextInt();
        data = input.next();
        tipo = input.next();
        origem = input.next();
        destino = input.next();
        horarioPartida = input.nextFloat();
        horarioRetorno = input.nextFloat();
        initKm = input.nextDouble();
        finalKm = input.nextDouble();
        valorTotal = input.nextDouble();
        input.nextLine();
        
        Veiculo veiculo = new Veiculo(placa, marca, modelo, cor, ano);
        Motorista motorista = new Motorista(idMotorista, nomeMotorista, telefoneMotorista, CNH);
        Cliente cliente = new Cliente(idCliente, nomeCliente, RG, CPF, telefoneCliente);
        Chamado chamado = new Chamado(idChamado, data, tipo, origem, destino, horarioPartida, horarioRetorno, initKm, finalKm, valorTotal, veiculo, cliente, motorista);
        
        System.out.println(chamado.getIdChamado());
        System.out.println(chamado.getDestino());
        System.out.println(chamado.getVeiculo().getPlaca());
        System.out.println(chamado.getCliente().getRG());
        System.out.println(chamado.getMotorista().getNome());
        
    }
    
}
