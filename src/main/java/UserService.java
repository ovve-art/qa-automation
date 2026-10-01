public class UserService {

    public boolean isAdult(int age){

        return age >= 18;
    }

    public boolean canLogin(String username, String password){

        return username.equals("admin") && password.equals("12345");
    }

    public String getRole(boolean admin){
        if(admin){
            return "ADMIN";
        }
        return "USER";
    }
}
