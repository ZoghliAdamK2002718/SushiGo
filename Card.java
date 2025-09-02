import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Card extends JPanel {
	private BufferedImage card;
	private int x;
	private int y;
	private BufferedImage back;
	private enum Cardtype{dumpling, sashimi, tempura, maki1, maki2, maki3, wasabi, chopsticks, pudding};
	public Card(String type)
	
	{
	try {
	back = ImageIO.read(Card.class.getResource("/images/sushigoback.png"));
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		
		}
	}
}



