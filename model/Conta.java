package model;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta() {
        this.saldo = 100;
    }

    public boolean sacar(double valor) {
        if(valor>0 && valor <= saldo){
            saldo -=valor;   //saldo = saldo - valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;     //saldo = saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Conta contaDestino, double valor) {
        if(this.sacar(valor)){      //valor>=0 && saldo>=valor
            contaDestino.depositar(valor);
            return  true;
        }
        else {
            System.out.println("Valor inválido ou saldo insuficiente");
            return false;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


}
