package wtf.ultra.hutao.command;

import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import static wtf.ultra.hutao.HuTao.setScaleFactor;

public class htscale extends Command {
    public htscale() {
        super("htscale");
    }

    @Override
    public void handle(@NotNull String[] args) {
        if (args.length < 1) {
            return;
        }

        try {
            double scaleFactorValue = Double.parseDouble(args[0]);
            setScaleFactor(scaleFactorValue);
        } catch (NumberFormatException e) {
        }
    }
}