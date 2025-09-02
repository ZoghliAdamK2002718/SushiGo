import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SushiGoPanel extends JPanel {
	private enum cardType{dumpling, sashimi, tempura, maki1, maki2, maki3, wasabi, chopsticks, pudding};
	private BufferedImage card;

	
	public SushiGoPanel(String type) {
		try {
		switch(type)
		{
			case "dumpling":
			{
					card = ImageIO.read(Card.class.getResource("/images/dumpling.png"));
				   
					
				
				break;
			}
			case "sashimi":
			{
					card = ImageIO.read(Card.class.getResource("/images/sashimi.png"));
				   
					
				  }	
				break;
			case "tempura":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/tempura.png"));
				   
					
			}	
				break;
			case "maki1":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/maki1.png"));
				   
					
			}	
				break;
			case "maki2":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/maki2.png"));
				   
					
			}	
				break;
			case "maki3":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/maki3.png"));
				   
					
				
				break;
			}
			case "wasabi":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/wasabi.png"));
				   
					
				
				break;
			}
			case "chopsticks":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/chopsticks.png"));
				   
					
				
				break;
			}
			case "pudding":
			{	 
					card = ImageIO.read(Card.class.getResource("/images/pudding.png"));
				   
					
				
				break;
			}
			default:
				System.out.println("Error: Card type not found");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		}
	}
}
