package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.HerancaAbstrataSelada;

// Classe que estende a classe selada Pessoa
// non-sealed permite que outras classes possam estender Funcionario
public non-sealed class Funcionario extends Pessoa{
    public Funcionario(String nome, double saldo) {
        super(nome, saldo);
    }
}
