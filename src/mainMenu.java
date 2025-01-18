import java.sql.SQLException;
import java.util.Scanner;;
public class mainMenu {

        public static void selectoption(int level) throws SQLException {
            if (Main.level == 2) {
                System.out.println("1) Inventory");
                System.out.println("2) Billing");
                System.out.println("3) Reports");
            } else {
                System.out.println("2) Billing");
            }
            Scanner scanner = new Scanner(System.in);
             int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("4) add item");
                System.out.println("5) modify item");
            } else if (option == 3) {
                System.out.println("6) Sales Report");
                System.out.println("7) inventory Report");
            } else if (option==2) {
                bill.createbill(option);
            }
            Scanner scanner1=new Scanner(System.in) ;
            int option1=scanner1.nextInt();
        if(option1==4){
            addinventory.add(option1);
        }else if(option1==5){
            editInventory.edit(option1);
            }
        }
    }

