package net.runelite.client.plugins.hypercam;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Unregistered Hypercam 2",
		description = "Shows the Unregistered Hypercam 2 logo as an overlay",
		tags = {"overlay", "meme", "fun", "cosmetic"}
)
public class HypercamPlugin extends Plugin {
	
	@Inject
	private OverlayManager overlayManager;
	
	@Inject
	private HypercamOverlay overlay;
	
	@Inject
	private HypercamConfig config;
	
	@Provides
	HypercamConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(HypercamConfig.class);
	}
	
	@Override
	protected void startUp() throws Exception {
		overlayManager.add(overlay);
	}
	
	@Override
	protected void shutDown() throws Exception {
		overlayManager.remove(overlay);
	}
}
