/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
import java.lang.String;
import java.util.Scanner;

public class CalculateSpeed {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter type of car:");
        String carType = myObj.nextLine();
        
        Scanner miles = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter mileage:");
        int numOfMiles = miles.nextInt();
        CarFactory cf = new CarFactory("");
        System.out.println(cf.getCar(carType).speed(numOfMiles)+ "KPH"); 
        
    }

}
