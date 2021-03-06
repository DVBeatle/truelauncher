/**
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 3
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
*
*/

package truelauncher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSettings {
	
	//launcher version
	private static int lversion = 15;
	//laucnher folder update URL;
	//folder structure 
	//{folder}/Laucnher.jar - launcher location
	//{folder}/version - launcher version
	private static String lupdateurlfolder = "http://download.true-games.org/minecraft/launcher";
	
	//For client launch
	//1 - name, 2- launchfolder, 3 - minecraft jar file, 4 - launch type (1 - 1.5.2 and older, 2 - 1.6 and newer), 5 - tweaks present(0 - no , 1 - forge , 2 - forge w/o liteloader, 3 - liteloader w/ forge , for newer launch versions) 
	private static String[][] clientfolders = 
	{
		{"Classic 1.6.2",".true-games.org/runclients/classic162", ".true-games.org/runclients/classic162/minecraft.jar", "2", "0"} ,
		{"Classic 1.5.2",".true-games.org/runclients/classic",".true-games.org/runclients/classic/minecraft.jar" ,"1", "0"},
		{"HiTech 1.5.2",".true-games.org/runclients/hitech", ".true-games.org/runclients/hitech/minecraft.jar", "1", "0"}

	};
	
	//just a paths to all the libs that minecraft may need (add every lib here that minecraft may need)
	private static ArrayList<String> clientlibs = new ArrayList<String>(
			Arrays.asList(
					
					//minecraft libs
					"libraries/net/sf/jopt-simple/jopt-simple/4.5/jopt-simple-4.5.jar",
					"libraries/org/ow2/asm/asm-all/4.1/asm-all-4.1.jar",
					"libraries/org/lwjgl/lwjgl/lwjgl/2.9.0/lwjgl-2.9.0.jar",
					"libraries/org/lwjgl/lwjgl/lwjgl_util/2.9.0/lwjgl_util-2.9.0.jar",
					"libraries/org/lwjgl/lwjgl/lwjgl/2.9.0/jinput-2.0.5.jar",
					"libraries/net/java/jutils/jutils/1.0.0/jutils-1.0.0.jar",
					"libraries/com/paulscode/codecjorbis/20101023/codecjorbis-20101023.jar",
					"libraries/com/paulscode/codecwav/20101023/codecwav-20101023.jar",
					"libraries/com/paulscode/libraryjavasound/20101123/libraryjavasound-20101123.jar",
					"libraries/com/paulscode/librarylwjglopenal/20100824/librarylwjglopenal-20100824.jar",
					"libraries/com/paulscode/soundsystem/20120107/soundsystem-20120107.jar",
					"libraries/argo/argo/2.25_fixed/argo-2.25_fixed.jar",
					"libraries/org/bouncycastle/bcprov-jdk15on/1.47/bcprov-jdk15on-1.47.jar",
					"libraries/com/google/guava/guava/14.0/guava-14.0.jar",
					"libraries/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar",
					"libraries/commons-io/commons-io/2.4/commons-io-2.4.jar",
					"libraries/com/google/code/gson/gson/2.2.2/gson-2.2.2.jar",
					//forge libs
					"libraries/org/scala-lang/scala-library/2.10.2/scala-library-2.10.2.jar",
					"libraries/org/scala-lang/scala-compiler/2.10.2/scala-compiler-2.10.2.jar",
					"libraries/org/ow2/asm/asm-all/4.1/asm-all-4.1.jar",
					"libraries/lzma/lzma/0.0.1/lzma-0.0.1.jar",
					"libraries/wrapper/lwrap.jar",
					"libraries/forge/mcforge.jar",
					//liteloader libs
					"libraries/liteloader/ll.jar"
			)
			
	);
	
	
	//For client download
	//folder in which clients .zip file will be downloaded
	private static String tempfolder = ".true-games.org/packedclients";
	//1 - name, 2 - downloadlink, 3 - folderto
	private static String[][] downloadclients = 
	{
		{"Classic 1.6.2","http://download.true-games.org/minecraft/clients/mc162.zip",".true-games.org/runclients/classic162"},
		{"Classic 1.5.2","http://download.true-games.org/minecraft/clients/classic.zip",".true-games.org/runclients/classic"},
		{"Hitech 1.5.2","http://download.true-games.org/minecraft/clients/hitech.zip",".true-games.org/runclients/hitech"}
	};
	

	//folder in which configuration will be stored
	private static String configfolder = ".true-games.org/configdata";
			

	//main frame size
	public static int w = 740;
	public static int h = 340;
	//images
	public static String lname = "True-games.org|MinecraftLauncher";
	public static String icon = "images/icon.png";
	public static String bgimage = "images/bgimage.png";
	public static String labelimage = "images/labelbar.png";
	public static String textimage = "images/textfield.png";
	public static String explainimage = "images/expbar.png";
	public static String mclaunchimage = "images/mclaunch.png";
	public static String close = "images/close.png";
	public static String hide = "images/hide.png";
	
	
	//folder for error logging
	public static String errFolder = ".true-games.org/errLog";
	

	//code to get those values
	
	//gui block 2 vars begin
	public static List<String> getClientsList()
	{

		List<String> servnames =new ArrayList<String>();
		for (int i=0; i<clientfolders.length;i++)
		{
			servnames.add(clientfolders[i][0]);
		}
		return servnames;
	}
	
	public static String getClientFolderByName(String name)
	{
		String folder = "minecraft";
		for (int i=0; i<clientfolders.length;i++)
		{
			if (clientfolders[i][0].equals(name))
			{
				folder = clientfolders[i][1];
			}
		}
		return folder;
	}
	
		public static String getClientJarByName(String name)
	{
		String folder = "fail";
		for (int i=0; i<clientfolders.length;i++)
		{
			if (clientfolders[i][0].equals(name))
			{
				folder = clientfolders[i][2];
			}
		}
		return folder;
	}
		
	public static int getClientLaunchVersionByName(String name)
	{
		int version = 1;
		for (int i=0; i<clientfolders.length;i++)
		{
			if (clientfolders[i][0].equals(name))
			{
				version = Integer.valueOf(clientfolders[i][3]);
			}
		}
		return version;
	}	
	
	public static ArrayList<String> getClientLibs() {
		return clientlibs;
	}
	
	public static int getClientTweaksType(String name) {
		int present = 0;
		for (int i=0; i<clientfolders.length;i++)
		{
			if (clientfolders[i][0].equals(name))
			{
				present = Integer.valueOf(clientfolders[i][4]);
			}
		}
		// TODO Auto-generated method stub
		return present;
	}
	//gui block 2 vars end
	
	
	//gui block 3 vars begin
	public static List<String> getClientListDownloads()
	{

		List<String> servlinks =new ArrayList<String>();
		for (int i=0; i<downloadclients.length;i++)
		{
			servlinks.add(downloadclients[i][0]);
		}
		return servlinks;
	}
	
	public static String getClientDownloadLinkByName(String name)
	{
		String link = "";
		for (int i=0; i<downloadclients.length;i++)
		{
			if (downloadclients[i][0].equals(name))
			{
				link = downloadclients[i][1];
			}
		}
		return link;
	}
	
	public static String getClientUnpackToFolderByName(String name)
	{
		String fldto = "";
		for (int i=0; i<downloadclients.length;i++)
		{
			if (downloadclients[i][0].equals(name))
			{
				fldto = downloadclients[i][2];
			}
		}
		return fldto;
	}
	//gui block 3 vars end
	
	//folder for packed clients begin
	public static String getCientTempFolderPath()
	{
		return tempfolder;
	}
	//folder for packed clients end
	
	
	//Lacunher vars begin
	public static String getLauncherConfigFolderPath()
	{
		return configfolder;
	}
	
	public static String getLauncherWebUpdateURLFolder()
	{
		return lupdateurlfolder;
	}
	public static int getLauncherVerison()
	{
		return lversion;
	}
	//Lacunher vars end


}
