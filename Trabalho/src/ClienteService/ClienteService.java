package ClienteService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ClienteService {

    protected HashMap<String, Cliente> hashCliente = new HashMap<String, Cliente>();
    private String cadastrarCpf;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getCadastrarCpf() {
        return cadastrarCpf;
    }

    public void setCadastrarCpf(String cadastrarCpf) {
        this.cadastrarCpf = cadastrarCpf;
    }

    public void cadastroDoCliente() throws IOException {
        System.out.println("+--------------------------------------------------+");
        System.out.println("                     Cadastro                      |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("Digite  seu nome: ");
        String nome = reader.readLine();
        verificarCliente(true);
        System.out.println("O Cliente foi cadastrado com sucesso");
        hashCliente.put(getCadastrarCpf(), new Cliente(getCadastrarCpf(), nome));

        System.out.println();

    }

    public Cliente obterPorCpf(String cpf) {
        return hashCliente.get(cpf);

    }

    public Cliente verificarCliente(boolean verifica) throws IOException {
        System.out.println("Digite o seu CPF: ");
        this.cadastrarCpf = reader.readLine();
        if (hashCliente.containsKey(cadastrarCpf)) {
            if (verifica) {
                System.out.println("Não é possivel cadastrar o mesmo CPF para duas Contas, Tentar novamente (S)im/(Não)?");
                return verificarCliente(true);
            }

            return obterPorCpf(cadastrarCpf);

        } else {
            if (!verifica) {
                System.out.println("CPF não foi cadastrado como Cliente");
                return verificarCliente(false);
            }

            setCadastrarCpf(cadastrarCpf);
            return null;
        }
    }
}



