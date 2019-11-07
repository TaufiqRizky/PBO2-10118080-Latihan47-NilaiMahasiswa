/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan47.nilaimahasiswa;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai n = new Nilai(75,45, 34);
        System.out.println("QUIZ\t\t= "+n.getQuiz());
        System.out.println("UTS\t\t= "+n.getUts());
        System.out.println("UAS\t\t= "+n.getUas());
        System.out.println("");
        System.out.println("Nilai Akhir\t= "+n.hitungNA());
        System.out.println("");
        System.out.println("Index\t\t= "+n.index(n.hitungNA()));
        System.out.println("Keterangan\t= "+n.Keterangan(n.index(n.hitungNA())));
    }
    
}
