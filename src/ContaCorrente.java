
public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 2.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void sacar(double valor){
        double total = valor + TAXA_SAQUE;
        if(saldo >= total){
            saldo -= total;
        }else{
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }

}