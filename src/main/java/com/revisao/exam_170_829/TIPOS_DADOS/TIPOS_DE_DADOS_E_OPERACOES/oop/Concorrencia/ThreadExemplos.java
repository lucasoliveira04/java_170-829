package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES.oop.Concorrencia;

public class ThreadExemplos {
    /*
    * Thread é uma unidade de execução dentro de um processo. Em Java, a classe Thread representa uma thread de execução.
    * Cada thread tem seu próprio fluxo de controle, o que permite que múltiplas tarefas
    *
    * Runnable é uma interface funcional que define um único método, run(), que contém o código a ser executado pela thread.
    *
    * */



    static class PrimeThread implements Runnable {

        public void createThread(int quantidade) {
            for (int i = 0; i < quantidade; i++) {
                Thread thread = new Thread(this, "Thread-" + i);
                thread.start();
            }
        }

        public void descricaoDaThread(Thread thread) {
            System.out.println("Thread ID: " + thread.currentThread().getId()); // Obtém o ID da thread atual
            System.out.println("Thread Priority: " + thread.currentThread().getPriority()); // Obtém a prioridade da thread atual
            System.out.println("Thread State: " + thread.currentThread().getState()); // Obtém o estado da thread atual
            System.out.println("Thread isAlive: " + thread.currentThread().isAlive()); // Verifica se a thread está ativa
            System.out.println("Thread isDaemon: " + thread.currentThread().isDaemon()); // Verifica se a thread é daemon
            System.out.println("Thread Group: " + thread.currentThread().getThreadGroup().getName()); // Obtém o grupo da thread atual
            System.out.println("Thread HashCode: " + thread.currentThread().hashCode()); // Obtém o hash code da thread atual O hash code é um valor numérico que representa a identidade da thread
            System.out.println("Thread toString: " + thread.currentThread().toString()); // Representação em string da thread atual
            System.out.println("Thread Name: " + thread.currentThread().getName()); // Obtém o nome da thread atual
        }

        @Override
        public void run() {
            System.out.println("Thread iniciada: " + Thread.currentThread().getName()); // Obtém o nome da thread atual
            System.out.println("Numero de threads ativas: " + Thread.activeCount()); // Obtém o número de threads ativas no momento
        }
    }

    public static void main(String[] args) {
        PrimeThread primeThread = new PrimeThread();
        primeThread.createThread(2);
    }
}