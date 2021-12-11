/*    */ package srnot.customcommandblocker.events;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ import srnot.customcommandblocker.customcommandblocker;
/*    */ 
/*    */ 
/*    */ public class enter
/*    */   implements Listener
/*    */ {
/*    */   private customcommandblocker plugin;
/*    */   
/*    */   public enter(customcommandblocker plugin) {
/* 19 */     this.plugin = plugin;
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void alEntrar(PlayerJoinEvent event) {
/* 24 */     Player jugador = event.getPlayer();
/*    */ 
/*    */     
/* 27 */     FileConfiguration config = this.plugin.getConfig();
/* 28 */     String Path = "Config.Welcome-Message";
/* 29 */     if (config.getString(Path).equals("true")) {
/* 30 */       List<String> mensaje = config.getStringList("Config.Welcome-Message-Text");
/* 31 */       for (int i = 0; i < mensaje.size(); i++) {
/* 32 */         String texto = mensaje.get(i);
/* 33 */         jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', texto.replaceAll("<player>", jugador.getName())));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\D2SIADO\Downloads\CustomCommandBlocker-Beta.v1.0.jar!\srnot\customcommandblocker\events\enter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */