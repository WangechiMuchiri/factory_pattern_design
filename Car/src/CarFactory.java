/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
public class CarFactory {
    private String carType;

    public CarFactory(String carType) {
        this.carType = carType;
    }
    
    public Car getCar(String carType){
        if(!carType.isEmpty()){
        if (carType.equalsIgnoreCase("Volvo")){
            return new volvoImpl();
        }
        else if (carType.equalsIgnoreCase("Bentley")){
            return new BentleyImpl();
        }
        else if (carType.equalsIgnoreCase("Truck")){
            return new TruckImpl();
        }
        }
        return null;

}}
