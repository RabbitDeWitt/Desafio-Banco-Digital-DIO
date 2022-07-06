public abstract class Conta implements IConta {
  
  private static final int AGENCIA_PADAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int conta;
  protected double saldo;
  protected Cliente cliente;


  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADAO;
    this.conta = SEQUENCIAL++;
    this.cliente = cliente;
  }


  public int getAgencia() {
    return agencia;
  }

  public int getConta() {
    return conta;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public void sacar(double valor) {
    this.saldo -= valor;
    
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
    
  }

  @Override
  public void transferir(Conta contaDestino, double valor) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }
  
  protected void imprimirInformacoes() {
    System.out.printf("Titular: %s%n", this.cliente.getNome());
    System.out.printf("Agencia: %d%n", this.agencia);
    System.out.printf("Conta: %d%n", this.conta);
    System.out.printf("Saldo: R$ %.2f%n", this.saldo);
  }

}
