package blueocn;

public class CarFacade {

    Ignition ignition = new Ignition();
    Clutch clutch = new Clutch();
    Accelerator accelerator = new Accelerator();
    GearStick gearStick = new GearStick();
    Handbrake handbrake = new Handbrake();

    public void drive() {
        ignition.turnOn();
        changeGear(1);
        handbrake.pushDown();
        accelerator.press();
        clutch.press();
    }

    private void changeGear(int gear) {
        clutch.press();
        gearStick.changeGear(gear);
        accelerator.press();
        clutch.lift();
    }
}
