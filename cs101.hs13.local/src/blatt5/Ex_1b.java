package blatt5;

import java.lang.String;
import java.util.Arrays;

//Checks if input is an anagram, ignoring uppercase-letters and special characters
public class Ex_1b {
	public static void main(String[] args){
		
		char[] partOne = sort(justLetters(args[0]));
		char[] partTwo = sort(justLetters(args[1]));
		
		System.out.print("\"" + args[0] + "\" and \"" + args[1] + "\" are ");
		if(Arrays.equals(partOne,partTwo)){
			System.out.println("anagrams! Eureka!");
		}else{System.out.println("not anagrams :-(");}
		
	}
	
	//sorts the elements in a Char-Array
	public static char[] sort(char[] arg) {
		boolean unsorted=true;
		char temp;
		
		while (unsorted){
		unsorted = false;
		for (int i=0; i < arg.length-1; i++) 
			if (arg[i] > arg[i+1]) {                      
				temp       = arg[i];
				arg[i]       = arg[i+1];
				arg[i+1]     = temp;
				unsorted = true;
			}          
		}
		return arg;
	}

	//combines all string-letters in an Char-Array
	public static char[] justLetters(String string){
		string=string.toLowerCase();
		char[] all = string.toCharArray();
				
		int lettercount = 0;
		for(int i=0;i<all.length;i++){
			if( Character.isLetter(all[i]) ){lettercount+=1;};
		}

		char[] letters = new char[lettercount];
		int pos =0;
		for(int i=0;i<all.length;i++){
			if( Character.isLetter(all[i]) ){
				letters[pos]=all[i];
				pos++;
			}
		}
		return letters;
	}
	
}