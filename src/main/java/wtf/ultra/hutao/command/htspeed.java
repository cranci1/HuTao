package wtf.ultra.hutao.command;

import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import static wtf.ultra.hutao.HuTao.setSpeed;

public class htspeed extends Command {
    public htspeed() {
        super("htspeed");
    }

    @Override
    public void handle(@NotNull String[] args) {
        if (args.length < 1) {
            // Handle incorrect command usage
            return;
        }

        try {
            int speedValue = Integer.parseInt(args[0]);
            setSpeed(speedValue);
        } catch (NumberFormatException e) {
            // Handle invalid number format
        }
    }
}