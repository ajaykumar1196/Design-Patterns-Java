package command.light;

import enums.light.LightCommandType;

public interface LightCommand {

    public void execute();
    public boolean isValid();
    public boolean isApplicable(final LightCommandType lightCommandType);
    public void executeCommand();
}
