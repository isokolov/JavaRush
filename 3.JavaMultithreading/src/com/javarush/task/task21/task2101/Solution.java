package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        for (int i = 0; i < netAddress.length; i++) {
            netAddress[i] = (byte) ((byte)ip[i] & mask[i]);
        }

        return netAddress;
    }

    public static void print(byte[] bytes) {
        for (byte b: bytes) {
            String represent = Integer.toBinaryString(b);
            if (represent.length() >= 8)
                System.out.print(represent.substring(represent.length() - 8, represent.length()) + " ");
            if (represent.length() < 8) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < 8 - represent.length(); i++)
                    builder.append("0");
                builder.append(represent);
                builder.append(" ");
                System.out.print(builder.toString());
            }
            //System.out.println("");
        }
        System.out.println("");
    }

    /*public static void print(byte[] bytes) {
        for (byte b : bytes) {
            //Byte to binary format
            System.out.print(Integer.toBinaryString((b & 0xFF) + 0x100).substring(1)+" ");
        }
        System.out.println();
    }*/
}
