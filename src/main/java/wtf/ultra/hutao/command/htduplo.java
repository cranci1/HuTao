package wtf.ultra.hutao.command;

import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import net.minecraft.util.EnumChatFormatting;

import static wtf.ultra.hutao.HuTao.setDuplicate;

public class htduplo extends Command {
    public htduplo() {
        super("htdupli");
    }

    @Override
    public void handle(@NotNull String[] args) {
        if (args.length >= 1) {
            try {
                double newDuplo = Double.parseDouble(args[0]);
                setDuplicate(newDuplo);
                System.out.println(EnumChatFormatting.RED + "Usage: /htdupli <scale>");
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println(EnumChatFormatting.RED + "Usage: /htdupli <scale>");
            }
        } else {
            // Handle missing scale parameter
            System.out.println(EnumChatFormatting.RED + "Usage: /htdupli <scale>");
        }
    }
}
