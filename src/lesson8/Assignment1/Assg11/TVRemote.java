package lesson8.Assignment1.Assg11;

public class TVRemote implements RemoteControl {

    private boolean poweredOn = false;
    private int volume = 0;

    @Override
    public void powerOn() {
        poweredOn = true;
        System.out.println("TV remote powered on.");
    }

    @Override
    public void powerOff() {
        poweredOn = false;
        System.out.println("TV remote powered off.");
    }

    @Override
    public void volumeUp() {
        if (poweredOn) {
            volume++;
            System.out.println("TV volume increased to " + volume);
        } else {
            System.out.println("Remote control is off. Cannot adjust volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (poweredOn) {
            volume--;
            System.out.println("TV volume decreased to " + volume);
        } else {
            System.out.println("Remote control is off. Cannot adjust volume.");
        }
    }
}