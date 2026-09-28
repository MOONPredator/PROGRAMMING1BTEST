/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author ST10501132 Lionel Mthunzi
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200 }
};
    

        int[] totalSales = new int[cities.length];
        int maxSales = 0;
        String maxCity = "";
        

        System.out.println("----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
        }

        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            totalSales[i] = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf("%-25s %d\n",cities[i], totalSales[i]);
            
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                maxCity = cities[i];
            }
        }
        

        System.out.println("CITY WITH THE MOST SALES: " + maxCity);
        System.out.println("----------------------------------------");
    }
}