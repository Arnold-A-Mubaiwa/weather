String [][] twoDimentional = {{"","","",""}};
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
       
        List<String> users = new ArrayList<>();
        String name = jtxtname.getText();
        String surname = jtxtsurname.getText();
        String username = jtxtusername.getText();
        String password = jtxtpassword.getText();
        
        if (checkUserName(username)== true && checkPasswordComplexity(password)==true){
           int arr_len = twoDimentional.length;
           twoDimentional= Arrays.copyOf(twoDimentional, arr_len+1);
           String[] new_arr = {name, surname, username, password};
           arr_len = twoDimentional.length;
           for (int j = 0; j < 4; j++) {
                twoDimentional[arr_len-1][j]= new_arr[j];
           }
           new_arr = null;
//            users.add();
           JFrame parent = new JFrame();

            JOptionPane.showMessageDialog(parent, "Registration Complete");
        }
        else{
         JOptionPane.showMessageDialog(null,"Invalid Registration Details", "Login Error", JOptionPane.ERROR_MESSAGE);
     
        }
    }   
https://www.youtube.com/watch?v=l1havAX5XgQ
/////////////////////////
import java.util.Scanner;
import java.util.regex.*;
import java.util.Arrays;

class untitled{
	
	static boolean checkUserName(String username){
		if (username.contains("_")&& (username.length()<=5)){
			return true;
		}else{
			return false;
		}
	}

	static boolean checkPasswordComplexity(String password){
		String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[_@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(password);

        return m.matches();
	}
	
  static String[][] addwords(String[][] words, String... data){
            String[][] moreWords = new String[words.length+1][4];

            for(int i=0; i<words.length; i++){
                for(int j=0; j<4; j++){
                 moreWords[i][j]= words[i][j];
                }

            }
            if (data.length>0){
            for(int j=0; j<4; j++){
             moreWords[moreWords.length-1][j]= data[j];
            }
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Insert data Details", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
            
            return moreWords;
        }
     static String AddTask(){
     	if(checkTaskDescription(description) ){
           Login_system info = new Login_system();
           info.users = add_data(info.users, name, number, description, developer, status);
           
           String printing="\t";
           String p;
           JFrame parent = new JFrame();
           JOptionPane.showMessageDialog(parent, "Task Successfully captured");
          
           
           if (info.users.length==2){
              for (int i =0; i<2; i++){
                  p = "\n Task Name: "  +info.users[i][0] +"\n Task Number: "  +info.users[i][1] + "\n Task Description: " +info.users[i][2] + "\n Task Developer: " +info.users[i][3] +"\n Task Status: " + info.users[i][4];
                  printing+=p;
              }
              JFrame parents = new JFrame();
              JOptionPane.showMessageDialog(parents, printing);
           }
        }else{
            JOptionPane.showMessageDialog(null,"The description should be less tahn 50 letters", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
     }
public  boolean checkTaskDescription (String words){
    if(words.length()<50){
        return true;
    }else{
        return false;
    }
}

public void printTaskDetails(String [][]arr){
    for (int i=0; i<arr.length; i++){
        for (int j=0; j<arr.length; j++){
            String a=arr[i][j];
        }
    }
}

public int returnTotalHours(String [][]arr){
    int total =0;
     for (int i=0; i<arr.length; i++){
        for (int j=0; j<arr.length; j++){
            total = Integer.parseInt(arr[i][j]);
        }
    }
     return total;
}


public String CreateTaskID(String name, String Task, String Last) {
String last2 = Last.length() > 2 ? Last.substring(Last.length()- 2) :
Last; String name2 = name.substring(0,2); String uniqueKey = name2+ ":"
+ Task + ":"  + last2; return uniqueKey; } // } 
    public static void
main(String[] args) { System.out.println(checkUserName());
System.out.println(checkPasswordComplexity()); register();

	 			}
}
