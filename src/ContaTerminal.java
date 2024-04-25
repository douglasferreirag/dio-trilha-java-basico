import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {

   
        
        Integer numero;
    
        String agencia;
        
        String nomeCliente;
    
        Double saldo;

        Scanner scan = new Scanner(System.in);
        

        System.out.println();
        System.out.println();

        System.out.println("Por favor, digite o número da agência!: ");

        numero = scan.nextInt();

        System.out.println("Por favor, digite o nome da agência!: ");

        agencia = scan.next();

        System.out.println("Por favor, digite o nome do cliente!: ");

        nomeCliente = scan.next();

        System.out.println("Por favor, digite o saldo da conta!: ");

        saldo = scan.nextDouble();

        Conta conta = new Conta(numero,agencia,nomeCliente, saldo);

        scan.close();

        conta.Sucesso();
        
        

  

    
    }
}
