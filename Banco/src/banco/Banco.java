package banco;

import java.util.Scanner;


public class Banco 
{

    
    public static void main(String[] args) 
    {
        int numeroConta;
        String nomeCliente;
        double saldo;
        int senha;
        int opcao = 0;
        double valor;
        
        Scanner entrada = new Scanner(System.in);
        
        numeroConta = entrada.nextInt();
        senha = entrada.nextInt();
        nomeCliente = entrada.next();
        saldo = entrada.nextDouble();
        entrada.nextLine();
        
        Conta conta1 = new Conta(numeroConta, nomeCliente, saldo, senha);
        
        numeroConta = entrada.nextInt();
        senha = entrada.nextInt();
        nomeCliente = entrada.next();
        saldo = entrada.nextDouble();
        entrada.nextLine();
        
        Conta conta2 = new Conta(numeroConta, nomeCliente, saldo, senha);
    
        while(opcao != 5)
        {
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            if(opcao == 1)
            {
                senha = entrada.nextInt();
                entrada.nextLine();
                if(senha == conta1.senha)
                    System.out.printf("%.2f\n", conta1.getSaldo(senha));
                else
                    System.out.println("senha incorreta");
            }
            
            if(opcao == 2)
            {
                valor = entrada.nextDouble();
                senha = entrada.nextInt();
                entrada.nextLine();
                if(conta1.sacar(valor, senha))
                    System.out.println("saque realizado");
                else
                    System.out.println("saque não realizado");
            }
            
            
            if(opcao == 3)
            {
                valor = entrada.nextDouble();
                senha = entrada.nextInt();
                entrada.nextLine();
                if(conta1.depositar(valor, senha))
                    System.out.println("depósito realizado");
                else
                    System.out.println("depósito não realizado");
            }
        
            if(opcao == 4)
            {
                
                nomeCliente = entrada.next();
                entrada.nextLine();
                
                if(conta2.getNomeCliente().equals(nomeCliente))
                {    
                    valor = entrada.nextDouble();
                    senha = entrada.nextInt();
                    entrada.nextLine();
                    if(conta1.transferir(valor, senha, conta2))
                        System.out.println("transferência realizada");
                    else
                        System.out.println("transferência não realizada");
                
                }
                else
                    System.out.println("nenhum usuário encontrado");
                
            }
            
        }
        
    }
    
}
