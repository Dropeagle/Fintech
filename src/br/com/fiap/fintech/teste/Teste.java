package br.com.fiap.fintech.teste;

import br.com.fiap.fintech.model.Cliente;
import br.com.fiap.fintech.model.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente(
                "João Silva",
                "123.456.789-00",
                "joao.silva@email.com",
                "(11) 99999-8888",
                "Rua das Flores, 123"
        );

        // Criando uma conta corrente
        ContaCorrente conta = new ContaCorrente(
                1001,
                "0001",
                1500.0,
                500.0
        );

        // Operações na conta
        System.out.println("Saldo inicial: " + conta.getSaldo());
        conta.depositar(200.0);
        System.out.println("Após depósito de 200: " + conta.getSaldo());

        boolean saqueOk = conta.sacar(1800.0);
        System.out.println("Tentativa de saque de 1800: " + (saqueOk ? "Realizado" : "Saldo insuficiente"));
        System.out.println("Saldo final: " + conta.getSaldo());

        // Exibindo os dados
        System.out.println("\n=== Cliente ===");
        System.out.println(cliente);

        System.out.println("\n=== Conta Corrente ===");
        System.out.println(conta);
    }
}
