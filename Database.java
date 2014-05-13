package vm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Database {
    protected String dbuser = "root";
    protected String dbpass = "";
    protected String dbname;
    protected Statement stmt = null;
    protected Connection con = null;
    protected ResultSet rs = null;
    
    public Database(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ""+ex.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/VendingMachine",dbuser,dbpass);
            stmt = con.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ""+ex.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet getData(String SQLString){
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage(),"Conmmunication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    public void query(String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage(),"Conmmunication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet Search(String SQLString){
        String s = "select * from Member ";
        return getData(s+SQLString);
    }
    public ResultSet Create(String SQLString){
        return getData(SQLString);
    }
    public ResultSet Read(String SQLString){
        String s = "select * from Member where kode='"+SQLString+"';";
        return getData(s);
    }
    public ResultSet Update(String SQLString){
        String s = "";
        return getData(s+SQLString);
    }
    public ResultSet Delete(String SQLString){
        String s = "delete from Member where ";
        return getData(s+SQLString);
    }
    
}
