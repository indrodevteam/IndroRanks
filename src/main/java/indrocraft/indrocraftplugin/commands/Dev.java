package indrocraft.indrocraftplugin.commands;

import indrocraft.indrocraftplugin.Main;
import indrocraft.indrocraftplugin.dataManager.ConfigTools;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class Dev implements CommandExecutor {

    private Main main;
    public Dev(Main main) {this.main = main;}

    //public FileConfiguration config = getConfig();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //Player player = (Player) sender;
        FileConfiguration config = ConfigTools.getFileConfig("config.yml");

        if (sender.isOp()) {

        }

        return false;
    }
}
