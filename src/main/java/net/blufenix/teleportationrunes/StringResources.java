package net.blufenix.teleportationrunes;

import org.bukkit.ChatColor;

/**
 * Created by blufenix on 7/31/15.
 */
public class StringResources {

    public static final String LOADED = "TeleportationRunes has been loaded!";
    public static final String UNLOADED = "TeleportationRunes has been unloaded!";
    public static final String DISABLED = "TeleportationRunes is disabled!";

    public static final String WAYPOINT_ACTIVATED = ChatColor.GREEN+"Bệ dịch chuyển đã được kích hoạt thành công!";
    public static final String WAYPOINT_ALREADY_ACTIVE = ChatColor.RED+"Bệ dịch chuyển này đã được kích hoạt từ trước.";
    public static final String WAYPOINT_CHANGED = ChatColor.GREEN+"Ký hiệu của bệ dịch chuyển đã được thay đổi!";
    public static final String WAYPOINT_SIGNATURE_EXISTS = ChatColor.RED+"Ký hiệu này đã được sử dụng. Đổi ký hiệu khác để kích hoạt bệ dịch chuyển này.";
    public static final String WAYPOINT_NOT_FOUND = ChatColor.RED+"Không có bệ dịch chuyển nào có ký hiệu khớp với cổng này.";
    public static final String WAYPOINT_DAMAGED = ChatColor.RED+"Không thể dịch chuyển do Bệ dịch chuyển bạn đang đi tới đã bị hư hại.";
    public static final String WAYPOINT_ALTERED = ChatColor.RED+"Huỷ liên kết với Cổng dịch chuyển do Ký hiệu của Bệ dịch chuyển đã bị thay đổi.";
    public static final String WAYPOINT_OBSTRUCTED = ChatColor.RED+"Khôgn thể dịch chuyển do Bệ dịch chuyển đang bị chặn.";
    public static final String WAYPOINT_DIFFERENT_WORLD = ChatColor.RED+"Bạn không thể dịch chuyển giữa các thế giới.";
}
