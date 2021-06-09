package com.tugaspbo.contoh_interface;

/*
Created at Wednesday 09 June 2021
Licensed @JustAo
Tugas Pbo Materi Interface
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Membuat objek Hp
        Handphone Redmi8A = new Oppo();
        PenggunaHandphone Yudha = new PenggunaHandphone(Redmi8A);

        //Coba nyalakan Hp
        Yudha.turnOnPhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true) {

            System.out.println("Aplikasi Interface");
            System.out.println("1.Nyalakan Hp");
            System.out.println("2.Matikan Hp");
            System.out.println("3.Perbesar Volume");
            System.out.println("4.Turunkun Volume");
            System.out.println("5.Keluar");
            System.out.println("Pejet salah satu pilihan :");
            aksi = input.nextLine();


            if(aksi.equalsIgnoreCase("1")) {
                Yudha.turnOnPhone();
            } else if (aksi.equalsIgnoreCase("2")) {
                Yudha.turnOffPhone();
            } else if (aksi.equalsIgnoreCase("3")) {
                Yudha.turnUpPhone();
            } else if (aksi.equalsIgnoreCase("4")) {
                Yudha.turnDownPhone();
            } else if (aksi.equalsIgnoreCase("5")) {
                System.exit(5);
            } else {
                System.out.println("Kamu salah pilih");
            }

        }

    }

}

