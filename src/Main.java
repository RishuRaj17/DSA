import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    int b =8;
    public static void main(String[] args) {

        int a = 4;
        try {
            int g = 10;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");

            String query = "Create table room (patient_bed int(10) not null, oxygen_cylinder int(10) not null, monitor int(10) not null, refrigerator int(10) , television int(10) not null, wardrobe int(10) )";

            Statement stmt = con.createStatement();

            stmt.execute(query);

            System.out.println("table created");
            con.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}