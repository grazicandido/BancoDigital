public abstract class Conta {
        private static final int Agencia_Padrao = 1;
        private static int Sequence = 1;

        protected int agencia;
        protected int numero;
        protected double saldo;

        public Conta(){
        this.agencia = Agencia_Padrao;
        this.numero = Sequence++;
    }

        public void sacar(double valor){
            saldo = saldo - valor;
        }
        public void depositar(double valor){
            saldo = saldo + valor;
        }
        public void transferir(double valor, Conta contaDestino){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        public int getAgencia(){
            return agencia;
        }
        public int getNumero(){
            return numero;
        }
        public double getSaldo(){
            return saldo;
        }

    public void imprimirExtrato() {
    }
}


