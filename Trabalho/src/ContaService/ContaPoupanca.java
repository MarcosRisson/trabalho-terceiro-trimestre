package ContaService;

import ClienteService.Cliente;

public class ContaPoupanca extends AbstractConta {


    public ContaPoupanca(Cliente cliente, int codigoAgencia, int senha) {
        super(cliente, codigoAgencia, senha);
    }
}

