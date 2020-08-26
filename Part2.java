
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        if((Character.isLowerCase(dna.charAt(0)) && 
           Character.isLowerCase(startCodon.charAt(0))) || 
           (Character.isUpperCase(dna.charAt(0)) && 
           Character.isUpperCase(startCodon.charAt(0))))
        {} // if both lowercase, or both uppercase then dont change anything
        else if(Character.isLowerCase(dna.charAt(0)) && 
                Character.isUpperCase(startCodon.charAt(0))){
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }  // if dna is UP, but startCodon is low, then code should be UP
        else if(Character.isUpperCase(dna.charAt(0)) && 
                Character.isLowerCase(startCodon.charAt(0))){
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }  // if dna is low, but startCodon is UP, then code should be low
        int startPos = dna.indexOf(startCodon);
        if(startPos == -1)
            return "";
        
        int endPos = dna.indexOf(stopCodon);
        if(endPos == -1)
            return "";
            
        if(startPos - (endPos+3) % 3 == 0)
            return dna.substring(startPos, endPos + 3); 
            
        return "";
    }
    
    public void testSimpleGene(){
        String dna1 = "ATCTCTTAA"; //no ATG
        System.out.println("from dna " + dna1 + " -> " + findSimpleGene(dna1, "ATG", "TAA"));
        
        String dna2 = "ATGTCTTAT"; //no TAA
        System.out.println("from dna " + dna2 + " -> " + findSimpleGene(dna2, "ATG", "TAA"));
        
        String dna3 = "ATCTCTTAT"; //no ATG or TAA
        System.out.println("from dna " + dna3 + " -> " + findSimpleGene(dna3, "ATG", "TAA"));
        
        String dna4 = "ATGTCTACATAATCTAGA"; //correct DNA
        System.out.println("from dna " + dna4 + " -> " + findSimpleGene(dna4, "ATG", "TAA"));
        
        String dna5 = "ATGACFGGTAA"; //ATGACFGGTAA
        System.out.println("from dna " + dna5 + " -> " + findSimpleGene(dna5, "ATG", "TAA"));
        
        String dna6 = "ATGACFGTAA"; //ATGACFGTAA
        System.out.println("from dna " + dna6 + " -> " + findSimpleGene(dna6, "ATG", "TAA"));
        
        String dna7 = "gatgctataat"; //lowercase
        System.out.println("from dna " + dna7 + " -> " + findSimpleGene(dna7, "ATG", "TAA"));
        
        String dna8 = "gatgctataat"; //lowercase
        System.out.println("from dna " + dna8 + " -> " + findSimpleGene(dna8, "atg", "taa"));
        
        String dna9 = "GATGCTATAAT"; //lowercase
        System.out.println("from dna " + dna9 + " -> " + findSimpleGene(dna9, "ATG", "TAA"));
        
        String dna10 = "GATGCTATAAT"; //lowercase
        System.out.println("from dna " + dna10 + " -> " + findSimpleGene(dna10, "atg", "taa"));
    }
}
