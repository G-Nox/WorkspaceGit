package controller;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RandomBild {
	private Random ran;
	private String path;
//	private BufferedImage pic;

	public RandomBild() {
		ran = new Random();
		int a = ran.nextInt(12) + 1;
		String b = new String();
		if (a < 10) {
			b = "0" + a;
		} else {
			b = "" + a;
		}
		path = "/images/avatar/avatar" + b;
//		try {
//			pic = ImageIO.read(new File(path));
//		} catch (IOException ex) {
//			System.out.println("OMG, can't belive. It fails to loade the Image!");
//		}
	}

	public JLabel bildBau(){
		ImageIcon image = new ImageIcon(path);
		Image scaled = image.getImage();
		scaled = scaled.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		JLabel myPictureLabel = new JLabel(new ImageIcon(scaled));
		myPictureLabel.setSize(new Dimension(200, 200));
		return myPictureLabel;
	}
	
	public String getPath() {
		return path;
	}

//	public BufferedImage getPic() {
//		return pic;
//	}
}
