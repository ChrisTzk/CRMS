/**
 *   ΔΕΝ ΕΧΟΥΝ ΟΛΟΚΛΗΡΩΘΕΙ ΟΙ ΛΕΙΤΟΥΡΓΙΕΣ:
 *      ΕΥΡΕΣΗ, ΕΝΟΙΚΙΑΣΗ ΚΑΙ ΕΠΙΣΤΡΟΦΗ ΟΧΗΜΑΤΟΣ, ΠΡΟΒΟΛΗ ΙΣΤΟΡΙΚΟΥ ΕΝΟΙΚΙΑΣΕΩΝ, ΚΟΙΝΟΠΟΙΗΣΗ ΕΛΛΕΙΨΗΣ ΤΥΠΟΥ ΟΧΗΜΑΤΟΣ, ΑΛΛΑΓΗ ΚΩΔΙΚΟΥ ΕΠΙΧΕΙΡΙΣΗΣ 
 */
package carrentalmanagementsystem;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CarRentalManagementSystem {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "crms";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection()
    {
        
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection ->" + CarRentalManagementSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return cnx;
    }
    
}
