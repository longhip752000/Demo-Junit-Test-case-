
public class Login
       
{  
        private String username;  
        private String password;  
        public Login(String username, String password) {  
            if (username == null && password == null) {  
                throw new IllegalArgumentException("Both username and pass cannot be null");  
            }  
            this.username = username;  
            this.password = password;  
        }  
        public String getFullLogin() {  
//            String username = (this.username != null) ? this.username : "?";
//            String password = (this.password != null) ? this.password : "?";  
            return username+ " " + password;  
        }  
        public String getusername() {  
            return this.username;  
        }  
        public String getpassword() {  
            return this.password;  
        }  
}