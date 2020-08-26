
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb){
        //return true, if stringa appears at least twice in stringb
        /*int pos1 = stringb.indexOf(stringa);
        if(pos1 == -1)
            return false;
        
        stringb = stringb.substring(pos1 + stringa.length(), stringb.length());
        
        int pos2 = stringb.indexOf(stringa);
        if(pos2 == -1)
            return false;
            
        stringb = stringb.substring(pos2 + stringa.length(), stringb.length());*/
        
        int pos = 0, occurred = 0;
        while(pos != -1){
            pos = stringb.indexOf(stringa); //find position
            if(pos != -1)
                occurred++;
            stringb = stringb.substring(pos + stringa.length(), stringb.length());
        }
        System.out.print("Occurred " + occurred + " times -> ");
        if(occurred >= 2)
            return true;
        
        
        return false;
    }
    
    public void testing(){
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
        System.out.println(twoOccurrences("a", "banana"));
        System.out.println(twoOccurrences("atg", "ctgtatgta"));
        System.out.println();
        System.out.println(lastPart("an", "banana"));
        System.out.println(lastPart("zoo", "forest"));
        
    }
    
    public String lastPart(String stringa, String stringb){
        //finds 1st occurrence of stringa in stringb, return part of stringb
        //that follows stringa
        
        //if stringa doesn't occur in stringb, then return stringb
        
        // lastPart("an", "banana") -> "ana"
        // lastPart("zoo", "forest") -> "forest"
        int start = stringb.indexOf(stringa);
        if(start == -1)
            return stringb;
        else
            return stringb.substring(start + stringa.length(), stringb.length());
    }
}
