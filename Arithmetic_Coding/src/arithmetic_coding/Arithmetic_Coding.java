package arithmetic_coding;

import java.io.FileNotFoundException;

public class Arithmetic_Coding 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        String word = "ABCA";
        System.out.println("Before make compression: " + word + "\n");

        compression compressObj = new compression();
        compressObj.compress(word);

        Decompression obj = new Decompression();
        obj.setcompressResult("compressResult.txt");
        System.out.println();
        
        obj.setprobabilitiesFile("probabilities.txt");
        System.out.println();
        
        obj.decompress();
        System.out.print("After make a Decompress: ");
        System.out.println(obj.getResult() + "\n");
    }
}