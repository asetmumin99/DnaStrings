import edu.duke.*;
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part4 {
    public void ReadUrl(){
        URLResource urlList = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        
        for(String line : urlList.lines()){
           if(line.toLowerCase().contains("youtube.com")){
               String lower = line.toLowerCase();
               int start = lower.indexOf("youtube.com"); //y
               //System.out.print("start = " + start + ", ");
               //int end = line.lastIndexOf("youtube.com"); //m
               
               int linkBegin = lower.lastIndexOf("\"", start);
               int linkEnd = lower.indexOf("\"", start);
               
               System.out.println(lower.substring(linkBegin+1, linkEnd) + " || " + line.substring(linkBegin+1, linkEnd));
               
           }
            
        }
        
    }
}
