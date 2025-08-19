package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.SobrecargaESobreescrita;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom(); // Sobreescrita do método emitirSom na classe Cachorro

        cachorro.imprimirValors(12, 3, 4, 54, 56, 7, 8, 9, 10); // Sobrecarga do método imprimirValors com varargs
        cachorro.imprimirValores("Valor1", "Valor2", "Valor3"); // Sobrecarga do método imprimirValores com varargs
    }
}
