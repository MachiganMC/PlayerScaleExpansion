package be.machigan;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class PlayerScaleExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "player-scale";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Machigan";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.1";
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public String onRequest(OfflinePlayer p, @NotNull String params) {
        if (p == null || !p.isOnline()) return "";
        AttributeInstance scale = ((Player) p).getAttribute(Attribute.SCALE);
        if (scale == null) return "";
        return String.valueOf(scale.getValue());
    }
}
