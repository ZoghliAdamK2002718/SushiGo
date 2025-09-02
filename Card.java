import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Card {
	private BufferedImage card;
	private String type;

	public Card(String t) {
		this.type = t;
	}

	public String getType() {
		return type;
	}
	// ...existing code...



