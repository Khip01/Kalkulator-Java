package com.khip;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Khip01
 */
public class Main {
    
    private static float rumusFloat(float pertama, float kedua, int masukkan){
        DecimalFormat df = new DecimalFormat("#.######");
        float hasil = 0;
        if (masukkan == 1){
            System.out.println("Anda Memilih Tambah");
            hasil=pertama+kedua;
            System.out.printf("Hasil dari %s + %s = %s\n",df.format(pertama),df.format(kedua),df.format(hasil));
        } else if (masukkan == 2){
            System.out.println("Anda Memilih Kurang");
            hasil=pertama-kedua;
            System.out.printf("Hasil dari %s - %s = %s\n",df.format(pertama),df.format(kedua),df.format(hasil));
        } else if (masukkan == 3){
            System.out.println("Anda Memilih Kali");
            hasil=pertama*kedua;
            System.out.printf("Hasil dari %s x %s = %s\n",df.format(pertama),df.format(kedua),df.format(hasil));
        } else if (masukkan == 4){
            System.out.println("Anda Memilih Bagi");
            hasil=pertama/kedua;
            System.out.printf("Hasil dari %s : %s = %s\n",df.format(pertama),df.format(kedua),df.format(hasil));
        } else if (masukkan == 5){
            System.out.println("Anda Memilih Modulus");
            hasil=pertama%kedua;
            System.out.printf("Hasil dari %s %% %s = %s\n",df.format(pertama),df.format(kedua),df.format(hasil));
        } else {
            System.out.println("Anda salah memasukkan Input");
            System.out.println("Coba Run ulang dan");
            System.out.println("Coba masukkan lagi 1/2/3/4/5");
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        ////SELAMAT DATANG DI PROGRAM KALKULATOR////
        //Objek
        Scanner Input = new Scanner(System.in);
        int masukkan;
        float pertama,kedua,hasil;
        System.out.println(" __________________ ");
        System.out.println(" \\    OPERATOR    /");
        System.out.println(" / 1. Tambah      \\ ");
        System.out.println(" \\ 2. Kurang      /");
        System.out.println(" / 3. Kali        \\ ");
        System.out.println(" \\ 4. Bagi        /");
        System.out.println(" / 5. Modulus     \\ ");
        System.out.println(" \\________________/");
        System.out.print("Masukkan pilihan Anda (1/2/3/4/5) : ");
        masukkan = Input.nextInt();
        System.out.print("Masukkan Bilangan pertama : ");
        pertama = Input.nextFloat();
        System.out.print("Masukkan Bilangan Kedua : ");
        kedua = Input.nextFloat();
        ////PENGKONDISIAN
        rumusFloat(pertama,kedua,masukkan);

    }
    
    
}
