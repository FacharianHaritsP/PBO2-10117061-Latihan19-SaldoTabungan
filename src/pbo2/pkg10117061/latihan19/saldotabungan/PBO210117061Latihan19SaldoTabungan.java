/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan19.saldotabungan;

/**
*Nama              :Fachrian Harits Pratama
 *NIM               :10117061  
 *kelas             :if2
 *Deskripsi program :menampilkan saldo tabungan dalam waktu 6 bulan
 */
public class PBO210117061Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double j, saldo;
        saldo = 2500000;

        for (int i = 1; i <= 6; i++) {
            j = (int) saldo * 0.15;
            saldo = j + saldo;

            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldo);

        }
    }

}
