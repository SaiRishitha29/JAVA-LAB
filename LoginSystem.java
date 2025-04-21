
interface LoginSystem {
    boolean login(String id,String password);

}
class Universityportal implements LoginSystem {
    public boolen login(String id,String password){
        if(id.equals("student123")&& password.equals("pass123")){
            System,out,println("Login Successful!");
            return true;
        }else{
            System.out.println("Invalid Credentials");
            return false;
        }
    }
    public static void main(String[] args){
        Universityportal up = new Universityportal();
        up.login("student123");
        up.login("pass123");
    }
}
