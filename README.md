# CommandCreatorApi
Easy command class create

Tutorial 
new class create

----------------------------------------------------------------------------------

Example CommandTeleport
extends CommandCreator and 

3 method listening

@Override
public CommandTeleport(MainClass class, String commandName) {  //command name send your command 
  super(class,"commandteleport");
}

public List<String> onTabComplete(CommandSender sender,Command cmd, String label,String[] arg) {
  
return null;} //not worked tabComplete but arrayList create and send command worked the tab compelement
 
@Override
public void executeCommand(Player player,String label,String[] arg) {
  
}//command class argument create or set your work 
  
----------------------------------------------------------------------------------
  
command work activate 

  tutuorial join the your first class and 
private CommandTeleport commandTeleport;
  
public CommandTeleport getCommandTeleport() {
  return commandTeleport;
} 
  
@Override
public void onEnable() {
  commandTeleport=new  CommandTeleport(this,"commandteleport");  
}
  
----------------------------------------------------------------------------------
  
plugin.yml add
  
commands:
  commandteleport:
    usage: /commandteleport
    description: Example command
    aliases: [cmdtp]
  
-----------------------------------------------------------------------------------
  
easy Api 
 
