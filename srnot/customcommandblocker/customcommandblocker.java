/*    */ package srnot.customcommandblocker;
/*    */ 
/*    */ import java.io.File;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.PluginDescriptionFile;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ import srnot.customcommandblocker.commands.ComandHelp;
/*    */ import srnot.customcommandblocker.commands.CommandPlugins;
/*    */ import srnot.customcommandblocker.commands.DiscordCommand;
/*    */ import srnot.customcommandblocker.commands.PrincipalComand;
/*    */ import srnot.customcommandblocker.commands.StoreCommand;
/*    */ import srnot.customcommandblocker.events.enter;
/*    */ 
/*    */ public class customcommandblocker extends JavaPlugin {
/* 20 */   PluginDescriptionFile pdffile = getDescription(); public String rutaConfig;
/* 21 */   public String version = this.pdffile.getVersion();
/* 22 */   public String nombre = ChatColor.GRAY + "[" + ChatColor.RED + this.pdffile.getName() + ChatColor.GRAY + "]";
/*    */   public void onEnable() {
/* 24 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.YELLOW + " Plugin has been enabled version" + ChatColor.GRAY + ": " + this.version);
/* 25 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.GOLD + "========================================");
/* 26 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.WHITE + "                                         ");
/* 27 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.RED + "           CustomCommandBlocker");
/* 28 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.WHITE + "                                         ");
/* 29 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.RED + "   Plugin By" + ChatColor.GRAY + ": " + ChatColor.YELLOW + "Golden Store");
/* 30 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.RED + "   Development By" + ChatColor.GRAY + ": " + ChatColor.YELLOW + "Sr.Not");
/* 31 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.RED + "   Copyright @ Golden Store 2021 - 2025");
/* 32 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.WHITE + "                                         ");
/* 33 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.GOLD + "========================================");
/* 34 */     registerCommands();
/* 35 */     registerConfig();
/* 36 */     registerEvents();
/*    */   }
/*    */   public void onDisable() {
/* 39 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.YELLOW + " Plugin has been disabled version" + ChatColor.GRAY + ": " + this.version);
/* 40 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.GOLD + "========================================");
/* 41 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.RED + "           CustomCommandBlocker");
/* 42 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.WHITE + "                                         ");
/* 43 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.YELLOW + "      Thanks For Using This Plugin :)");
/* 44 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.RED + "  Copyright @ Golden Store 2021 - 2025");
/* 45 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(this.nombre) + ChatColor.GOLD + "========================================");
/*    */   }
/*    */   
/*    */   public void registerCommands() {
/* 49 */     getCommand("help").setExecutor((CommandExecutor)new ComandHelp(this));
/* 50 */     getCommand("ccbl").setExecutor((CommandExecutor)new PrincipalComand(this));
/* 51 */     getCommand("discord").setExecutor((CommandExecutor)new DiscordCommand(this));
/* 52 */     getCommand("store").setExecutor((CommandExecutor)new StoreCommand(this));
/* 53 */     getCommand("plugins").setExecutor((CommandExecutor)new CommandPlugins(this));
/* 54 */     getCommand("pl").setExecutor((CommandExecutor)new CommandPlugins(this));
/*    */   }
/*    */   
/*    */   public void registerEvents() {
/* 58 */     PluginManager pm = getServer().getPluginManager();
/* 59 */     pm.registerEvents((Listener)new enter(this), (Plugin)this);
/*    */   }
/*    */   
/*    */   public void registerConfig() {
/* 63 */     File config = new File(getDataFolder(), "config.yml");
/* 64 */     this.rutaConfig = config.getPath();
/* 65 */     if (!config.exists()) {
/* 66 */       getConfig().options().copyDefaults(true);
/* 67 */       saveConfig();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\D2SIADO\Downloads\CustomCommandBlocker-Beta.v1.0.jar!\srnot\customcommandblocker\customcommandblocker.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */