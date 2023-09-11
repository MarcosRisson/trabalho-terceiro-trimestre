package Menu;

import ClienteService.ClienteService;
import ContaService.ContaService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static ClienteService clienteService = new ClienteService();
    private static boolean sistema = true;
    private static ContaService contaService = new ContaService(clienteService);
    private static BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        do {

            switch (menu()) {
                case 1:
                    clienteService.cadastroDoCliente();
                    break;

                case 2:
                    contaService.cadastroDaContaCorrente();
                    break;

                case 3:
                    contaService.cadastroDaContaPoupanca();
                    break;

                case 4:
                    contaService.saque();
                    break;

                case 5:
                    contaService.deposito();
                    break;

                case 6:
                    contaService.transferencia();
                    break;


                case 0:

                    break;

                default:
                    break;


            }
        } while (sistema);

    }

    public static int menu() throws IOException {
        System.out.println("+--------------------------------------------------+");
        System.out.println("                  MENU PRINCIPAL                   |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Atalho |              Submenu                    |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("   [1]   |  Cadastrar Cliente                      |");
        System.out.println("   [2]   |  Cadastrar Conta Corrente               |");
        System.out.println("   [3]   |  Cadastar Conta Poupança                |");
        System.out.println("   [4]   |  Efetuar Saque                          |");
        System.out.println("   [5]   |  Efetuar Deposito                       |");
        System.out.println("   [6]   |  Efetuar Transferencia                  |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("   [0]  |  Encerrar Programa                      |");
        System.out.println("+--------------------------------------------------+");
        return Integer.parseInt(ler.readLine());

    }


}