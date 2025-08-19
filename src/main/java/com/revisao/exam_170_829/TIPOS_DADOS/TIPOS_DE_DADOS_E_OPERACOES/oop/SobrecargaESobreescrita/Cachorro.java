package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.SobrecargaESobreescrita;

public class Cachorro extends Animal{

    // Sobrescrita do método emitirSom da classe Animal
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }

    // Sobrecarga de métodos com varargs
    public void imprimirValors(int... valores){
        for (int valor : valores){
            System.out.println("Valor: " + valor);
        }
    }

    public void imprimirValores(String... valores) {
        for (String valor : valores) {
            System.out.println("Valor: " + valor);
        }
    }
}
