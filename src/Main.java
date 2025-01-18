import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    static Statement sqll ;
    public static int level;

    public static String uname;
    public static String pw;

    public static void main(String[] args) throws SQLException {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pos_system"
                    ,"root","root");
            sqll= connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("WELCOME TO THE POS SYSTEM");
        System.out.println("-------------------------");

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter username: ");
         uname=scanner.nextLine();

         System.out.println("Enter password: ");
         pw=scanner.nextLine();


        login.calllogin(uname,pw,sqll);

    }


}