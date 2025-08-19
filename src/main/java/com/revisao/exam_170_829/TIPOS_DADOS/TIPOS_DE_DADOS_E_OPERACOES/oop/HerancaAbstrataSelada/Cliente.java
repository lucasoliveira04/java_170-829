package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.HerancaAbstrataSelada;

// Classe que estende a classe selada Pessoa
// non-sealed permite que outras classes possam estender Cliente
public non-sealed class Cliente extends Pessoa{
    public Cliente(String nome, double saldo) {
        super(nome, saldo);
    }
}
