package assign1;
/**
 *  Anthony Tortola
 *  Date: Nov 1st 2019
 *  Description: Checks to see if string is palindrome, mirrored, or mirrored palindrome
 */
public class palindrome {

    private String word;
    private boolean palindrome;
    private boolean mirrored;

    //Default Constructor
    public palindrome() {
        word="";
        palindrome= false;
        mirrored= false;

    }

    //Overloaded Constructor
    public palindrome(String w) {
        this();
        setWord(w);
        checkPalindrome();
        checkMirrored();
        checkMirrorPalindrome();
    }
    //Set method
    private void setWord(String w) {
        if(w.length()<=20) {
            this.word=w.trim().toUpperCase();
        }
    }
    // Checks to see if the word input by the user is a palindrome
    private void checkPalindrome() {
        String rev= reverse(word);
        if(word.equals(rev)){
            this.palindrome=true;
        }
        else {
            this.palindrome=false;
        }
    }

    //Checks to see if the word input by the user is a mirrored string
    private void checkMirrored() {
        String word2=reverse(replaceLetters(word));
        if(word.equals(word2)) {
            this.mirrored=true;
        }
        else {
            this.mirrored=false;
        }

    }
   //Checks if the word input by the user is a mirrored palindrome
    public void checkMirrorPalindrome() {
        if(palindrome==true && mirrored==true) {
        }
    }
    //Returns a reverse string
    private String reverse(String word) {
        String rev="";

        for(int i=word.length()-1;i>=0;i--) {
            rev= rev+word.charAt(i);
        }
        return rev;

    }

    private String replaceLetters(String w) {
        String character="AEHIJLMOSTUVWXYZ12358";
        String reverse= "A3HILJMO2TUVWZY51SEZ8";

        char[]word= w.toCharArray();

        for(int i=0;i<w.length();i++) {
            int index = character.indexOf(word[i]);


            if(index==-1) {
                word[i]=' ';
                break;
            }
            else {
                word[i]=reverse.charAt(index);
            }
        }
        String newWord= new String(word);
        return newWord;

    }
    //Returns the word input by the user
    //Returns whether palindrome, mirrored string, not a palindrome, mirrored palindrome
    public String checkType() {
        if(palindrome==false && mirrored==false) {
            return word + " -- is not a palindrome";
        }
        else if(palindrome==true && mirrored==false) {
            return word + " -- is a regular palindrome";
        }
        else if(palindrome==false && mirrored==true) {
            return word + " -- is a mirrored string";
        }
        else{
            return word + " -- is mirrored palindrome";
        }
    }
    public String toString() {
        return word;
    }
}
