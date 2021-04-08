package ro.ase.acs.facade;

public class Lights {
    private boolean areHeadLightsOn;
    private boolean areBrekeLightsOn;
    private boolean areHazardLightsOn;
    private boolean isSignalLeftOn;
    private boolean isSignalRightOn;

    public boolean isAreHeadLightsOn() {
        return areHeadLightsOn;
    }

    public void setAreHeadLightsOn(boolean areHeadLightsOn) {
        this.areHeadLightsOn = areHeadLightsOn;
        System.out.println(areHeadLightsOn ? "HeadLights On" : "HeadLights Off");
    }

    public boolean isAreBrekeLightsOn() {
        return areBrekeLightsOn;
    }

    public void setAreBrekeLightsOn(boolean areBrekeLightsOn) {
        this.areBrekeLightsOn = areBrekeLightsOn;
        System.out.println(areBrekeLightsOn ? "BrekeLights On" : "BrekeLights Off");

    }

    public boolean isAreHazardLightsOn() {
        return areHazardLightsOn;
    }

    public void setAreHazardLightsOn(boolean areHazardLightsOn) {
        this.areHazardLightsOn = areHazardLightsOn;
        System.out.println(areHazardLightsOn ? "HazarLights On" : "HazarLights Off");
    }

    public boolean isSignalLeftOn() {
        return isSignalLeftOn;
    }

    public void setSignalLeftOn(boolean signalLeftOn) {
        isSignalLeftOn = signalLeftOn;
        System.out.println(isSignalLeftOn ? "SignalLeft On" : "SignalLeft Off");
    }

    public boolean isSignalRightOn() {
        return isSignalRightOn;
    }

    public void setSignalRightOn(boolean signalRightOn) {
        isSignalRightOn = signalRightOn;
        System.out.println(isSignalRightOn ? "SignalRight On" : "SignalRight Off");
    }
}
