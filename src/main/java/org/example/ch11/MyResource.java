package org.example.ch11;

class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("Resource opened");
    }

    public void doSomething() {
        System.out.println("Resource doing something");
    }

    // inheriting requires implementing a compatible close method
    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}
