import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class bill {


    static StringBuilder sb = new StringBuilder();

    public double calfinal(double bmrp, int bq) {
        return bmrp * bq;
    }

    public static void createbill(int option) throws SQLException {
        if (option == 2) {
            System.out.println("WELCOME TO THE BILLING SYSTEM");

            while (true) {
                System.out.println("Enter item id and quantity (or type 'c' to cancel):");

                Scanner scanner = new Scanner(System.in);
                String bid = scanner.nextLine();
                int bq = scanner.nextInt();

                if (bid.equalsIgnoreCase("c")) {
                    System.out.println("Billing completed. Final data:");
                    System.out.println(sb.toString());
                    System.out.println("jghbjjm");
                    break;
                }



                scanner.nextLine();

                String sql5 = "select * from pos_system.inventory where itemid ='" + bid + "'";
                ResultSet result2 = Main.sqll.executeQuery(sql5);

                if (result2.next()) {
                    String bname = result2.getString("item_name");
                    double bmrp = result2.getDouble("mrp");

                    bill obj = new bill();
                    double total = obj.calfinal(bmrp, bq);

                    // Append item details to the string
                    sb.append("Item ID: ").append(bid)
                            .append(", Name: ").append(bname)
                            .append(", Quantity: ").append(bq)
                            .append(", Total: ").append(total)
                            .append("\n");

                    System.out.println("Added: " + bname + " (ID: " + bid + ") - Quantity: " + bq + ", Total: " + total);
                } else {
                    System.out.println("Item not found in the inventory.");
                }
            }
        }
    }
}
