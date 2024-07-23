import javax.sound.midi.Sequence;
public class ContaCorrente extends Conta {
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente: ");
        System.out.printf("Agência: %d%n", super.agencia);
        System.out.printf("Numero: %d%n", super.numero);
        System.out.printf("Saldo: %.2f%n", super.saldo);
    }
}
