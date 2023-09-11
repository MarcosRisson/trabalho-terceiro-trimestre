package ContaService;

import ClienteService.Cliente;

import java.util.Random;

public abstract class AbstractConta {
    protected double saldoConta;
    private final int codigoDaAgencia;
    private final int numeroDaConta;
    private final int senhaConta;
    private final Cliente cliente;

    private final Random random = new Random();

    public AbstractConta(Cliente cliente, int codigoDaAgencia, int senha) {

        this.cliente = cliente;
        this.codigoDaAgencia = codigoDaAgencia;
        this.senhaConta = senha;
        this.saldoConta = 0;
        this.numeroDaConta = random.nextInt(1000);

    }

    public int getCodigoDaAgencia() {
        return codigoDaAgencia;
    }

    public int getSenhaConta() {
        return senhaConta;
    }

    protected String getCpf() {

        return cliente.getCpf();
    }

    @Override
    public String toString() {
        return "Nome: " + cliente.getNome() + " CPF: " + cliente.getCpf() +
                " Codigo agencia: " + this.codigoDaAgencia + "Numero Conta: "
                + this.numeroDaConta + " Saldo: " + this.saldoConta;
    }


}


