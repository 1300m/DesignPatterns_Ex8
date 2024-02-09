public class AirCommand implements Command {
    private Airconditioner air;

    public AirCommand(String room) {
        air = new Airconditioner(room);
    }

    @Override
    public void on() {
        air.on();
        air.setTemp(25);
    }

    @Override
    public void off() {
        air.off();
    }
}