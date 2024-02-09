//Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void on() {
        if(command == null) {
            System.out.println("On button No command is assigned to this slot");
        }
        else {
            command.on();
        }
    }

    public void off() {
        if(command == null) {
            System.out.println("Off button No command is assigned to this slot");
        }
        else {
            command.off();
        }
    }
}
