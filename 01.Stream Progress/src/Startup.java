
import Models.File;
import Models.Music;
import Models.StreamProgressInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishindo
 */
public class Startup {
    public static void main(String[] args){
        File file = new File("Test",12,12);
        Music music = new Music("Some name","Cool",15,2222);

        StreamProgressInfo stramFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo stramMusicInfo = new StreamProgressInfo(music);
        
        System.out.println(stramFileInfo.CalculateCurrentPercent());
        System.out.println(stramMusicInfo.CalculateCurrentPercent());  
    }
}
