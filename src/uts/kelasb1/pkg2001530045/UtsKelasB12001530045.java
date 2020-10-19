package uts.kelasb1.pkg2001530045;

import java.util.Scanner;

public class UtsKelasB12001530045 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String namaPegawai;
        int bagian;
        int jumlahLembur;
        
        String namaBagian[] = {"Keuangan", "Personalia", "Teknis"};
        int honor[] = {2000000, 1500000, 1000000};
        int tarifLembur[] = {200000, 100000, 300000};
        
        System.out.println("INPUT");
        System.out.print("Nama Pegawai  : ");
        namaPegawai = sc.nextLine();
        
        do {
            System.out.print("Bagian[1/2/3] : ");
            bagian = sc.nextInt();
            
            if(bagian < 1 || bagian > 3) {
                System.out.println("Masukkan hanya dari 1 - 3!!!");
            }
        } while(bagian < 1 || bagian > 3);
        
        System.out.print("Jumlah Lembur : ");
        jumlahLembur = sc.nextInt();
        
        int uangLembur = jumlahLembur * tarifLembur[bagian - 1];
        int gaji = honor[bagian - 1] + uangLembur;
        float pajak = (float) (gaji * 0.05);
        
        int totalGaji = (int) (gaji - pajak);
        
        System.out.println("\n\nOUTPUT");
        System.out.println("Nama Pegawai : "+ namaPegawai);
        System.out.println("Nama Bagian  : "+ namaBagian[bagian - 1]);
        System.out.println("Honor        : "+ honor[bagian - 1]);
        System.out.println("Uang Lembur  : "+ uangLembur);
        System.out.println("Pajak        : "+ pajak);
        System.out.println("Total Gaji   : "+ totalGaji);
    }
    
}
