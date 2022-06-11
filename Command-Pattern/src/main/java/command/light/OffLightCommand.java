package command.light;

import domain.Light;
import enums.light.LightCommandType;

public class OffLightCommand implements LightCommand {

    Light light;

    public OffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(!isValid()) {
            throw new RuntimeException("Light is already turned off!!");
        }
        executeCommand();
    }

    @Override
    public boolean isValid() {
        return light.isOn();
    }

    @Override
    public boolean isApplicable(LightCommandType lightCommandType) {
        return lightCommandType.equals(LightCommandType.OFF_LIGHT);
    }

    @Override
    public void executeCommand() {
        light.setOn(false);
    }
}
