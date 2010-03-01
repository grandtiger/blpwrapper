import junit.framework.*;
import org.findata.blpwrapper.*;

public class IntradayBarResultTest extends TestCase {
  private Connection conn;

  public void setUp() throws Exception{
    conn = new Connection();
    conn.connect();
  }

  public void tearDown() throws Exception{
    conn.close();
  }

  public void testBarData() throws Exception {
    String security = "C US Equity";
    String field = "TRADE";

    DataResult result = conn.bar(security, field, "2010-03-01 15:00:00.000", "2010-03-01 17:00:00.000", "15");
    System.out.println(result.getData()[0][0]);
    System.out.println(result.getData()[0][1]);
    System.out.println(result.getData()[0][2]);
  }
}

