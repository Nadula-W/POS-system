import java.sql.SQLException;
import java.util.Scanner;

public class addinventory {

    public String id;
    public String itemname;
    public double mrp;

    public static void add(int option1) {
        if (option1 == 4) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter item code,item name,mrp");

            System.out.println("Enter item code:");
            String id = scanner.nextLine();

            System.out.println("Enter item name:");
            String itemname = scanner.nextLine();

            System.out.println("Enter MRP:");
            double mrp = scanner.nextDouble();


            String sql2 = "insert into pos_system.inventory(itemid,item_name,mrp) values('" + id + "','" + itemname + "','" + mrp + "')";
            try {
                Main.sqll.execute(sql2);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
}