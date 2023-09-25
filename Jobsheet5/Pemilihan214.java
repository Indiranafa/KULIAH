package Jobsheet5;
import java.util.Scanner;

public class Pemilihan214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai UAS : ");
        float uas = sc.nextFloat();
        System.out.print("Nilai UTS : ");
        float uts = sc.nextFloat();
        System.out.print("Nilai Kuis : ");
        float kuis = sc.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = sc.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        //System.out.println("Nilai akhir = " + total + " sehingga " + message); 

        if (80<total && total<=100){
            System.out.println("predikat A\nNilai Setara 4\nKualifikasi Sangat Baik");
        }else if (73<total && total<= 80){
            System.out.println("predikat B+\nNilai Setara 3.5\nKualifikasi Lebih dari Baik");
        }else if (65<total && total<= 73){
            System.out.println("predikat B\nNilai Setara 3\nKualifikasi Baik");
        }else if (60<total && total<= 65){
            System.out.println("predikat C+\nNilai Setara 2.5\nKualifikasi Lebih dari Cukup");
        }else if (50<total && total<=60) {
            System.out.println("predikat C\nNilai Setara 2\nKualifikasi Cukup");
        }else if (39<total && total<50){
            System.out.println("predikat D\nNilai Setara 1\nKualifikasi Kurang");
        }else {
            System.out.println("predikat E\nNilai Setara 0\nKualifikasi Gagal");
        }

        System.out.println("Nilai akhir = " + total + " sehingga " + message);

        // String predikat;
        // if (total <= 100) {
        //     predikat = "A";
        // }else if (total <= 80){
        //     predikat = "B+";
        // }else if (total <= 73){
        //     predikat = "B";
        // }else if (total <=65){
        //     predikat = "C+";
        // }else if (total <= 60){
        //     predikat = "C";
        // }else if (total <= 50){
        //     predikat = "D";
        // }else (total <= 39){
        //     predikat = "E";
        // }

        // System.out.println("Nilai akhir = " + total + " sehingga " + message + predikat);
    }
}
