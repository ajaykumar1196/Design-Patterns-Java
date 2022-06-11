package command.fan;

import enums.fan.FanCommandType;

public interface FanCommand {

    public void execute();
    public boolean isValid();
    public boolean isApplicable(final FanCommandType fanCommandType);
    public void executeCommand();
}
