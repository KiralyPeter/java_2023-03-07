/* 
Szükséges osztályok:
    Connetcion
    SQLException
    ClassNotFoundException
    DriverManager
 */


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.lang.ClassNotFoundException;

public class Connect {
    // Tárolni kell a kapcsolatot (ez most kivételesen osztályváltozóban, de majd megírjuk rendesen..)
    private Connection conn;

    // Konstruktor
    Connect(){
        conn = null;
    }

    // majd ezt is átalakítjuk hordozhatóvá - connection String
    public void connectDatabase(){
        try {
            //driver
            Class.forName("org.mariadb.jdbc.driver");
            // meg kell szólítani
            String url = "jdbc:mariadb//localhost:3306/szfesti_elso";
            // Kapcsolat felépítése
            conn = DriverManager.getConnection(url, "szfesti", "titok");
        } catch (SQLException ex) {
            // felépül a kapcsolat? Ha nem...
            System.out.println("Hiba a kapcsolódás során.");
        } catch (ClassNotFoundException ex){
            System.out.println("Nincs meg a driver.");
        }

        if(conn != null){
            System.out.println("Sikeres kapcsolódás!");
            
        }else{
            System.out.println("Nincs kapcsolat.");
        }
    }

}
