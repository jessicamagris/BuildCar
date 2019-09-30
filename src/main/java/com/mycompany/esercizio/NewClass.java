/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio;

/**
 *
 * @author jessi
 */
public class NewClass {
    /*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jessi
 */

    public static void main(String[] args) {
        int length = 12;
        int doors = 2;
        System.out.println(metodo(length,doors));

    }
    public static String metodo(int length, int doors){
        String top = " " + repeat("_", length - 3) + "\n";
        String body = "|" + repeat("[]", doors / 2) + repeat(" ", length - (3 + doors * 2)) + repeat("[]", doors - (doors / 2)) + "\\\n";
        int wheels = 0;
        String chassis;
        if (length >= 12) {
            wheels = 2 + (length - 10) / 2;
            chassis = repeat("-o", wheels - wheels / 2) + repeat("-", length - (wheels * 2 + 1)) + repeat("o-", wheels / 2) + "'";
        } else {
            chassis = "-o" + repeat("-", length - 5) + "o-" + "'";
        }
        return top + body + chassis;
    }
    public static String repeat(String str, int n) {
        String out = "";
        for (int i = 0; i < n; i++) {
            out = out + str;
        }
        return out;
    }

}//fine classe


