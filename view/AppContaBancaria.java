package view;

import com.sun.security.jgss.GSSUtil;
import model.Conta;

public class AppContaBancaria {


    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.setTitular("Ana");

        Conta conta2 = new Conta();
        conta2.setTitular("Bia");


        if (conta1.depositar(200)) {
            System.out.println("Deposito realizado");
        } else {
            System.err.println("Deposito não realizado");
        }
        if (conta1.sacar(15)) {
            System.out.println("Saque realizado");
        } else {
            System.err.println("Saque inválido");
        }
        if(conta1.transferir(conta2,50)){
            System.out.println("Transferencia realizada");
        } else{
            System.err.println("Erro ao tranferir");
        }



        System.out.println("Saldo de "+ conta1.getTitular()+ " saldo " + conta1.getSaldo());
        System.out.println("Saldo de "+ conta2.getTitular()+ " saldo " + conta2.getSaldo());
    }
}



