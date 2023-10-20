
package sqlitehasznalata;
/**
 *
 * @author diak
 */
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SQLitehasznalata {

    public static void main(String[] args) throws Exception {
        /*Class.forName("org.sqlite.JDBC");
        Connection k=DriverManager.getConnection("jdbc:sqlite:csaladfa.db");            //adatbázis létrehozása
        Statement u=k.createStatement();                                                   //u -> változó, itt utasítás rövidítése
        //u.execute("CREATE TABLE szemelyek(az INT PRIMARY KEY, nev VARCHAR(30), szdatum DATE, szhely VARCHAR(20));");    //tábla létrehozása
        u.execute("INSERT INTO szemelyek VALUES(1, 'Faragó Csaba', '1972-08-17', 'Budapest');");      //   \"Faragó Csaba\" így is lehet
        */
        createTables("csaladfa.sql");
    }
    static void createTables(String filename){
        try{
            FileInputStream fis=new FileInputStream(filename);
            Scanner reader=new Scanner(fis);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        }catch(Exception ex){
            
        }
    }
}
