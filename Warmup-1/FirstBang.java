

public class FirstBang {

  String firstName;
  String lastName;
  static int ID = 0;


    public FirstBang(String Name, String lName) {
      this.firstName = Name;
      this.lastName = lName;

      //Nie powinieneś wrzucać jakichkolwiek metod do konstruktora! (zamiast tego stwórz oddzielną metodę w tej klasie)
      System.out.printf("%s, %s %d", Name, lName, ID);
    }

  public static void main (String args[]){
    FirstBang wow = new FirstBang("jak", "kni");
  }
}
