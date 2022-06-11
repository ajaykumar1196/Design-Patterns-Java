package command.fan;

import domain.Fan;
import enums.fan.FanCommandType;

public class OnFanCommand implements FanCommand {

    Fan fan;

    public OnFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        if(!isValid()) {
            throw new RuntimeException("Fan is already turned on!!");
        }
        executeCommand();
    }

    @Override
    public boolean isValid() {
        return !fan.isOn();
    }

    @Override
    public boolean isApplicable(FanCommandType fanCommandType) {
        return fanCommandType.equals(FanCommandType.ON_FAN);
    }

    @Override
    public void executeCommand() {
        fan.setOn(true);
    }
}
