import java.util.Scanner;
class VowelConsonantCount{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String string = sc.next();
	VowelConsonantCounter(string);
	}
	// helper function to count vowel and consonant
	public static void VowelConsonantCounter(String str){
	int vowelCounter = 0;
	int consonantCounter = 0;
	for(int i=0;i<str.length();i++){
		char ch = Character.toLowerCase(str.charAt(i));
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			vowelCounter++;
		}
		else{
			consonantCounter++;
		}
	   }
	System.out.println("No of vowels: "+vowelCounter);
	System.out.println("NO of consonant: "+consonantCounter);
	}
}
//input
//harman
//output
//No of vowels: 2
//NO of consonant: 4
