package com.comixsyt.ms;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class bugcommand implements ICommand
{
  private List aliases;
  public bugcommand()
  {
    this.aliases = new ArrayList();
    this.aliases.add("bugs");
    this.aliases.add("issues");
    this.aliases.add("report");

  }

  @Override
  public String getCommandName()
  {
    return "bugs";
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "Report bugs in the mod!";
  }

  @Override
  public List getCommandAliases()
  {
    return this.aliases;
  }

  @Override
  public void processCommand(ICommandSender icommandsender, String[] astring)
  {
	  EntityPlayer player;
      
      if(icommandsender instanceof EntityPlayer){
              player = (EntityPlayer)icommandsender;
      } 
      else {
    	  	
              //icommandsender.sendChatToPlayer(astring "test");
             // icommandsender.addChatMessage(IChatComponent );
              return;
      }
  }

  @Override
  public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
  {
    return true;
  }

  @Override
  public List addTabCompletionOptions(ICommandSender icommandsender,
      String[] astring)
  {
    return null;
  }

  @Override
  public boolean isUsernameIndex(String[] astring, int i)
  {
    return false;
  }

  @Override
  public int compareTo(Object o)
  {
    return 0;
  }
}