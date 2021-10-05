
import java.sql.Connection;
import java.sql.DriverManager;

public class connexion {

    public static void main(String[] args) {

        String BDD = "hotels?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
        String url = "jdbc:mysql://localhost:3306/" + BDD;
        String user = "root";
        String passwd = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connecter");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Erreur");
            System.exit(0);
        }
    }
}