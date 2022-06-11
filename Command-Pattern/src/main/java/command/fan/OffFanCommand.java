package command.fan;

import domain.Fan;
import enums.fan.FanCommandType;

public class OffFanCommand implements FanCommand {

    Fan fan;

    public OffFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        if(!isValid()) {
            throw new RuntimeException("Fan is already turned off!!");
        }
        executeCommand();
    }

    @Override
    public boolean isValid() {
        return fan.isOn();
    }

    @Override
    public boolean isApplicable(FanCommandType fanCommandType) {
        return fanCommandType.equals(FanCommandType.OFF_FAN);
    }

    @Override
    public void executeCommand() {
        fan.setOn(false);
    }
}
