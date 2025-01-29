package org.example;

public class Klient {
    private final int id;
    private double saldo;

    public Klient(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int pobierzId() {
        return id;
    }

    public double pobierzSaldo() {
        return saldo;
    }

    public void zmniejszSaldo(double kwota) {
        saldo -= kwota;
    }
}