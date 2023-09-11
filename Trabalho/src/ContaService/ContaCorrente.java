package ContaService;

import ClienteService.Cliente;

public class ContaCorrente extends AbstractConta {


    public ContaCorrente(Cliente cliente, int codigoAgencia, int senha) {
        super(cliente, codigoAgencia, senha);
    }


}
