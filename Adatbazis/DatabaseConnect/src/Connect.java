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
    // private Connection conn;

    private Connection conn = null;

    // Konstruktor
    Connect(){
        conn = null;
    }

    // majd ezt is átalakítjuk hordozhatóvá - connection String
    public Connection connectDatabase(){
        
        try {
            //driver
            Class.forName("org.mariadb.jdbc.Driver");
            // meg kell szólítani
            String url = "jdbc:mariadb://localhost:3306/szfesti_elso";
            // Kapcsolat felépítése
            conn = DriverManager.getConnection(url, "szfesti", "titok");
        } catch (SQLException ex) {
            // felépül a kapcsolat? Ha nem...
            System.out.println("Hiba a kapcsolódás során.");
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex){
            System.out.println("Nincs meg a driver.");
        }
        
        return conn;



        // ezt máshol kell..

        // if(conn != null){
        //     System.out.println("Sikeres kapcsolódás!");
        //     return conn;
            
            
        // }else{
        //     System.out.println("Nincs kapcsolat.");
        //     return null;
            
        // }
    }

    public void closeConnect(){

        if( conn != null){
            try {
                conn.close();    
            } catch (SQLException ex) {
                System.out.println("Hiba a lezárás során");
            }
            
        }

    }

}
