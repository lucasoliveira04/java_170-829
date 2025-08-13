package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES;

public class Wrappers {
    /*
    * Wrappers são classes que encapsulam tipos primitivos em objetos.
    * */

    public static void main(String[] args) {
        // Tipos primitivos
        int numeroPrimitivo = 42;
        boolean booleanoPrimitivo = true;

        // Wrappers correspondentes
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);
        Boolean booleanoWrapper = Boolean.valueOf(booleanoPrimitivo);

        // Exibindo os valores
        System.out.println("Número primitivo: " + numeroPrimitivo);
        System.out.println("Número wrapper: " + numeroWrapper);
        System.out.println("Booleano primitivo: " + booleanoPrimitivo);
        System.out.println("Booleano wrapper: " + booleanoWrapper);

        // Comparando tipos primitivos e wrappers
        System.out.println("Comparação de tipos primitivos e wrappers:");
        System.out.println("Número primitivo == Número wrapper: " + (numeroPrimitivo == numeroWrapper));
        System.out.println("Booleano primitivo == Booleano wrapper: " + (booleanoPrimitivo == booleanoWrapper));

        // Conversão de String para Wrapper
        String numeroString = "123";
        Integer numeroConvertido = Integer.valueOf(numeroString);
        System.out.println("Número convertido de String para Wrapper: " + numeroConvertido);

        System.out.println("Numero String.equals(numeroConvertido.toString()): " + numeroString.equals(numeroConvertido.toString()));
        System.out.println("Numero string == numero convertido " + numeroString == numeroConvertido.toString());

    }
}
