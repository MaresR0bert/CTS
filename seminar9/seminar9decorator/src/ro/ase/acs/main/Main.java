package ro.ase.acs.main;

import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.Vehicle;
import ro.ase.acs.decorator.VehicleWithAlarm;
import ro.ase.acs.decorator.VehicleWithParkingSensors;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red",300,4);
        car.start();
        car.stop();
        VehicleWithAlarm carWithAlarm = new VehicleWithAlarm(car);
        carWithAlarm.start();
        carWithAlarm.stop();
        carWithAlarm.activateAlarm();

        Vehicle carWithParkingSensors = new VehicleWithParkingSensors(car,5);
        carWithParkingSensors.start();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Vehicle carWithAlarmAndParkingSensors = new VehicleWithParkingSensors(new VehicleWithAlarm(car),3);
        carWithAlarmAndParkingSensors.start();
        carWithAlarmAndParkingSensors.stop();

        Vehicle vehicle = new Vehicle() {
            @Override
            public void start() {
                System.out.println("veh on");
            }

            @Override
            public void stop() {
                System.out.println("veh off");
            }
        };
    }
}
