package ro.ase.acs.facade;

public class CockpitFacade {
    private Engine engine = new Engine();
    private Brake brake = new Brake();
    private Lights lights = new Lights();

    public void startCar(){
        brake.setLoad(1);
        engine.start();
        engine.setThrottle(0.1f);
        lights.setAreHeadLightsOn(true);
        lights.setAreBrekeLightsOn(true);
    }

    public void stopCar(){
        engine.stop();
        brake.setLoad(1);
        lights.setAreBrekeLightsOn(false);
        lights.setAreHeadLightsOn(false);
    }

    public void emergencyStop(){
        brake.setLoad(1);
        engine.stop();
        lights.setAreBrekeLightsOn(true);
        lights.setAreHazardLightsOn(true);
    }
    //...
}
