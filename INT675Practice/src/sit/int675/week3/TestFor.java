/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week3;

/**
 *
 * @author Student Lab
 */
public class TestFor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("----------------------");
        int i = 20;
        for (;;) {
            System.out.println("i = " + i--);
            if (i < 1) {
                break;
            }
        }
    }

}
