public class Main {
    public static void main(String[] args){
       Conta cc = new ContaCorrente();
       cc.depositar(1300);
       cc.sacar(500);
        Conta cp = new ContaPoupanca();
        cp.depositar(400);
        cp.sacar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
