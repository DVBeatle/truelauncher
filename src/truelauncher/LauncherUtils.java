package truelauncher;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.swt.widgets.Display;

public class LauncherUtils {

    public static String getDir() {
        String OS = System.getProperty("os.name").toLowerCase();
        if (OS.contains("win")) {
            String appData = System.getenv("APPDATA");
            String Dir = new File(appData).toString();
            return Dir;
        } else if (OS.contains("linux") || OS.contains("unix")) {
            String Directory = System.getProperty("user.home", ".");
            String Dir = new File(Directory).toString();
            return Dir;
        }
        return null;
    }
    
    public static void launchMC(String path, String nickin, int memin)
    {
       String nick = nickin;
       String mem = memin + "M";
       String ps = LauncherUtils.getDir();
       String OS = System.getProperty("os.name").toLowerCase();
       String mcpath = ps+"/"+path;
        
           try {
            if (OS.contains("win")) {
          Runtime.getRuntime().exec("cmd /c cd "+mcpath+" && start javaw -Xmx" + mem + " -Djava.library.path=bin/natives -cp bin/minecraft.jar;bin/jinput.jar;bin/lwjgl.jar;bin/lwjgl_util.jar net.minecraft.client.Minecraft " + nick);
             }
           else
            {
          Runtime.getRuntime().exec(new String[]{"/bin/sh","-c","cd "+mcpath+" ; java -Xmx" + mem + " -Djava.library.path=bin/natives -cp bin/minecraft.jar:bin/jinput.jar:bin/lwjgl.jar:bin/lwjgl_util.jar net.minecraft.client.Minecraft " + nick});  
            }
           
        } catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    


}