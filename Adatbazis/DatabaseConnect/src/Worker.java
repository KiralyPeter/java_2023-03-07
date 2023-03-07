import java.sql.Statement; // SQL utasítás futtatásához kell
import java.sql.ResultSet; // SQL eredmény halmaz
import java.sql.Connection;
import java.sql.SQLException;

public class Worker {
    
    // Konstruktor
    Worker(){}

    public void getWorkers(){
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO workers (name, city, salary, born) VALUES" + "('Király Péter', 'Szigetszentmiklós', 550000, '1974-06-11');";
        // String sql = "SELECT * FROM workers;";
        Connect connect = new Connect();
        Connection conn = connect.connectDatabase();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.print(rs.getInt("id") + ", ");
                System.out.print(rs.getString("name") + ", ");
                System.out.print(rs.getString("city") + ", ");
                System.out.print(rs.getInt("salary") + ", ");
                System.out.print(rs.getString("born") + "\n");
            }
            
        } catch (SQLException ex) {
            System.out.println("Hiba a lekérdezés során");

        }
    }

}
