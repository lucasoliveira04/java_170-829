package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.HerancaAbstrataSelada;

// Classe selada que só pode ser estendida por Cliente e Funcionario
public sealed class Pessoa permits Cliente, Funcionario {
    private String nome;
    private double saldo;

    public Pessoa(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
