/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
public class volvoImpl implements Car{

    @Override
    public int speed(int mileage) {
        int maxSpeed = mileage*2;
        return maxSpeed;
    }
}
