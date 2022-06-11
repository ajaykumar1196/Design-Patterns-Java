import command.fan.FanCommand;
import command.fan.OffFanCommand;
import command.fan.OnFanCommand;
import command.light.LightCommand;
import command.light.OffLightCommand;
import command.light.OnLightCommand;
import domain.Fan;
import domain.Light;
import enums.fan.FanCommandType;
import enums.light.LightCommandType;

import java.util.Arrays;
import java.util.List;

public class CommandDemo {

    private static List<LightCommand> lightCommandList;
    private static List<FanCommand> fanCommandList;

    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        lightCommandList = Arrays.asList(new OnLightCommand(light), new OffLightCommand(light));
        fanCommandList = Arrays.asList(new OnFanCommand(fan), new OffFanCommand(fan));

        executeLightCommand(LightCommandType.ON_LIGHT);
        executeLightCommand(LightCommandType.OFF_LIGHT);
    }

    private static void executeLightCommand(LightCommandType lightCommandType) {
        for(LightCommand lightCommand : lightCommandList) {
            if(lightCommand.isApplicable(lightCommandType)) {
                lightCommand.execute();
            }
        }
    }

    private static void executeFanCommand(FanCommandType fanCommandType) {
        for(FanCommand fanCommand : fanCommandList) {
            if(fanCommand.isApplicable(fanCommandType)) {
                fanCommand.execute();
            }
        }
    }
}
