package command.light;

import domain.Light;
import enums.light.LightCommandType;

public class OnLightCommand implements LightCommand {

    Light light;

    public OnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if(!isValid()) {
            throw new RuntimeException("Light is already turned on!!");
        }
        executeCommand();
    }

    @Override
    public boolean isValid() {
        return !light.isOn();
    }

    @Override
    public boolean isApplicable(LightCommandType lightCommandType) {
        return lightCommandType.equals(LightCommandType.ON_LIGHT);
    }

    @Override
    public void executeCommand() {
        light.setOn(true);
    }
}
