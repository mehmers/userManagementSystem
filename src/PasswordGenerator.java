import java.util.Random;

public class PasswordGenerator{
  int passwordLength;
  char[] characters = new char[62];

  public PasswordGenerator(int passwordLength){
    this.passwordLength = passwordLength;
    if(passwordLength < 4 || passwordLength > 100){
      throw new IllegalArgumentException("You can not generate password lower than 4 characters or longer than 100 characters.");
    }
  }

  public void setCharacters(){
  int count = 0;
  for(char c = 'a' ; c <= 'z' ; c++){
    characters[count] = c;
    count = count+1;
  }
  for(char c = 'A' ; c <= 'Z' ; c++){
    characters[count] = c;
    count = count+1;
  }
  for(int i = 0 ; i <= 9 ; i++){
    characters[count] = (char)(i + '0');
    count = count+1;
  }
  }

  public String generate(){
    setCharacters();
    String tempString = "";
    int length = this.characters.length;
    for(int i = 0 ; i < this.passwordLength ; i++){
      int temp = new Random().nextInt(length);
      tempString = tempString + characters[temp];
    }
    return tempString;
  }
}
