package br.com.fiap.fintech.teste;

import br.com.fiap.fintech.model.*;

public class Teste {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João Silva", "123.456.789-00", "joao@exemplo.com");
        ContaCorrente cc = new ContaCorrente("0001-1", joao, 19.90);

        cc.depositar(1000);
        cc.cobrarTarifa();

        Cliente maria = new Cliente("Maria Souza", "987.654.321-00", "maria@exemplo.com");
        ContaPoupanca cp = new ContaPoupanca("0002-5", maria, 0.01);

        cc.transferir(200, cp);
        cp.aplicarRendimento();

        System.out.printf("Saldo CC (%s): R$ %.2f%n", cc.getTitular().getNome(), cc.getSaldo());
        System.out.printf("Saldo CP (%s): R$ %.2f%n", cp.getTitular().getNome(), cp.getSaldo());
    }
}
