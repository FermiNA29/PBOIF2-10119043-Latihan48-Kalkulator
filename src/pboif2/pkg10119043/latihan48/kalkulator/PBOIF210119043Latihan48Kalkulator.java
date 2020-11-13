/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan48.kalkulator;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program kalkulator
 */
public class PBOIF210119043Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        System.out.println("Value 1 = " + kalkulator.getValue1());
        System.out.println("Value 2 = " + kalkulator.getValue2());
        kalkulator.setNameProject();
        String note = "This project shown you how to manage method in java";
        kalkulator.setNoteProjrct(note);
        System.out.println("Result add is = " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result minus is = " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result multiplate is = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result division is = " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}
