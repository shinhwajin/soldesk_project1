package frame;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class CustomFont {

	public CustomFont() {}
	
	public Font hwajinFont1() {
		Font customFont = null;
		try {
		    //create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Game/BMEULJIROTTF.TTF")).deriveFont(18f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		
	
		return customFont;
		
		
	}
	
	public Font hwajinTitleFont() {
		Font customFont = null;
		try {
		    //create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Game/BMEULJIROTTF.TTF")).deriveFont(60f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		
	
		return customFont;
		
		
	}
	
	public Font hwajinFont2() {
		Font customFont = null;
		try {
		    //create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Game/BMJUA_TTF.TTF")).deriveFont(32f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		
	
		return customFont;
		
		
	}
	
	public Font TitleFont() {
		Font customFont = null;
		try {
		    //create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/BINGGRAESAMANCO.TTF")).deriveFont(60f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		
	
		return customFont;
		
		
	}
	
	public Font getCreateFont2() {
		Font customFont = null;
		try {
		    //create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Game/BMJUA_TTF.TTF")).deriveFont(32f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //register the font
		    ge.registerFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		
	
		return customFont;
		
		
	}
	public Font UserpageFont() {
		Font customFont = null;
		try {
			//create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/BINGGRAESAMANCO.TTF")).deriveFont(45f);	
			
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(FontFormatException e) {
			e.printStackTrace();
		}
		
		
		return customFont;
		
		
	}
	public Font UserpageFont2() {
		Font customFont = null;
		try {
			//create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/BINGGRAESAMANCO.TTF")).deriveFont(30f);	
			
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(FontFormatException e) {
			e.printStackTrace();
		}
		
		
		return customFont;
		
		
	}
	public Font BuyFont() {
		Font customFont = null;
		try {
			//create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/BINGGRAESAMANCO.TTF")).deriveFont(20f);	
			
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(FontFormatException e) {
			e.printStackTrace();
		}
		
		
		return customFont;
		
		
	}
	public Font UserpageErrorFont() {
		Font customFont = null;
		try {
			//create the font to use. Specify the size!
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/BINGGRAESAMANCO.TTF")).deriveFont(13f);	
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (IOException e) {
			e.printStackTrace();
		} catch(FontFormatException e) {
			e.printStackTrace();
		}
		
		
		return customFont;
		
		
	}
	
	
	public Font hayeongFont() {
        Font customFont = null;
        try {
           // create the font to use. Specify the size!
           customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Game/BMJUA_TTF.TTF")).deriveFont(32f);
           GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
           // register the font
           ge.registerFont(customFont);
        } catch (IOException e) {
           e.printStackTrace();
        } catch (FontFormatException e) {
           e.printStackTrace();
        }

        return customFont;

     }
     
     public Font hayeongFont1() {
        Font customFont = null;
        try {
           // create the font to use. Specify the size!
           customFont = Font.createFont(Font.TRUETYPE_FONT, new File("./src/Game/BMJUA_TTF.TTF")).deriveFont(35f);
           GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
           // register the font
           ge.registerFont(customFont);
        } catch (IOException e) {
           e.printStackTrace();
        } catch (FontFormatException e) {
           e.printStackTrace();
        }

        return customFont;

     }


}
