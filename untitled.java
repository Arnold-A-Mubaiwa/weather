import java.util.Scanner;
import java.util.regex.*;


class untitled{
	
	static boolean checkUserName(){
		String username = "arn_A";
		if (username.contains("_")&& (username.length()<=5)){
			return true;
		}else{
			return false;
		}
	}

	static boolean checkPasswordComplexity(){
		String password = "geGeksportal_20";
		String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[_@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(password);

        return m.matches();
	}
 public static void main(String[] args) {
	 		System.out.println(checkUserName());
	 		System.out.println(checkPasswordComplexity());
	 			}
}