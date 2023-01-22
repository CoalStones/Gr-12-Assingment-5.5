package assignment55;
import java.util.Scanner;

public class Assignment55 {
    
    /*public static String substrings(String word, String lastWord, int sentenceLength, int start){
        String charHolder="";
        String letters=word.replaceAll(" ","");
        letters=letters.toLowerCase();
        String reverse =new StringBuffer(letters).reverse().toString();
        
    }
    
    //full to one letter
    public static String recursiveCheck1(String word, int sentenceLength, int start){
        String forwards1;
        String backward1;
        String letters=word.replaceAll(" ","");
        letters=letters.toLowerCase();
        String reverse =new StringBuffer(letters).reverse().toString();
        forwards1=letters.substring(start); backward1=reverse.substring(start);
        System.out.println(forwards1+" "+backward1);
        if(!(forwards1.equals(backward1)))/*&&!(forwardHolder.equals("")){
            return recursiveCheck1(word,sentenceLength-1,start+1);
        }
        else{
            System.out.println("True");
            return forwards1;
        }
    }
    //one letter to full
    public static String recursiveCheck2(String word, int sentenceLength, int start){
        String forwards2;
        String backward2;
        String letters=word.replaceAll(" ","");
        letters=letters.toLowerCase();
        String reverse =new StringBuffer(letters).reverse().toString();
        forwards2=letters.substring(sentenceLength); backward2=reverse.substring(sentenceLength);
        System.out.println(forwards2+" "+backward2);
        if(!(forwards2.equals(backward2))&&sentenceLength>0)/*&&!(forwardHolder.equals("")){
            return recursiveCheck2(word,sentenceLength-1,start+1);
        }
        else{
            System.out.println("True");
            return forwards2;
        }
    }
    //taking one from each side to the middle
    public static String recursiveCheck3(String word, int sentenceLength, int start){
        String forwards3;
        String backward3;
        String letters=word.replaceAll(" ","");
        letters=letters.toLowerCase();
        String reverse =new StringBuffer(letters).reverse().toString();
        forwards3=letters.substring(start,sentenceLength); backward3=reverse.substring(start,sentenceLength);
        System.out.println(forwards3+" "+backward3);
        if((!(forwards3.equals(backward3))))/*&&!(forwardHolder.equals("")){
            return recursiveCheck3(word,sentenceLength-1,start+1);
        }
        else{
            System.out.println("True");
            return forwards3;
        }
    }*/

    public static void main(String[] args) {
        Scanner noahSeer=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word="Some prefer cake but i prefer pie";//noahSeer.nextLine();
        String holder=word.replaceAll(" ","");
        int sentenceLength=holder.length()-1; int start=0; String palin="";
        //palin=recursiveCheck1(word, sentenceLength, start);
        //palin=recursiveCheck2(word, sentenceLength, start);
        //palin=recursiveCheck3(word, sentenceLength, start);
        char cHolder=letterFinder(word,sentenceLength,start);
        System.out.println(cHolder);
        /*
        check every string you could make with the reverse of itself
        to find out if it's a palindrome
        recursion is just loops but as a method.
        Think of loops i could use then turn them into methods instead of
        overcomplicating things 
        */
    }
    
    public static char letterFinder(String word, int sentenceLength, int start){
        boolean found=false;
        int startPos,endPos=0;
        String letters=word.replaceAll(" ","");
        letters=letters.toLowerCase();
        String reverse =new StringBuffer(letters).reverse().toString();
        
        char charFinder=letters.charAt(start);
        
        startPos=start;
        endPos=lastLetter(word,sentenceLength,charFinder);
        if(endPos>0)found=nextLetter(word,startPos+1,endPos-1);
        if(!found) return letterFinder(word,sentenceLength,start+1);
        else return charFinder;
    }
    
    public static boolean nextLetter(String word, int startPos, int endPos){
        char charHolder=word.charAt(startPos);
        if(charHolder==word.charAt(endPos)&&startPos!=endPos) return nextLetter(word,startPos+1,endPos-1);
        else if(startPos==endPos) return true;
        else return false;
    }
    
    public static int lastLetter(String word, int sentenceLength, char charFinder){
        if(word.charAt(sentenceLength)==charFinder){
            return sentenceLength;
        }
        else{
            return lastLetter(word,sentenceLength-1,charFinder);
        }
    }
    
}
