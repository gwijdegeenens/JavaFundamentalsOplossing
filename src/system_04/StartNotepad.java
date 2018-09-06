package system_04;

public class StartNotepad {
   public static void main(String[] args) throws Exception{
      ProcessBuilder process=new ProcessBuilder("Notepad.exe",
            "MyFile.txt");
      process.start();
   }
}
