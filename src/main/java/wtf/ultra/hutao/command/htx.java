package wtf.ultra.hutao.command;

import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import static wtf.ultra.hutao.HuTao.setX;

public class htx extends Command {
    public htx() {
        super("htx");
    }

    @Override
    public void handle(@NotNull String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: /htx <new_value>");
            return;
        }

        try {
            int newValue = Integer.parseInt(args[0]);
            setX(newValue);
            System.out.println("Successfully changed x to: " + newValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for x value");
        }
    }
}