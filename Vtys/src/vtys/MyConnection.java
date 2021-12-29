
package vtys;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Berfin
 */


public class MyConnection{
	public static Connection baglan;
    public Statement st=null;
    
	public static void baglantiAc(){
		try {
                    
		
			String bag = "jdbc:mysql://localhost:3306/_grup_2_hastanekayitsistemi";
			String kullaniciadi = "root";
			String sifre = "123456";
			baglan = DriverManager.getConnection(bag, kullaniciadi, sifre);
			System.out.println("Baglandi");
		} catch (Exception e) {
			System.out.println("bağlanamadı");
		}
	}

	public static void baglantiKapat(){
		try {
			baglan.close();
			System.out.println("Veritabanýna Baðlantý Baþarýlý Bir Þekilde Kapatýldý, Sonlandýrýldý.");
		} catch (SQLException e) {
			System.out.println("Veritabaný Baðlantýsý Koparýlýrken Bir Hata Meydana Geldi" + e);
		}
	}

   
	public static void main(String[] args) {
		MyConnection mc=new MyConnection();
		mc.baglantiAc();
                
		
		
	}
}
    