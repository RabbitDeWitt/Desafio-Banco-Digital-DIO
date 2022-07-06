public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();


        cliente1.setNome("David");
        cliente2.setNome("Jonas");


        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);
        cc.depositar(250);
        cc.transferir(cp, 100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
        
 

    }
}
