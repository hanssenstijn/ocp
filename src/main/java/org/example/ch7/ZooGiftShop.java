package org.example.ch7;

public class ZooGiftShop {
    abstract class SaleTOdayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTOdayOnly sale = new SaleTOdayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
