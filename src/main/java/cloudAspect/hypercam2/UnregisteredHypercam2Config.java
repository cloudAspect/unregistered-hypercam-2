package net.runelite.client.plugins.hypercam;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("hypercam")
public interface HypercamConfig extends Config {
	@ConfigItem(
			position = 1,
			keyName = "showHyperCam",
			name = "Enable Hypercam 2",
			description = "Displays Unregistered Hypercam 2 overlay"
	)
	default boolean showHyperCam() {
		return true;
	}
}