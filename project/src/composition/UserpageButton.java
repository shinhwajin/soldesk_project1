package composition;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class UserpageButton extends JButton {
	private static final long serialVersionUID = 1L;
	public static int num = 1;

	public UserpageButton() {
		super();
		decorate();
	}

	public UserpageButton(String text) {
		super(text);
		decorate();
	}

	public UserpageButton(Action action) {
		super(action);
		decorate();
	}

	public UserpageButton(Icon icon) {
		super(icon);
		decorate();
	}

	public UserpageButton(String text, Icon icon) {
		super(text, icon);
		decorate();
	}

	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (getModel().isArmed()) {
			graphics.setColor(new Color(255, 255, 255));
		} else if (getModel().isRollover()) {
			if (num == 1)
				graphics.setColor((new Color(195, 195, 195)));// 버튼에 커서 올렸을때
			else if (num == 2)
				graphics.setColor((new Color(239, 156, 218)));// 버튼에 커서 올렸을때
			else
				graphics.setColor((new Color(239, 156, 218)));// 버튼에 커서 올렸을때
		} else {
			if (num == 1)
				graphics.setColor((new Color(255, 255, 255)));// 평상시
			else if (num == 2)
				graphics.setColor((new Color(233, 189, 242)));// 버튼에 커서 올렸을때
			else
				graphics.setColor((new Color(233, 189, 242)));// 평상시
		}
		graphics.fillRoundRect(0, 0, width, height, 50, 50);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		graphics.setColor(getForeground());
		graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		super.paintComponent(g);
	}

}
