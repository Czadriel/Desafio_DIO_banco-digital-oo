public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    default void imprimirExtrato(){
        System.out.println("=== Extrato da Conta ===");
        String cliente = "";
        System.out.println("Titular: " + cliente.getBytes());
        String agencia = "";
        System.out.println("Agência: " + agencia);
        String numero = "";
        System.out.println("Número: " + numero);
        String saldo = "";
        System.out.println("Saldo: R$ " + saldo);

    }
}