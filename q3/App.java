public class App {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        System.out.println("slot0, Light Bedroom");
        Command slot0 = new LightCommand("Bedroom");
        remote.setCommand(slot0);
        remote.on();
        remote.off();
        System.out.println("--------------------");

        System.out.println("slot1, Light Kitchen");
        Command slot1 = new LightCommand("Kitchen");
        remote.setCommand(slot1);
        remote.on();
        remote.off();
        System.out.println("--------------------");

        System.out.println("slot2, AC Bedroom");
        Command slot2 = new AirCommand("Bedroom");
        remote.setCommand(slot2);
        remote.on();
        remote.off();
        System.out.println("--------------------");

        System.out.println("test one unavailable slot, slot 3");
        Command slot3 = null;
        remote.setCommand(slot3);
        remote.on();
        remote.off();
        System.out.println("--------------------");
    }
}
