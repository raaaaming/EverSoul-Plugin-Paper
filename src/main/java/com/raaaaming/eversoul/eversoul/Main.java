package com.raaaaming.eversoul.eversoul;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public final class Main extends JavaPlugin implements Listener {

    public static String prefix = "§f§l [ §bEverSoul §f§l] §7";
    public static HashMap<Player, Integer> count = new HashMap<>();

    public static List<String> souls = Arrays.asList("메피스토펠레스", "제이드", "린지", "클레르", "캐서린", "셰리", "도라", "로제", "리타", "아이린", "미카", "시하", "클라라", "하루", "순이", "아이라", "플린", "캐니", "샤링", "루리", "탈리아", "미리암", "르네", "클로이", "나이아", "비비안", "니콜", "르웨인", "픽시", "알리샤", "재클린", "페트라", "니니", "프림", "에루샤", "레베카", "비올레트", "카렌", "무명", "캐스퍼", "아드리안", "아야매");
    public static List<String> relics = Arrays.asList("");

    public static List<String> getSoulInfo(Integer integer) {
        String lore1, lore2, lore3, lore4, lore5, lore6;
        switch (integer) {
            case 0:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 메피스토펠레스";
                lore3 = " §f[ 이명 ]   | 오퍼레이터 원";
                lore4 = " §f[ 유물 ]   | 방주 메타트론";
                lore5 = " §f[ 클래스 ] | 캐스터";
                lore6 = " §f§l\"새로운 관리자의 임명 절차를 시작합니다. 오퍼레이터 메피스토펠레스, 구원자님을 기다렸습니다.\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 1:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 제이드";
                lore3 = " §f[ 이명 ]   | 황금의 재상";
                lore4 = " §f[ 유물 ]   | 미다스의 손";
                lore5 = " §f[ 클래스 ] | 캐스터";
                lore6 = " §f§l\"황금의 가치를 똑똑히 알려드리죠. 황금이 해결하지 못하는 일은, 인간이 해결하지 못하는 일일뿐.\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 2:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 린지";
                lore3 = " §f[ 이명 ]   | 레이디 누아르";
                lore4 = " §f[ 유물 ]   | 프라가라흐";
                lore5 = " §f[ 클래스 ] | 워리어";
                lore6 = " §f§l\"똑똑히 지켜보세요. 최고가 나아가는 길을. 솔레이 왕국, 최고의 검은 접니다.\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 3:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 클레르";
                lore3 = " §f[ 이명 ]   | 꺾이지 않는 신념";
                lore4 = " §f[ 유물 ]   | 잔 다르크의 깃발";
                lore5 = " §f[ 클래스 ] | 디펜더";
                lore6 = " §f§l\"최선을 다하겠습니다. 급할수록 이성적으로 판단해야 합니다. 모두를 위해서.\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 4:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 캐서린";
                lore3 = " §f[ 이명 ]   | 성령의 손길";
                lore4 = " §f[ 유물 ]   | 성해포";
                lore5 = " §f[ 클래스 ] | 서포터";
                lore6 = " §f§l\"아이 참… 좀 더 규칙적으로 생활하셔야죠. 어어? 자꾸 누우시면 안 돼요!\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 5:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 셰리";
                lore3 = " §f[ 이명 ]   | 스파클링 피스톨";
                lore4 = " §f[ 유물 ]   | 신편귀독주";
                lore5 = " §f[ 클래스 ] | 레인저";
                lore6 = " §f§l\"낭만은 알콜 속에 있는 법이야♥ 술 마시는 데엔 사계절의 풍경만으로도 충분하지!\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 6:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 도라";
                lore3 = " §f[ 이명 ]   | 최강 곰돌이";
                lore4 = " §f[ 유물 ]   | 골디락스의 빈 그릇";
                lore5 = " §f[ 클래스 ] | 워리어";
                lore6 = " §f§l\"언젠간 진짜 곰돌이가 될 거야! 내 머리랑 발 어때? 진짜 곰돌이 같지?\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 7:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 로제";
                lore3 = " §f[ 이명 ]   | 석양빛 베일";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | 캐스터";
                lore6 = " §f§l\"제 기도가 닿지 않는 곳은 없답니다.\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 8:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 리타";
                lore3 = " §f[ 이명 ]   | 태양의 기사";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | 디펜더";
                lore6 = " §f§l\"일단 뚫겠슴다!\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 9:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | 아이린";
                lore3 = " §f[ 이명 ]   | 근면한 정신";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | 디펜더";
                lore6 = " §f§l\"\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 10:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 11:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 12:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 13:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 14:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 15:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 16:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 17:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 18:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 19:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 20:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
            case 21:
                lore1 = " §f[ INFO ] ";
                lore2 = " §f[ 이름 ]   | ";
                lore3 = " §f[ 이명 ]   | ";
                lore4 = " §f[ 유물 ]   | ";
                lore5 = " §f[ 클래스 ] | ";
                lore6 = " §f§l\"아무말\"";
                return Arrays.asList(lore1, lore2, lore3, lore4, lore5, lore6);
        }
        return null;
    }

    public static Inventory soul = Bukkit.createInventory(null, 45, "일반 뽑기(픽업 기능 추가 예정)");
    public static Inventory relic = Bukkit.createInventory(null, 54, "유물 뽑기(3픽 기능 추가 예정)");

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(prefix + "구원의 방주가 활성화되었습니다");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info(prefix + "구원의 방주를 슬립모드로 전환합니다.");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("es")) {
            if (args.length > 0) {
                if (args[0] == "help") {
                    p.sendMessage(Main.prefix + "구원의 방주 명령어 도움말");
                    p.sendMessage(Main.prefix + "1. /es help  | 도움말을 호출함");
                    p.sendMessage(Main.prefix + "2. /es 일반  | 정령을 뽑습니다");
                    p.sendMessage(Main.prefix + "3. /es 유물  | 유물을 뽑습니다");
                    if (p.isOp()) {
                        p.sendMessage(Main.prefix + "4. /es setup | 랜덤한 좌표에 스테이지를 소환함");
                    }
                } else if (args[0].equalsIgnoreCase("일반")) {
                    ItemStack s = new ItemStack(Material.LIME_STAINED_GLASS_PANE);
                    ItemStack pane = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
                    ItemMeta meta = s.getItemMeta();
                    ItemMeta meta2 = s.getItemMeta();
                    meta2.setDisplayName(" ");
                    pane.setItemMeta(meta2);
                    Random random = new Random();
                    random.setSeed(System.currentTimeMillis());
                    if (args[1].equalsIgnoreCase("1")) {
                        for (int i = 0; i < 45; i++) {
                            soul.setItem(i, pane);
                        }
                        Integer n = random.nextInt(21);
                        meta.setDisplayName(Main.souls.get(n));
                        meta.setLore(Main.getSoulInfo(n));
                        s.setItemMeta(meta);
                        soul.setItem(22, s);
                        p.openInventory(soul);
                    } else if (args[1].equalsIgnoreCase("10")) {
                        for (int i = 0; i < 45; i++) {
                            soul.setItem(i, pane);
                        }
                        for (int i = 0; i < 10; i++) {
                            Integer n = random.nextInt(21);
                            meta.setDisplayName(Main.souls.get(n));
                            meta.setLore(Main.getSoulInfo(n));
                            s.setItemMeta(meta);
                            if (i < 5) {
                                soul.setItem(9 + i * 2, s);
                            } else {
                                soul.setItem(27 + (i - 5) * 2, s);
                            }
                        }
                        p.openInventory(soul);
                    }
                } else if (args[0].equalsIgnoreCase("유물")) {
                    if (args[1].equalsIgnoreCase("1")) {
                    } else if (args[1].equalsIgnoreCase("5")) {
                    }
                } else {
                    p.sendMessage(Main.prefix + "구원의 방주 명령어 도움말");
                    p.sendMessage(Main.prefix + "1. /es help  | 도움말을 호출함");
                    p.sendMessage(Main.prefix + "2. /es 일반  | 정령을 뽑습니다");
                    p.sendMessage(Main.prefix + "3. /es 유물  | 유물을 뽑습니다");
                    if (p.isOp()) {
                        p.sendMessage(Main.prefix + "4. /es setup | 랜덤한 좌표에 스테이지를 소환함");
                    }
                }
            }
        }
        return false;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inv = e.getClickedInventory();
        if (e.getCurrentItem().getType() == Material.WHITE_STAINED_GLASS_PANE) {
            e.setCancelled(true);
        }
    }
}