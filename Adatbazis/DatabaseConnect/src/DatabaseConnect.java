/* 

amire szükség van:
database connector
connection string // ezt nekünk kell létrehozni
    - database driver 
        https://mariadb.org/connector-java/all-releases/ -- 2.2.78 (ez stabil...)
    - path:port
    - database name
    - user
    - password

*/
public class DatabaseConnect {
    public static void main(String[] args) throws Exception {
        // Connect connect = new Connect(); // Worker osztályból hívjuk
        // connect.connectDatabase();       // Worker osztályból hívjuk

        Worker worker = new Worker();
        worker.getWorkers();
    }
}
