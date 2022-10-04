package entity;

public class User extends Person {

   private String email;
   private String password;


    public User(String firstName, String lastName, String email, String password) {
        super(firstName, lastName);
        this.email = email;
        this.password = password;

    }

    public String getFullInfo (){
        String fullInfo = "Имя и Фамилия: " + super.getFullName() + "\n" + "E-mail: " + email;
        return fullInfo;
    }

    public boolean isPasswordCorrect(String passwordPols){
        boolean passwordСheck;
        if(password.equals(passwordPols)){
            passwordСheck = true;
        }else
            passwordСheck = false;
        return passwordСheck;
    }
}
