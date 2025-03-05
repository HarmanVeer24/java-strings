import java.util.Scanner;
class StringCompare{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String string1 = sc.nextLine();
	String string2 = sc.nextLine();
	// printing the output via the charAt method and equals method 
	// store the result in boolean data type to compare the both the result
	boolean result = string1.equals(string2);
	boolean result1 = CheckingCharAtIndex(string1,string2);
	if( (result==true && result1 ==true) || (result==false && result1==false)){
		System.out.println("the result match with both methods");
	   }
	else{
		System.out.println("the result does not match there is error");
	   }
	}
	//defining the method to check via charAt method
	public static boolean CheckingCharAtIndex(String string1,String string2){
	if(string1.length() != string2.length()){
	return false;
	}
	for(int i=0;i<string1.length();i++){
		if(string1.charAt(i) != string2.charAt(i)){
			return false;
		  }
	   }
	return true;
	}
}
