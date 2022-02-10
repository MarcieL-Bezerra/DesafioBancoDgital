import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        Cliente nome = new Cliente();
        String opcao, tipoc;
        double valor;

        System.out.println("##############################################################");
        System.out.println("##### Bem vindo a MarcielBankHome - Aqui voce vale ouro ######");

        System.out.println("Entre com seu nome!");
        nome.setNome(scan.next());

        System.out.println("Olá " + nome.getNome() + " Escolha uma das opções a seguir");

        System.out.println("Para Conta Corrente digite a letra (C) para Poupança digite a letra (P)");
        opcao = scan.next().toUpperCase();
        Conta cc = new ContaCorrente(nome);
        Conta poupanca = new ContaPoupanca(nome);

        if (opcao.equals("C")){
            System.out.println("Escolha um valor para depositar");
            valor = scan.nextDouble();
            cc.depositar(valor);
            System.out.println("Escolha um valor para transferir");
            valor = scan.nextDouble();
            cc.transferir(valor, poupanca);
            cc.imprimirExtrato();
        }else if (opcao.equals("P")){
            System.out.println("Escolha um valor para depositar");
            valor = scan.nextDouble();
            poupanca.depositar(valor);
            System.out.println("Escolha um valor para transferir");
            valor = scan.nextDouble();
            poupanca.transferir(valor, cc);
            poupanca.imprimirExtrato();
        }else {
            System.out.println("escolhido " + opcao + " essa opção não existe tente novamente mais tarde!");
        }
    }

}
