package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop;

public class CicloDeVidaDeObjeto {
    /*
    * Há 3 ciclos de vida de um objeto em Java (reachability):
    * 1 - Criação: O objeto é criado na memória quando é instanciado com a palavra-chave `new`.
    * 2 - Uso: O objeto é utilizado no código, podendo ser acessado e manipulado através de suas referências.
    * 3 - Descarte: O objeto é descartado quando não há mais referências a ele, permitindo que o coletor de lixo (Garbage Collector) do Java libere a memória ocupada por ele.
    * */

    private String nome;
    public CicloDeVidaDeObjeto(String nome) {
        this.nome = nome; // Criação do objeto
    }

    public String getNome() {
        return nome; // Uso do objeto
    }

    public static void main(String[] args) {
        CicloDeVidaDeObjeto objeto = new CicloDeVidaDeObjeto("Exemplo"); // Criação
        System.out.println("Nome do objeto: " + objeto.getNome()); // Uso
        objeto = null; // Descarte do objeto, permitindo que o Garbage Collector libere
        // a memória ocupada por ele quando necessário.
        // Não há garantia de quando o Garbage Collector irá executar, mas ele é acionado
        // automaticamente pelo Java quando necessário, como quando a memória está baixa.
        System.gc(); // Solicita ao Garbage Collector que execute, mas não garante que ele será
        // executado imediatamente.
        System.out.println("Objeto descartado, aguardando coleta de lixo.");
        // O objeto agora não tem mais referências, e o Garbage Collector pode liberar a memória ocupada por ele.
        System.out.println("Tentando chamar o objeto após o descarte: " + objeto.getNome());
    }
}
