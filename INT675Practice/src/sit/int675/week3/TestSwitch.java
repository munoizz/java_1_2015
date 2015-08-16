/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week3;

import java.util.Scanner;

/**
 *
 * @author Student Lab
 */
public class TestSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = null;
        do {
            String color = null;
            System.out.println("Please enter day in String: ");
            day = sc.next();
            switch (day) {
                case "Monday":
                case "monday":
                case "MONDAY":
                case "MON":
                    color = "Yellow";
                    break;
                case "Tuesday":
                    color = "Pint";
                    break;
                case "Wed":
                    color = "Green";
                    break;
                case "Thu":
                    color = "Orange";
                    break;
                case "Fri":
                    color = "Blue";
                    break;
                default:
                    color = "Invalid day";
                    break;
            }
            System.out.println("Day: " + day + ",Color: " + color);
        } while (!day.equalsIgnoreCase("stop"));
    }
}
