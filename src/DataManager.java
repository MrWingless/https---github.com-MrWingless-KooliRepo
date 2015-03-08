// This class should manage the files - as in get info from files and save info to files.
public class DataManager{

	// Checks If The Player Already Exists
	static void checkIfPlayerPlayedBefore() throws Exception{
		java.io.File playerData = new java.io.File("/Players/"+ Player.getName() +".txt");
		if (!playerData.exists()){
			Player.setFirstGame(true);
			playerData.createNewFile();
		}
		else{
			Player.setFirstGame(false);
		}
		PlayerMessage.welcomePlayer();
	}
}
