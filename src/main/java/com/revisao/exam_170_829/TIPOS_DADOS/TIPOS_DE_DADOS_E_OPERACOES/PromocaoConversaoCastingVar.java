package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES;

public class PromocaoConversaoCastingVar {
    /*
    * Promoção e conversão de tipos em Java.
    * Promoção: Quando um tipo menor é convertido para um tipo maior.
    * Conversão: Quando um tipo maior é convertido para um tipo menor, pode ocorrer perda
    * de dados.
    *
    * Casting: É a conversão explícita de um tipo para outro, geralmente
    * usado quando se converte de um tipo maior para um tipo menor.
    *
    * Var: Introduzido no Java 10, permite que o compilador infira o tipo da variável
    * a partir do valor atribuído a ela. É útil para simplificar a declaração de variáveis,
    * mas deve ser usado com cautela para manter a legibilidade do código.
    * */

    public static void main(String[] args) {

        // Promoção
        byte n1 = 10;
        int n2 = 100;
        int resultado = n1 + n2;

        System.out.println("Resultado da promoção de byte para int: " + resultado);

        // Conversão
        double d = 9.78;
        int inteiro = (int) d;
        System.out.println("Resultado da conversão de double para int: " + inteiro);

        // Var
        var numero = 42; // O compilador infere que é um int
        var texto = "Olá, mundo!"; // O compilador infere que é uma String
        var pi = 3.14; // O compilador infere que é um double

        System.out.println("Usando var:");
        System.out.println("Número: " + numero + " (tipo: " + ((Object) numero).getClass().getSimpleName() + ")");
        System.out.println("Texto: " + texto + " (tipo: " + ((Object) texto).getClass().getSimpleName() + ")");
        System.out.println("Pi: " + pi + " (tipo: " + ((Object) pi).getClass().getSimpleName() + ")");
    }
}
