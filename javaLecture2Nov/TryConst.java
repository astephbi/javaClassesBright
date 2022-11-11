public class TryConst {
   private String username;
   private String password;

   public void setUsername(String username){

   }
   public void getPassword()

    // We create 3 constructors, to have 3 differents ways to create an instance of
    // this class.
    public TryConst() {
    }

    public TryConst(String username) {
        this.username = username;

    }

    public TryConst(String username, String password) {
        this.username = username;
        this.password = password;
    }

}

public static void main(String[] args) {
    TryConst tryconst = new TryConst();
    TryConst tryconst1 = new TryConst(username:"Alex"); // constructor accept an argument here, that's why we have the second constructor

}