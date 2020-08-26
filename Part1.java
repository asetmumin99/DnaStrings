
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    public String findSimpleGene(String dna){
        int startPos = dna.indexOf("ATG");
        if(startPos == -1)
            return "";
        
        int endPos = dna.indexOf("TAA");
        if(endPos == -1)
            return "";
            
        if(startPos - (endPos+3) % 3 == 0)
            return dna.substring(startPos, endPos + 3); 
            
        return "";
    }
    
    public void testSimpleGene(){
        String dna1 = "ATCTCTTAA"; //no ATG
        System.out.println("from dna " + dna1 + " -> " + findSimpleGene(dna1));
        
        String dna2 = "ATGTCTTAT"; //no TAA
        System.out.println("from dna " + dna2 + " -> " + findSimpleGene(dna2));
        
        String dna3 = "ATCTCTTAT"; //no ATG or TAA
        System.out.println("from dna " + dna3 + " -> " + findSimpleGene(dna3));
        
        String dna4 = "ATGTCTACATAATCTAGA"; //correct DNA
        System.out.println("from dna " + dna4 + " -> " + findSimpleGene(dna4));
        
        String dna5 = "ATGACFGGTAA"; //ATGACFGGTAA
        System.out.println("from dna " + dna5 + " -> " + findSimpleGene(dna5));
        
        String dna6 = "ATGACFGTAA"; //ATGACFGTAA
        System.out.println("from dna " + dna6 + " -> " + findSimpleGene(dna6));
        
    }
}
