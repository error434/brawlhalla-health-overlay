// by error434
// copyright(©) 2020

package me.buffsee.bhh;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class ImageRounder {

	public BufferedImage getRoundedImage(BufferedImage bufferedimage) {
		int width = bufferedimage.getWidth();
		int height = bufferedimage.getHeight();
		BufferedImage circleBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB_PRE);
		Graphics2D g2 = circleBuffer.createGraphics();
	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
	    g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setClip(new Ellipse2D.Double(0, 0, width, height));
		g2.drawImage(bufferedimage, 0, 0, width, height, null);
		return circleBuffer;
	}
	
}


