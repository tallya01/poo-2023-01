package com.github.tallya01.t07.domain.generico;
public class TesteSomaNaturais {
    public static long SomaNaturais(int n) {
        int c = 1;
        int s = 0;
        while (c <= n) {
            s += c;
            c += 1;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(SomaNaturais(10));
    }
}