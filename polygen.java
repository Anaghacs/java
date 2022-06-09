import java.applet.*;
import java.awt.*;

public class polygen extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(50,20,300,20);
		g.drawOval(50,250,100,100);
		g.drawRect(50,400,100,50);
		g.drawOval(200,300,150,40);

		g.drawOval(80,70,150,150);
		g.setColor(Color.BLACK);
		g.fillOval(120,120,15,15);
		g.fillOval(170,120,15,15);
		g.drawArc(130,180,50,20,180,180);
	}
}