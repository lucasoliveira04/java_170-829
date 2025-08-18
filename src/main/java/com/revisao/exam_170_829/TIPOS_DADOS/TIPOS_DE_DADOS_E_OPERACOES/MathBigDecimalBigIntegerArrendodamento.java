package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MathBigDecimalBigIntegerArrendodamento {
    /*
    * Math é uma classe em Java que fornece métodos para realizar operações matemáticas comuns.
    *
    * BigDecimal e BigInteger são classes em Java que fornecem suporte para números de precisão arbitrária.
    *
    * */

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        double arredondar = 10.675;

        BigDecimal c = new BigDecimal(a);
        BigInteger d = BigInteger.valueOf(b);

        int sum = java.lang.Math.addExact(a, b);
        int sub = java.lang.Math.subtractExact(a, b);
        int mul = java.lang.Math.multiplyExact(a, b);
        int div = java.lang.Math.floorDiv(a, b);
        int max = java.lang.Math.max(a, b);
        int min = java.lang.Math.min(a, b);
        double sqrt = java.lang.Math.sqrt(a);
        double pow = java.lang.Math.pow(a, b);
        double random = java.lang.Math.random();
        double arredodadoParMais = java.lang.Math.round(arredondar);
        double arredodadoParMenos = java.lang.Math.floor(arredondar);
        double arredodadoPadrao = java.lang.Math.ceil(arredondar);

        System.out.println("Soma: " + sum);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mul);
        System.out.println("Divisão: " + div);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Raiz quadrada: " + sqrt);
        System.out.println("Potência: " + pow);
        System.out.println("Número aleatório: " + random);
        System.out.println("Arredondado para o inteiro mais próximo: " + arredodadoParMais);
        System.out.println("Arredondado para baixo: " + arredodadoParMenos);
        System.out.println("Arredondado padrão: " + arredodadoPadrao);
        System.out.println("BigDecimal: " + c.getClass());
        System.out.println("BigInteger: " + d);
    }
}
