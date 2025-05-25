
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void aplicarRendimentoMensal(){
        double rendimento = saldo * 0.005;  // 0.5% ao mês
        depositar(rendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}