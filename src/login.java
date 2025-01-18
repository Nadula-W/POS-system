import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class login {
    public static void calllogin(String uname, String pw, Statement sqll) throws SQLException {
    String sql1="select * from pos_system.password where trim(username)='" + Main.uname +"' and trim(password)='" + Main.pw +"' and active=1 ";
        ResultSet result= sqll.executeQuery(sql1);


        {
        try {
            if(result.next()){
                System.out.println("Succesfully loged");
                Main.level=result.getInt("level");
                mainMenu.selectoption(Main.level);

            }else {
                System.out.println("invalid login");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
}

