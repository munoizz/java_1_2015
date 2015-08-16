/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class CountLetter {
    private String sentence;
    private int count[] = new int[26];

    public int[] getCount() {
        return count;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
        count();
    }

    public void count() {
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < sentence.length(); i++) {
            char x = sentence.charAt(i);
            if (x >= 65 && x <= 65 + 25) {
                count[x - 65]++;
            }else if(x>=97 && x<=97+25){
                count[x-97]++;
            }
        }
    }

    public String getResult(int itemPerLine) {
        StringBuilder tmp = new StringBuilder();
        int x = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                tmp.append((char) (i + 65) + ": " + count[i]);
                tmp.append(x % itemPerLine == 0 ? "\n" : ",\t");
                x = x + 1;
            }
        }
        if ((x - 1) % itemPerLine != 0) {
            tmp.delete(tmp.length() - 2, tmp.length() - 1);
        }
        return tmp.toString();
    }

    public static void main(String[] args) {
        CountLetter cl = new CountLetter();
        Scanner sc = new Scanner(System.in);      
        System.out.println("Enter any sentence: ");
        String str = sc.nextLine().toUpperCase();
        cl.setSentence(str);
        System.out.println(cl.getResult(5));      
        
        String strTest="AABBBCCCCaabbbcccc";
        cl.setSentence(strTest);
        System.out.println("===================================================");
        System.out.println(strTest);
        System.out.println(cl.getResult(8));
       

    }
}
