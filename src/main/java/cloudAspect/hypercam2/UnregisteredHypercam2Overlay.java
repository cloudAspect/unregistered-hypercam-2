package cloudAspect.hypercam2;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.inject.Inject;
import javax.swing.*;

import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.util.ImageUtil;

class UnregisteredHypercam2Overlay extends Overlay {
	
	private Client client;
	
	private BufferedImage image;
	
	private final UnregisteredHypercam2Config config;
	
	@Inject
	private UnregisteredHypercam2Overlay(Client client, UnregisteredHypercam2Config config) {
		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ALWAYS_ON_TOP);
		this.config = config;
		this.client = client;
		this.image = ImageUtil.loadImageResource(getClass(), "hypercam.png");
	}
	
	@Override
	public Dimension render(Graphics2D graphics) {
		if (image != null) {
			graphics.drawImage(image, 0,  0, null);
		}
		return null;
	}
}
