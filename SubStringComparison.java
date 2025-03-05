import java.util.Scanner;
import java.lang.StringBuilder;
class SubStringComparison{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String string = sc.next();
	//defining the substring via subString method
	String substring = string.substring(0,3);
	// passing the value to helper function
	String substring2 = SubStringChecker(string,0,3);
	//comparing two results
	if(substring.equals(substring2)){
		System.out.println("Both gave same result");
	}
	else{
		System.out.println("error in finding the substrings");
	}
        }
	//defining the method to get substring via charAt method
	public static String SubStringChecker(String string , int startIndex , int endIndex){
		StringBuilder sb = new StringBuilder();
		for(int i=startIndex;i<endIndex;i++){
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}
}
		
