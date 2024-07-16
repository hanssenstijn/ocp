package org.example.ch11;

public class MyFileClass implements AutoCloseable {
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    // pay close attention to the order off print out
    // reverse order with the try-with resources
    public static void main(String[] args) throws Exception {
        // has to be effectively final
        final var radioReader = new MyFileClass(5);
        MyFileClass sateliteReader = new MyFileClass(7);
        try (sateliteReader;
             MyFileClass bookReader = new MyFileClass(1);
             MyFileClass movieReader = new MyFileClass(2);
             radioReader) {
            System.out.println("Try Block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing: " + num);
    }
}
