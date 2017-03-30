package Sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuliiii {

	public static void main(String[] args) throws SikuliException
	{
		// TODO Auto-generated method stub
		Screen scr=new Screen();
		Pattern ptr=new Pattern("C:\\Users\\sathya\\Desktop\\eclipse\\Capture.png");
		scr.doubleClick(ptr);

	}

}
