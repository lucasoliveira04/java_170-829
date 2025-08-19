package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.EscoposEncapsulamento;

public class Main {
    /*
    * Escopos e Encapsulamento
    * Escopos referem-se à visibilidade e ao ciclo de vida das variáveis e métodos em um programa.
    * Encapsulamento é o princípio de esconder os detalhes internos de uma classe e expor apenas o que é necessário para o usuário da classe.
    * Em Java, isso é feito usando modificadores de acesso como private, protected e public.
    * */

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000.0); // Criação de uma conta bancária com titular e saldo inicial

        conta.depositar(2000); // Deposita 2000 na conta

        conta.sacar(3500); // Tenta sacar 3500, o que deve zerar o saldo, pois é maior que o saldo atual

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}