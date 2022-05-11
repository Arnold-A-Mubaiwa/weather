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
