
import junit.framework.TestCase;  
    public class TestLogin extends TestCase {  
        public TestLogin(String login) {  
            super(login);  
 
        }  
        /** 
            
        */  
        public void testGetFullLogin() {  
            Login p = new Login("long","long123");  
//            System.out.println(p.getFullLogin());
            assertEquals( p.getFullLogin(),"long long123");  
        }  
        /** 
        * Xac nhan rang nulls da duoc xu ly chinh xac 
        */  
        public void testNullsInLogin() {  
            Login p = new Login(null, "long123");  
            assertTrue(" ? long123"!= p.getFullLogin());  
            p = new Login("long", null);  
            assertFalse("long ?"== p.getFullLogin());  
        }  
    } 
