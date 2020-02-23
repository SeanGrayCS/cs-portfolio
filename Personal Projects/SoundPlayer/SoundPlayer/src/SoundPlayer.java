import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class SoundPlayer { 
 
    Long currentFrame; 
    Clip clip; 
      
    String status; 
      
    AudioInputStream audioInputStream; 
    static String filePath; 
  
    // constructor to initialize streams and clip 
    public SoundPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException { 
        // create AudioInputStream object 
        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
          
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
  
    public static void main(String[] args)  
    { 
        try
        { 
            filePath = "SampleSound.wav"; 
            SoundPlayer audioPlayer =  new SoundPlayer(); 
            audioPlayer.play();
            Scanner sc = new Scanner(System.in);
            while (true)
            {
            	System.out.println("type 0 to stop");
            	int c = sc.nextInt();
            	if(c == 0)
            		break;
            	
            }
            sc.close();

        }  
          
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
          }
    } 
  
    // Method to play the audio 
    public void play()  
    { 
        //start the clip 
        clip.start(); 
          
        status = "play"; 
    } 
 
}