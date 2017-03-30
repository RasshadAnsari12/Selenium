package Sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;



public class Sikuli_02 {

	public static void main(String[] args) throws SikuliException {
		// TODO Auto-generated method stub
  
		
		Screen scr=new Screen();
		Pattern  pattern=new Pattern("C:\\Users\\sathya\\Desktop\\New folder (2)\\Capture.png");
		scr.doubleClick(pattern);
	}

}
