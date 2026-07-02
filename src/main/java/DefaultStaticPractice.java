interface Vehicle {
    void start();

    default void stop(){
        System.out.println("Vehicle Stopping");
    }

    static int maxSpeed(){
        return 200;
    }
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Starting");
    }

//    @Override
//    public void stop() {
//        System.out.println("Car braking smoothly");
//    }


    @Override
    public void stop() {
        Vehicle.super.stop();
    }
}

public class DefaultStaticPractice {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        System.out.println("Max Speed: " + Vehicle.maxSpeed());
    }
}

