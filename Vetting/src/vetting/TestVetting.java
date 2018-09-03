
package vetting;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import static vetting.Vetting.rates;


public class TestVetting extends Vetting {

    public TestVetting(String n, int[][] x) {
        super(n, x);
    }
    
     public void show() throws ClassNotFoundException, SQLException{
         
       Vetting v = new Vetting("Shaun",rates);
         
       
         outputRates();
         processRates();
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/assessment", "root", "");
         java.sql.Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery("SELECT * FROM `lecturer`");
         
         System.out.println("");
         System.out.println("Student"+"\t"+" Assessment 1"+"\t"+"Assessment 2"+"\t"+"Assessment 3"+"\t"+"Assessment 4"+"\t"+"Assessment 5");
         while (rs.next()) {
                 
        for(int i = 1 ; i <= 6; i++){

         System.out.print(rs.getString(i) + " \t\t"); 

}
             System.out.println("");
         }  
         
    }
     public void dbConnection() throws ClassNotFoundException, SQLException{
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/assessment", "root", "");
         System.out.println("Connection"+conn);
         
    }
     public int[][] enterRates(){
        
        
            
        System.out.println("Enter number of students");
        numStudents = scan.nextInt();
        
        
         rates = new int[numStudents][5];
        
        for (int i = 0; i < rates.length; i++) {
            for (int j = 0; j<rates[i].length; j++) {
                System.out.println("Enter rating");
                rates[i][j] = scan.nextInt();
            }
           }
        
         
        return rates ;
    }
    
    public void insertToDatabase() throws SQLException{
        
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/assessment", "root", "");
        java.sql.Statement st =  conn.createStatement();
        st.executeUpdate("DELETE FROM `lecturer`");
        enterRates(); 
        
        
        
            for (int i = 0; i < numStudents; i++) {
            st.executeUpdate("INSERT INTO `lecturer`(`Student`, `Assessment 1`, `Assessment 2`, `Assessment 3`, `Assessment 4`, `Assessment 5`) VALUES ('"+(i+1)+"','"+rates[i][0]+"','"+rates[i][1]+"','"+rates[i][2]+"','"+rates[i][3]+"','"+rates[i][4]+"')");
                 
            
        }
                
                 
           
        
       
        
      
    }
    
    
}
