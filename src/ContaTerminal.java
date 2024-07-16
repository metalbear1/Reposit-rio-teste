import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //atributos
        int numeroConta;
        String agencia;
        String nomeConta;
        double saldo;


        //valores atributos

        numeroConta = 1021;
        agencia = "067-8";
        nomeConta = "MARIO ANDRADE";
        saldo = 237.48;

        Scanner leitura = new Scanner(System.in);

        var menu= """
                Olá, seja bem-vindo ao DIO Bank, o banco digital da DIO.
                
                Para começarmos por favor insira o numero da conta:
                """;

        System.out.println(menu);

        String contaDigitada = leitura.nextLine();

        if (contaDigitada.equals(String.valueOf(numeroConta))) {
            System.out.println("Olá, seja bem vindo " + nomeConta + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroConta + " e seu saldo de: R$" + saldo + " já está disponível para saque.");
        } else{
            System.out.println("Perdão pelo incômodo, mas não encontramos o numero da sua conta.");
        }

    }
}