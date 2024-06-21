package org.example.ch7;

public record Newt(long size) {
    @Override public boolean equals(Object obj) {
        return false;
    }

    // error, since record is immutable, cannot modify fields
/*    public void setSize(long size) {
        this.size = size;
    }*/
}
