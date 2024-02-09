public class LightCommand implements Command {
    private Light light;

    public LightCommand(String room) {
        light = new Light(room);
    }

    @Override
    public void on() {
        light.on();
    }

    @Override
    public void off() {
        light.off();
    }
}