package ro.ase.acs.facade;

public class Engine {
    private float throttle = 0;

    public float getThrottle() {
        return throttle;
    }

    public void setThrottle(float throttle) {
        if (throttle >= 0 && throttle <= 1) {
            this.throttle = throttle;
            System.out.println("throttle lvl: " + this.throttle);
        }
    }

    public void start() {
        System.out.println("Engine has started");
    }

    public void stop() {
        System.out.println("Engine has stoped");
    }
}
