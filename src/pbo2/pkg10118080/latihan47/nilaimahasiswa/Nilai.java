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
public class Nilai {
    private  double quiz,uts,uas;

    public Nilai(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }
    
    public double hitungNA(){
        return (this.quiz*20/100)+(this.uts*30/100)+(this.uas*50/100);
    }
    
    public char index(double na){
        if ((na>= 0) && (na<=45)) {
            return 'E';
        } else if ((na> 45) && (na<=56)) {
            return 'D';
        }else if ((na> 56) && (na<=68)) {
            return 'C';
        }else if ((na> 68) && (na<=80)) {
            return 'B';
        }else if ((na> 80) && (na<=100)) {
            return 'A';
        }else{
            return 'X';
        }
    }
    
    public String Keterangan(char a){
        if (a == 'A') {
            return "Sangat Baik";
        } else if (a == 'B') {
            return "Baik";
        }else if (a == 'C') {
            return "Cukup";
        }else if (a == 'D') {
            return "Kurang";
        }else if (a == 'E') {
            return "Sangat Kurang";
        }else{
            return "Nilai Tidak Terdefinisi";
        }    
    }
    
    
    
}
