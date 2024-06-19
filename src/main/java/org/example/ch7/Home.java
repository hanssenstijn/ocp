package org.example.ch7;

public class Home {
    private String greeting = "Hi";

    protected class Room {
        public int repeat = 3;
        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }
        private static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() {
        var room = new Room();
        room.enter();
    }

    public static void main(String[] args) {
        var home = new Home();
        home.enterRoom();

        Room room = home.new Room();
        room.enter();
    }
}
