public class User{
  String username;
  String password;
  String email;

  public User(String username, String password, String email){
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public void setUsername(String username){
    this.username = username;
  }

  public String getUsername(){
    return username;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public void setRandomPassword(int length){
    PasswordGenerator passwordGenerator = new PasswordGenerator(length);
    String pass = passwordGenerator.generate();
    this.password = pass;
  }

  public String getPassword(){
    return password;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getEmail(){
    return email;
  }

  public boolean login(String username, String password){
    if(this.username == username & this.password == password){
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    String tempString =String.format("Username : %s\nPassword : %s\nE-mail : %s ", this.username, this.password, this.email);
    return tempString;
  }
}
