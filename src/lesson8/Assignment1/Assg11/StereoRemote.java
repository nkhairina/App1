package lesson8.Assignment1.Assg11;

public class StereoRemote implements RemoteControl {

    private boolean poweredOn = false;
    private int volume = 0;
    private String mode = "FM";

    @Override
    public void powerOn() {
        poweredOn = true;
        System.out.println("Stereo remote powered on.");
    }

    @Override
    public void powerOff() {
        poweredOn = false;
        System.out.println("Stereo remote powered off.");
    }

    @Override
    public void volumeUp() {
        if (poweredOn) {
            volume++;
            System.out.println("Stereo volume increased to " + volume);
        } else {
            System.out.println("Remote control is off. Cannot adjust volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (poweredOn) {
            volume--;
            System.out.println("Stereo volume decreased to " + volume);
        } else {
            System.out.println("Remote control is off. Cannot adjust volume.");
        }
    }

    public void changeMode(String newMode) {
        if (poweredOn) {
            this.mode = newMode;
            System.out.println("Stereo mode changed to " + mode);
        } else {
            System.out.println("Remote control is off. Cannot change mode.");
        }
    }
}
