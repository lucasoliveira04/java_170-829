package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.HerancaAbstrataSelada;

public class Main {
    /*
    * Herança Abstrata e Selada
    * Herança Abstrata: Em Java, uma classe abstrata é uma classe que não pode ser instanciada diretamente e pode conter métodos abstratos (sem implementação) que devem ser implementados pelas subclasses.
    * Herança Selada: A partir do Java 15, foi introduzido o conceito de classes seladas (sealed classes), que permitem controlar quais outras classes podem estender ou implementar uma classe ou interface selada.
    * Isso é feito usando a palavra-chave 'sealed' na declaração da classe, juntamente com 'permits' para especificar as subclasses permitidas.
    * */

    public static void main(String[] args) {
        Pessoa fundionario = new Funcionario("João", 1000.0);
        Pessoa cliente = new Cliente("Maria", 500.0);

        System.out.println("Funcionário: " + fundionario.getNome() + ", Saldo: " + fundionario.getSaldo());
        System.out.println("Cliente: " + cliente.getNome() + ", Saldo: " + cliente.getSaldo());
    }
}
