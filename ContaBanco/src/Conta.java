import java.util.Scanner;

public class Conta {

    int numConta;
    String agencia;
    String nomeCliente;
    float saldo = 0;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void exibirConta() {
        System.out.println("\n Olá " + getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() +
                ", conta " + getNumConta() +
                " e seu saldo " + getSaldo() +
                " já está disponível para saque");
    }
}
