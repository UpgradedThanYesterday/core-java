package com.upgradadedthanyesterday.java.miscellaneous;

import java.util.*;

class TestAccess {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            byte[] data = new byte[1024*1024];
            list.add(data);
        }
    }
}
