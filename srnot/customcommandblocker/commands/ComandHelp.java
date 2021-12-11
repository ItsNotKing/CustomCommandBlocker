/*    */ package srnot.customcommandblocker.commands;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import srnot.customcommandblocker.customcommandblocker;
/*    */ 
/*    */ 
/*    */ public class ComandHelp
/*    */   implements CommandExecutor
/*    */ {
/*    */   private customcommandblocker plugin;
/*    */   
/*    */   public ComandHelp(customcommandblocker plugin) {
/* 20 */     this.plugin = plugin;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
/* 26 */     if (!(sender instanceof Player)) {
/* 27 */       Bukkit.getConsoleSender().sendMessage(String.valueOf(this.plugin.nombre) + ChatColor.YELLOW + " Hey this command as not execute in console");
/* 28 */       return false;
/*    */     } 
/* 30 */     Player jugador = (Player)sender;
/* 31 */     FileConfiguration config = this.plugin.getConfig();
/* 32 */     String Path = "Config.Command-Help";
/* 33 */     if (config.getString(Path).equals("true")) {
/* 34 */       List<String> mensaje = config.getStringList("Config.Help-Message");
/* 35 */       for (int i = 0; i < mensaje.size(); i++) {
/* 36 */         String texto = mensaje.get(i);
/* 37 */         jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("<player>", jugador.getName())));
/*    */       } 
/*    */     } 
/* 40 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\D2SIADO\Downloads\CustomCommandBlocker-Beta.v1.0.jar!\srnot\customcommandblocker\commands\ComandHelp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */