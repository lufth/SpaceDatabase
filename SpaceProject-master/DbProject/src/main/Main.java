package main;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import view.LoginInterface;

public class Main {

	public static void main(String[] args) {
		String os = System.getProperty("os.name");
		if ( os.contains("Mac OS")) {
			// DO NOTHING
		} else {
			try {
			    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			        if ("Nimbus".equals(info.getName())) {
			            UIManager.setLookAndFeel(info.getClassName());
			            break;
			        }
			    }
			} catch (Exception e) {
			    // If Nimbus is not available, you can set the GUI to another look and feel.
			}
		}
		LoginInterface.main();
		}
	}
