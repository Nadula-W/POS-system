class inventory {
     String itemname;
     double value;
     static String[][] item = new String[100][100];
     static int count = 0;

     public inventory() {
         this.itemname = itemname;
         this.value = value;
     }

     public String getItemname() {
         return itemname;
     }

     public double getValue() {
         return value;
     }

     public static void additem(String itemname, double value) {
         if (count < item.length) {
             item[count][1] = String.valueOf(value);
             item[count][0] = itemname;

         }

     }
 }
