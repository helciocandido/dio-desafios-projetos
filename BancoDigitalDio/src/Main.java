public class Main {
    public static void main(String[] args) {

        Cliente helcio = new Cliente();
        helcio.setNome("Helcio");

        Conta cc1 = new ContaCorrente(helcio);
        Conta cp1 = new ContaPoupanca(helcio);

        cc1.depositar(100);
        cc1.transferir(80, cp1);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}
