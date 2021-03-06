
package hobbyist.samIam.pixelcenter.commands;

import hobbyist.samIam.pixelcenter.PixelCenter;
import hobbyist.samIam.pixelcenter.utility.TeleportUtility;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;

public class TeleportSpawn implements CommandExecutor{

    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        if(src instanceof Player){
            Player p = (Player)src;
            TeleportUtility.TeleportSpawn(p);
        } 
        else 
        {
            String logMsg = "This command can't be used from console or command block.";
            PixelCenter.getLogger().info(logMsg);
        }
        
        return CommandResult.success();
    }
    
}
