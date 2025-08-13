package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES;

public class Primitivos {
    /*
    * Aqui veremos os tipos primitivos em Java.
    * Tamanhos e valores padrão
    * Ranges
    * Literais
    * Underlines
    * binário, octal, decimal e hexadecimal
    * */

    public static void main(String[] args) {
        // Tipos primitivos e seus tamanhos
        byte b = 127; // -128 a 127
        short s = 1000; // -32.768 a 32.767
        int i = 100000; // -2.147.483.648 a 2.147.483.647
        long l = 100000L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        float f = 10.5f; // 32 bits, precisão de 6 a 7 dígitos decimais
        double d = 20.99; // 64 bits, precisão de 15 dígitos decimais
        char c = 'A'; // 16 bits, representa um único caractere Unicode
        boolean bool = true;

        // Tamanho e valores padrão
        System.out.println("Tamanho e valores padrão dos tipos primitivos:");
        System.out.println("byte: " + Byte.SIZE + " bits, valor padrão: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.SIZE + " bits, valor padrão: " + Short.MIN_VALUE + " a "
                + Short.MAX_VALUE);
        System.out.println("int: " + Integer.SIZE + " bits, valor padrão: "
                + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.SIZE + " bits, valor padrão: " + Long.MIN_VALUE + " a "
                + Long.MAX_VALUE);
        System.out.println("float: " + Float.SIZE + " bits, valor padrão: "
                + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " bits, valor padrão: "
                + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("char: " + Character.SIZE + " bits, valor padrão: "
                + (int) Character.MIN_VALUE + " a " + (int) Character.MAX_VALUE
                + " (representa caracteres Unicode)");

        // Literais
        // O que são literais?
        // Literais são valores fixos que podem ser atribuídos a variáveis.
        int decimal = 100; // Decimal
        int octal = 0144; // Octal (prefixo 0)
        int hexadecimal = 0x64; // Hexadecimal (prefixo 0x)
        int binario = 0b1100100; // Binário (prefixo 0b)

        System.out.println("\nExemplos de literais:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Binário: " + binario);

        // Underlines
        // Os underlines podem ser usados para melhorar a legibilidade dos números.
        int numeroGrande = 1_000_000; // Usando underlines para separar
        long numeroLongo = 1_000_000_000L; // Usando underlines em long
        System.out.println("\nExemplos de underlines:");
        System.out.println("Número grande com underlines: " + numeroGrande);
        System.out.println("Número longo com underlines: " + numeroLongo);

    }
}
