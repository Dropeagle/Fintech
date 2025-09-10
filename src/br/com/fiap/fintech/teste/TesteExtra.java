package br.com.fiap.fintech.teste;

import br.com.fiap.fintech.model.ContaPoupanca;
import br.com.fiap.fintech.model.Investimento;

public class TesteExtra {
    public static void main(String[] args) {
        // Criando uma conta poupança
        ContaPoupanca poupanca = new ContaPoupanca(
                2001,
                "0002",
                1000.0,
                0.05 // 5% de rendimento
        );

        System.out.println("Saldo inicial poupança: " + poupanca.getSaldo());
        poupanca.aplicarRendimento();
        System.out.println("Saldo após rendimento: " + poupanca.getSaldo());

        // Criando um investimento
        Investimento investimento = new Investimento(
                "CDB",
                5000.0,
                0.08 // 8% de retorno
        );

        System.out.println("\n=== Investimento ===");
        System.out.println("Produto: " + investimento.getNome());
        System.out.println("Valor aplicado: " + investimento.getValorAplicado());
        System.out.println("Rendimento esperado: " + investimento.calcularRendimento());
    }
}
