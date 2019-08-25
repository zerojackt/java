public class LedTV implements TV{

    public void turnOn() {
        System.out.println("On");
    }
    public void turnOff() {
        System.out.println("Off");
    }
    public void changeVolume(int volume) {
        System.out.println("Control volume");
    }
    public void changeChannel(int channel) {
        System.out.println("Look the channel");
    }

}
