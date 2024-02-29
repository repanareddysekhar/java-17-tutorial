package org.example;

public class StringBuilderAndStringBufferExample {
    public static void main(String[] args) {
        stringBuilder();
        stringBuffer();
    }

    static void stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();

        Thread thread1 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("A");
            }
        });

        Thread thread2 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("A");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("StringBuilder length:: " + stringBuilder.toString().length());
    }

    static void stringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();

        Thread thread1 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("A");
            }
        });

        Thread thread2 = new Thread( () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("A");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("StringBuffer length:: " + stringBuffer.toString().length());
    }
}
