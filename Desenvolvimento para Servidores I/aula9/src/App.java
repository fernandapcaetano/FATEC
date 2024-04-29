import com.fernandapcaetano.website.Admin;
import com.fernandapcaetano.website.Login;
import com.fernandapcaetano.website.Sitio;

public class App {
    public static void main(String[] args) throws Exception {

        // Admin admin = new Admin();
        // admin.principal();
        // admin.dashboard();
        // admin.painelADM();

        Sitio site = Login.login("user", "12345");
        site.dashboard();
        site.painelADM();
        site.principal();

    }
}
