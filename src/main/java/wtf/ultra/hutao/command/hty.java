package wtf.ultra.hutao.command;

import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import static wtf.ultra.hutao.HuTao.setY;

public class hty extends Command {
    public hty() {
        super("hty");
    }

    @Override
    public void handle(@NotNull String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: /hty <new_value>");
            return;
        }

        try {
            int newValue = Integer.parseInt(args[0]);
            setY(newValue);
            System.out.println("Successfully changed y to: " + newValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for y value");
        }
    }
}