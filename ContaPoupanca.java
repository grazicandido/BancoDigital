public class ContaPoupanca extends Conta {
    public void imprimirExtrato(){
    System.out.println("Extrato Conta Poupanca: ");
    System.out.printf("Agência: %d%n", super.agencia);
    System.out.printf("Numero: %d%n", super.numero);
    System.out.printf("Saldo: %.2f%n", super.saldo);

    }
}
