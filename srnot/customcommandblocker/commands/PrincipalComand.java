/*    */ package srnot.customcommandblocker.commands;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import srnot.customcommandblocker.customcommandblocker;
/*    */ 
/*    */ public class PrincipalComand
/*    */   implements CommandExecutor
/*    */ {
/*    */   private customcommandblocker plugin;
/*    */   
/*    */   public PrincipalComand(customcommandblocker plugin) {
/* 17 */     this.plugin = plugin;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
/* 23 */     if (!(sender instanceof Player)) {
/* 24 */       Bukkit.getConsoleSender().sendMessage(String.valueOf(this.plugin.nombre) + ChatColor.YELLOW + " Hey this command as not execute in console");
/* 25 */       return false;
/*    */     } 
/* 27 */     Player jugador = (Player)sender;
/* 28 */     if (args.length > 0) {
/* 29 */       if (args[0].equalsIgnoreCase("version")) {
/* 30 */         jugador.sendMessage(ChatColor.GOLD + "========================================");
/* 31 */         jugador.sendMessage(ChatColor.WHITE + "                                         ");
/* 32 */         jugador.sendMessage(ChatColor.RED + " CustomBlockCommands Verion" + ChatColor.GRAY + ": " + ChatColor.YELLOW + this.plugin.version);
/* 33 */         jugador.sendMessage(ChatColor.WHITE + "                                      ");
/* 34 */         jugador.sendMessage(ChatColor.GOLD + "========================================");
/* 35 */         return true;
/*    */       } 
/* 37 */       if (args[0].equalsIgnoreCase("reload")) {
/* 38 */         this.plugin.reloadConfig();
/* 39 */         jugador.sendMessage(String.valueOf(this.plugin.nombre) + ChatColor.YELLOW + " the config has been reloaded");
/* 40 */         return true;
/*    */       } 
/*    */ 
/*    */ 
/*    */       
/* 45 */       jugador.sendMessage(String.valueOf(this.plugin.nombre) + ChatColor.YELLOW + " unknown or misspelled command");
/* 46 */       return true;
/*    */     } 
/*    */     
/* 49 */     jugador.sendMessage(ChatColor.GOLD + "========================================");
/* 50 */     jugador.sendMessage(ChatColor.WHITE + "                                       ");
/* 51 */     jugador.sendMessage(ChatColor.RED + "          CustomCommandBlocker           ");
/* 52 */     jugador.sendMessage(ChatColor.WHITE + "                                       ");
/* 53 */     jugador.sendMessage(ChatColor.WHITE + "/help (Say you the custom message (edit in config.yml))");
/* 54 */     jugador.sendMessage(ChatColor.WHITE + "/pl - /plugins (Say you the custom message (edit in config.yml))");
/* 55 */     jugador.sendMessage(ChatColor.WHITE + "/store (Say you the store (edit in config.yml))");
/* 56 */     jugador.sendMessage(ChatColor.WHITE + "/discord (Say you the discord (edit in config.yml))");
/* 57 */     jugador.sendMessage(ChatColor.WHITE + "/ccbl version (say you the plugin version)");
/* 58 */     jugador.sendMessage(ChatColor.WHITE + "/ccbl reload (reload the config.yml)   ");
/* 59 */     jugador.sendMessage(ChatColor.GOLD + "========================================");
/* 60 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\D2SIADO\Downloads\CustomCommandBlocker-Beta.v1.0.jar!\srnot\customcommandblocker\commands\PrincipalComand.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */